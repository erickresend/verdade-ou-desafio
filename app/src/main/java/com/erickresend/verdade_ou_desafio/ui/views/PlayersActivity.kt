package com.erickresend.verdade_ou_desafio.ui.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.erickresend.verdade_ou_desafio.databinding.ActivityPlayersBinding
import com.erickresend.verdade_ou_desafio.database.models.PlayerModel
import com.erickresend.verdade_ou_desafio.ui.adapters.PlayerAdapter
import com.erickresend.verdade_ou_desafio.ui.viewmodels.PlayerViewModel

class PlayersActivity : AppCompatActivity(), PlayerAdapter.OnItemClick {

    private lateinit var binding : ActivityPlayersBinding
    private val adapter = PlayerAdapter(this)
    private lateinit var playerViewModel: PlayerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerviewPlayer.adapter = adapter
        playerViewModel = ViewModelProvider(this).get(PlayerViewModel::class.java)

        playerViewModel.getAllPlayers.observe(this, Observer { player ->
            adapter.setPlayerList(player)
        })
    }

    override fun onResume() {
        super.onResume()

        binding.btnNewPlayer.setOnClickListener {
            startActivity(Intent(this, NewPlayerActivity::class.java))
        }

        binding.btnPlayGame.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    override fun onClick(player: PlayerModel) {
        val intent = Intent(this, EditPlayerActivity::class.java)
        intent.putExtra("playerId", player.id)
        intent.putExtra("playerName", player.name)
        startActivity(intent)
    }
}