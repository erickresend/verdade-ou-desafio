package com.erickresend.verdade_ou_desafio.ui.views

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.erickresend.verdade_ou_desafio.databinding.ActivityNewPlayerBinding
import com.erickresend.verdade_ou_desafio.database.models.PlayerModel
import com.erickresend.verdade_ou_desafio.service.Constants
import com.erickresend.verdade_ou_desafio.ui.viewmodels.PlayerViewModel
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class NewPlayerActivity : AppCompatActivity() {

    private lateinit var binding : ActivityNewPlayerBinding
    private lateinit var playerViewModel: PlayerViewModel

    private lateinit var bannerAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this) {}
        bannerAdView = binding.adView
        val bannerRequest = AdRequest.Builder().build()
        bannerAdView.loadAd(bannerRequest)

        playerViewModel = ViewModelProvider(this)[PlayerViewModel::class.java]

    }

    override fun onStart() {
        super.onStart()

        binding.btnNewPlayer.setOnClickListener {
            val playerName = binding.editNewPlayer.text.toString()
            val playerSex: String

            if(binding.btnBoy.isChecked) {
                playerSex = Constants.SEX.BOY
            } else {
                playerSex = Constants.SEX.GIRL
            }
            if(playerName.isNotEmpty() && playerName.isNotBlank()) {
                playerViewModel.insertPlayer(PlayerModel(playerName, playerSex))
                finish()
            } else {
                Toast.makeText(this, "Digite o nome do jogador", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnBoy.setOnClickListener {
            binding.btnBoy.isChecked = true
        }

        binding.btnGirl.setOnClickListener {
            binding.btnGirl.isChecked = true
        }

        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}