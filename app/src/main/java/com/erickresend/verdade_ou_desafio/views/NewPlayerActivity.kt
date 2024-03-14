package com.erickresend.verdade_ou_desafio.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.erickresend.verdade_ou_desafio.databinding.ActivityNewPlayerBinding
import com.erickresend.verdade_ou_desafio.datas.DataSourcePlayer
import com.erickresend.verdade_ou_desafio.models.PlayerModel
import com.erickresend.verdade_ou_desafio.recylerview.PlayerAdapter

class NewPlayerActivity : AppCompatActivity() {

    private lateinit var binding : ActivityNewPlayerBinding
    private val adapter = PlayerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        binding.btnNewPlayer.setOnClickListener {
            DataSourcePlayer.addPlayer(binding.editNewPlayer.text.toString())
        }

        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}