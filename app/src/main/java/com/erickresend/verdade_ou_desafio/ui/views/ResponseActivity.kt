package com.erickresend.verdade_ou_desafio.ui.views

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.erickresend.verdade_ou_desafio.datas.DataSourceSoftChallenge
import com.erickresend.verdade_ou_desafio.datas.DataSourceSoftTruth
import com.erickresend.verdade_ou_desafio.databinding.ActivityResponseBinding
import com.erickresend.verdade_ou_desafio.datas.DataSourceHotChallenge
import com.erickresend.verdade_ou_desafio.datas.DataSourceHotTruth
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlin.random.Random

class ResponseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResponseBinding

    lateinit var bannerAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResponseBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        if(choice == "softTrue") {
            val dataSource = DataSourceSoftTruth.createDataSetSoftTruth()
            val randomIndex = Random.nextInt(dataSource.size)
            val randomElement = dataSource[randomIndex]
            return randomElement.title
        } else if(choice == "softChallenge") {
            val dataSource = DataSourceSoftChallenge.createDataSetSoftChallenge()
            val randomIndex = Random.nextInt(dataSource.size)
            val randomElement = dataSource[randomIndex]
            return randomElement.title
        } else if(choice == "hotTrue") {
            val dataSource = DataSourceHotTruth.createDataSetHotTruth()
            val randomIndex = Random.nextInt(dataSource.size)
            val randomElement = dataSource[randomIndex]
            return randomElement.title
        } else {
            val dataSource = DataSourceHotChallenge.createDataSetHotChallenge()
            val randomIndex = Random.nextInt(dataSource.size)
            val randomElement = dataSource[randomIndex]
            return randomElement.title
        }
    }
}