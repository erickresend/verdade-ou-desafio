package com.erickresend.verdade_ou_desafio.ui.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.erickresend.verdade_ou_desafio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        binding.btnTrue.setOnClickListener {
            val intent = Intent(this, ResponseActivity::class.java)
            intent.putExtra("choice", "0")
            startActivity(intent)
        }

        binding.btnChallenge.setOnClickListener {
            val intent = Intent(this, ResponseActivity::class.java)
            intent.putExtra("choice", "1")
            startActivity(intent)
        }

        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}