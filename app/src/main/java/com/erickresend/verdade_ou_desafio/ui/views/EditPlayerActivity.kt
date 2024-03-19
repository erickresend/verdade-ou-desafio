package com.erickresend.verdade_ou_desafio.ui.views

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.erickresend.verdade_ou_desafio.databinding.ActivityEditPlayerBinding
import com.erickresend.verdade_ou_desafio.database.models.PlayerModel
import com.erickresend.verdade_ou_desafio.ui.viewmodels.PlayerViewModel

class EditPlayerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditPlayerBinding
    private lateinit var playerViewModel: PlayerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        playerViewModel = ViewModelProvider(this).get(PlayerViewModel::class.java)
    }

    override fun onStart() {
        super.onStart()

        val playerId = intent.extras?.getInt("playerId")
        val playerName = intent.extras?.getString("playerName")

        binding.editEditPlayer.setText(playerName)


        binding.btnSave.setOnClickListener {
            val playerNameEdited = binding.editEditPlayer.text.toString()
            if (playerNameEdited.isNotBlank() && playerNameEdited.isNotEmpty() && playerId != null) {
                playerViewModel.updatePlayer(playerId, playerNameEdited)
                Toast.makeText(this, "Player editado com sucesso", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Digite o nome do jogador", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnDeletePlayer.setOnClickListener {
            if (playerId != null) {
                playerViewModel.deletePlayer(playerId)
                Toast.makeText(this, "Jogador deletado com sucesso", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}