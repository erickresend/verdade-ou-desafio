package com.erickresend.verdade_ou_desafio.ui.views

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.erickresend.verdade_ou_desafio.R
import com.erickresend.verdade_ou_desafio.databinding.ActivityChoiceBinding
import com.erickresend.verdade_ou_desafio.databinding.ActivityModeBinding

class ModeActivity : AppCompatActivity() {

    private lateinit var binding : ActivityModeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityModeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        binding.btnSoftMode.setOnClickListener {
            val intent = Intent(this, ChoiceActivity::class.java)
            intent.putExtra("mode", "soft")
            startActivity(intent)
        }

        binding.btnHotMode.setOnClickListener {
            val intent = Intent(this, ChoiceActivity::class.java)
            intent.putExtra("mode", "hot")
            startActivity(intent)
        }

        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}