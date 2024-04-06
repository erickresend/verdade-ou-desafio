package com.erickresend.verdade_ou_desafio.ui.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.erickresend.verdade_ou_desafio.database.models.TruthModel
import com.erickresend.verdade_ou_desafio.datas.DataSourceSoftChallenge
import com.erickresend.verdade_ou_desafio.datas.DataSourceSoftTruth
import com.erickresend.verdade_ou_desafio.databinding.ActivityResponseBinding
import com.erickresend.verdade_ou_desafio.datas.DataSourceHotChallenge
import com.erickresend.verdade_ou_desafio.datas.DataSourceHotTruth
import com.erickresend.verdade_ou_desafio.ui.viewmodels.PlayerViewModel
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlin.random.Random

class ResponseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResponseBinding
    private lateinit var playerViewModel: PlayerViewModel

    private lateinit var bannerAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResponseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        playerViewModel = ViewModelProvider(this)[PlayerViewModel::class.java]

        MobileAds.initialize(this) {}
        bannerAdView = binding.adView
        val bannerRequest = AdRequest.Builder().build()
        bannerAdView.loadAd(bannerRequest)
    }

    override fun onStart() {
        super.onStart()

        binding.textResponse.text = choiceResponse()

        binding.btnClose.setOnClickListener {
            finish()
        }
    }

    private fun choiceResponse(): String {
        val choice = intent.getStringExtra("choice")
        val playerName = intent.getStringExtra("playerName")
        val playerSex = intent.getStringExtra("playerSex")
        val bothPlayer = intent.getStringExtra("bothPlayer")
        val malePlayer = intent.getStringExtra("malePlayer")
        val femalePlayer = intent.getStringExtra("femalePlayer")

        if(choice == "softTrue") {
            var dataSource: ArrayList<TruthModel>
            if(malePlayer == null || femalePlayer == null) {
                dataSource = DataSourceSoftTruth.createDataSetSoftTruth(playerName, playerSex, bothPlayer)
            } else {
                dataSource = DataSourceSoftTruth.createDataSetSoftTruth(playerName, playerSex, bothPlayer, malePlayer, femalePlayer)
            }
            val randomIndex = Random.nextInt(dataSource.size)
            val randomElement = dataSource[randomIndex]
            return randomElement.title
        } else if(choice == "softChallenge") {
            val dataSource = DataSourceSoftChallenge.createDataSetSoftChallenge(playerName, playerSex, bothPlayer, malePlayer, femalePlayer)
            val randomIndex = Random.nextInt(dataSource.size)
            val randomElement = dataSource[randomIndex]
            return randomElement.title
        } else if(choice == "hotTrue") {
            val dataSource = DataSourceHotTruth.createDataSetHotTruth(playerName, playerSex, bothPlayer, malePlayer, femalePlayer)
            val randomIndex = Random.nextInt(dataSource.size)
            val randomElement = dataSource[randomIndex]
            return randomElement.title
        } else {
            val dataSource = DataSourceHotChallenge.createDataSetHotChallenge(playerName, playerSex, bothPlayer, malePlayer, femalePlayer)
            val randomIndex = Random.nextInt(dataSource.size)
            val randomElement = dataSource[randomIndex]
            return randomElement.title
        }
    }
}