package com.erickresend.verdade_ou_desafio.ui.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.erickresend.verdade_ou_desafio.databinding.ActivityChoiceBinding
import com.erickresend.verdade_ou_desafio.ui.viewmodels.PlayerViewModel

class ChoiceActivity : AppCompatActivity() {

    private lateinit var binding : ActivityChoiceBinding
    private lateinit var playerViewModel : PlayerViewModel

    private var cont = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        playerViewModel = ViewModelProvider(this).get(PlayerViewModel::class.java)
    }

    override fun onResume() {
        super.onResume()

        val allPlayers = playerViewModel.getAllPlayers
        cont++

        binding.textPlayer.text = cont.toString()

        allPlayers.observe(this) { player ->
            val size = player.size

            if(cont == size) {
                cont = 0
                binding.textPlayer.text = player.get(cont).name
            } else {
                binding.textPlayer.text = player.get(cont).name
            }
        }

        val mode = intent.getStringExtra("mode")

        binding.btnTrue.setOnClickListener {
            val intent = Intent(this, ResponseActivity::class.java)
            if(mode == "soft") {
                intent.putExtra("choice", "softTrue")

            } else if(mode == "hot") {
                intent.putExtra("choice", "hotTrue")
            }
            startActivity(intent)
        }

        binding.btnChallenge.setOnClickListener {
            val intent = Intent(this, ResponseActivity::class.java)
            if(mode == "soft") {
                intent.putExtra("choice", "softChallenge")

            } else if(mode == "hot") {
                intent.putExtra("choice", "hotChallenge")
            }
            startActivity(intent)
        }

        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}