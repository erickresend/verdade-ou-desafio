package com.erickresend.verdade_ou_desafio.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.erickresend.verdade_ou_desafio.datas.DataSourceChallenge
import com.erickresend.verdade_ou_desafio.datas.DataSourceTruth
import com.erickresend.verdade_ou_desafio.databinding.ActivityResponseBinding
import kotlin.random.Random

class ResponseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResponseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResponseBinding.inflate(layoutInflater)
        setContentView(binding.root)
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

        if(choice == "0") {
            val dataSource = DataSourceTruth.createDataSetTruth()
            val randomIndex = Random.nextInt(dataSource.size)
            val randomElement = dataSource[randomIndex]
            return randomElement.title
        } else {
            val dataSource = DataSourceChallenge.createDataSetChallenge()
            val randomIndex = Random.nextInt(dataSource.size)
            val randomElement = dataSource[randomIndex]
            return randomElement.title
        }
    }
}