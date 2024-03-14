package com.erickresend.verdade_ou_desafio.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.erickresend.verdade_ou_desafio.R
import com.erickresend.verdade_ou_desafio.databinding.ActivityPlayersBinding
import com.erickresend.verdade_ou_desafio.datas.DataSourcePlayer
import com.erickresend.verdade_ou_desafio.models.PlayerModel
import com.erickresend.verdade_ou_desafio.recylerview.PlayerAdapter

class PlayersActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPlayersBinding
    private val adapter = PlayerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerviewPlayer.adapter = adapter

        adapter.setPlayerList(DataSourcePlayer.createDataSetPlayer())
    }

    override fun onResume() {
        super.onResume()

        adapter.setPlayerList(DataSourcePlayer.getAll())

        binding.btnNewPlayer.setOnClickListener {
            startActivity(Intent(this, NewPlayerActivity::class.java))
        }

        binding.btnPlayGame.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }




}