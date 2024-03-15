package com.erickresend.verdade_ou_desafio.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.erickresend.verdade_ou_desafio.databinding.ActivityPlayersBinding
import com.erickresend.verdade_ou_desafio.model.PlayerModel
import com.erickresend.verdade_ou_desafio.recylerview.PlayerAdapter
import com.erickresend.verdade_ou_desafio.viewmodel.PlayerViewModel

class PlayersActivity : AppCompatActivity(), PlayerAdapter.OnItemClick {

    private lateinit var binding : ActivityPlayersBinding
    private val adapter = PlayerAdapter(this)
    private lateinit var adapater: PlayerAdapter
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
        startActivity(Intent(this, NewPlayerActivity::class.java))
    }
}