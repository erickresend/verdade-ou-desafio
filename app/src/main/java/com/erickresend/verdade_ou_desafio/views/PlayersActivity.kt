package com.erickresend.verdade_ou_desafio.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.erickresend.verdade_ou_desafio.database.PlayerRepository
import com.erickresend.verdade_ou_desafio.databinding.ActivityPlayersBinding
import com.erickresend.verdade_ou_desafio.recylerview.PlayerAdapter
import com.erickresend.verdade_ou_desafio.viewmodels.PlayerViewModel

class PlayersActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPlayersBinding
    private val adapter = PlayerAdapter()
    private lateinit var playerViewModel: PlayerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerviewPlayer.adapter = adapter
        playerViewModel = ViewModelProvider(this).get(PlayerViewModel::class.java)

        playerViewModel.readAllData.observe(this, Observer { player ->
            adapter.setPlayerList(player)
        })

        //adapter.setPlayerList(playerRepository.getAllPlayers())
    }

    override fun onResume() {
        super.onResume()

        //adapter.setPlayerList(DataSourcePlayer.getAll())

        binding.btnNewPlayer.setOnClickListener {
            startActivity(Intent(this, NewPlayerActivity::class.java))
        }

        binding.btnPlayGame.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}