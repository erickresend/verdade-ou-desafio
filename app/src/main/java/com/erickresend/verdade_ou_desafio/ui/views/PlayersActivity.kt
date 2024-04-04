package com.erickresend.verdade_ou_desafio.ui.views

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.erickresend.verdade_ou_desafio.databinding.ActivityPlayersBinding
import com.erickresend.verdade_ou_desafio.database.models.PlayerModel
import com.erickresend.verdade_ou_desafio.ui.adapters.PlayerAdapter
import com.erickresend.verdade_ou_desafio.ui.viewmodels.PlayerViewModel
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class PlayersActivity : AppCompatActivity(), PlayerAdapter.OnItemClick {

    private lateinit var binding : ActivityPlayersBinding
    private val adapter = PlayerAdapter(this)
    private lateinit var playerViewModel: PlayerViewModel

    private lateinit var bannerAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this) {}
        bannerAdView = binding.adView
        val bannerRequest = AdRequest.Builder().build()
        bannerAdView.loadAd(bannerRequest)

        binding.recyclerviewPlayer.adapter = adapter
        playerViewModel = ViewModelProvider(this)[PlayerViewModel::class.java]

        playerViewModel.getAllPlayers.observe(this, Observer {
            adapter.setPlayerList(it)
        })
    }

    override fun onResume() {
        super.onResume()

        binding.btnNewPlayer.setOnClickListener {
            startActivity(Intent(this, NewPlayerActivity::class.java))
        }

        binding.btnPlayGame.setOnClickListener {
            val size = playerViewModel.getAllPlayers.value?.size

            if (size != null) {
                if(size < 2) {
                    Toast.makeText(this, "Precisa ter no mínimo dois jogadores", Toast.LENGTH_SHORT).show()
                } else {
                    startActivity(Intent(this, ModeActivity::class.java))
                }
            }
        }
    }

    override fun onClick(player: PlayerModel) {
        val intent = Intent(this, EditPlayerActivity::class.java)
        intent.putExtra("playerId", player.id)
        intent.putExtra("playerName", player.name)
        intent.putExtra("playerSex", player.sex)
        startActivity(intent)
    }
}