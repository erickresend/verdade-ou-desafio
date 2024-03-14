package com.erickresend.verdade_ou_desafio.views

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.erickresend.verdade_ou_desafio.database.PlayerRepository
import com.erickresend.verdade_ou_desafio.databinding.ActivityNewPlayerBinding
import com.erickresend.verdade_ou_desafio.models.PlayerModel
import com.erickresend.verdade_ou_desafio.viewmodels.PlayerViewModel

class NewPlayerActivity : AppCompatActivity() {

    private lateinit var binding : ActivityNewPlayerBinding
    private lateinit var playerViewModel: PlayerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        playerViewModel = ViewModelProvider(this).get(PlayerViewModel::class.java)

    }

    override fun onStart() {
        super.onStart()

        binding.btnNewPlayer.setOnClickListener {
            playerViewModel.insertPlayer(PlayerModel(binding.editNewPlayer.text.toString()))
            Toast.makeText(this, "Sucesso", Toast.LENGTH_SHORT).show()
        }

        /*binding.btnNewPlayer.setOnClickListener {
            DataSourcePlayer.addPlayer(binding.editNewPlayer.text.toString())
        }*/

        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}