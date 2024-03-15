package com.erickresend.verdade_ou_desafio.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.erickresend.verdade_ou_desafio.R
import com.erickresend.verdade_ou_desafio.databinding.ActivityEditPlayerBinding

class EditPlayerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditPlayerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}