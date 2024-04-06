package com.erickresend.verdade_ou_desafio.ui.views

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.erickresend.verdade_ou_desafio.database.models.PlayerModel
import com.erickresend.verdade_ou_desafio.databinding.ActivityChoiceBinding
import com.erickresend.verdade_ou_desafio.service.Constants
import com.erickresend.verdade_ou_desafio.ui.viewmodels.PlayerViewModel
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import kotlin.random.Random

class ChoiceActivity : AppCompatActivity() {

    private lateinit var binding : ActivityChoiceBinding
    private lateinit var playerViewModel : PlayerViewModel

    private var contPlayer = -1
    private var contTrue = mutableListOf<Int>()
    private var contChallenge = mutableListOf<Int>()

    private lateinit var bannerAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this) {}
        bannerAdView = binding.adView
        val bannerRequest = AdRequest.Builder().build()
        bannerAdView.loadAd(bannerRequest)

        playerViewModel = ViewModelProvider(this)[PlayerViewModel::class.java]

    }

    override fun onResume() {
        super.onResume()

        // Contador pra saber o player da vez
        contPlayer++

        // Mostrando o player da vez
        binding.textPlayer.text = contPlayer.toString()

        val allPlayers = playerViewModel.getAllPlayers

        allPlayers.observe(this) { player ->

            // Adicionando os contadores aos players
            var cont = 0
            while (contTrue.size < player.size) {
                contTrue.add(cont, 3)
                contChallenge.add(cont, 1)
                cont++
            }

            // Mudar o nome do jogador da vez
            if(contPlayer == player.size) {
                contPlayer = 0
                binding.textPlayer.text = player.get(contPlayer).name
                // Mostrando a quantidade de verdade e desafio que o jogador da vez tem
                binding.textContTrue.text = contTrue.get(contPlayer).toString()
                binding.textContChallenge.text = contChallenge.get(contPlayer).toString()
            } else {
                binding.textPlayer.text = player.get(contPlayer).name
                binding.textContTrue.text = contTrue.get(contPlayer).toString()
                binding.textContChallenge.text = contChallenge.get(contPlayer).toString()
            }

            val mode = intent.getStringExtra("mode")

            binding.btnTrue.setOnClickListener {

                var availableTruths = contTrue.get(contPlayer)

                if(availableTruths > 0) {
                    availableTruths--
                    contTrue.set(contPlayer, availableTruths)

                    val intent = Intent(this, ResponseActivity::class.java)

                    if(mode == "soft") {
                        intent.putExtra("choice", "softTrue")

                    } else if(mode == "hot") {
                        intent.putExtra("choice", "hotTrue")
                    }

                    if((contTrue.get(contPlayer) == 0) && (contChallenge.get(contPlayer) == 0)) {
                        contTrue.set(contPlayer, 3)
                        contChallenge.set(contPlayer, 1)
                    }

                    dataToResponse(player, intent)

                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Você já usou suas 3 verdades, escolha desafio" , Toast.LENGTH_SHORT).show()
                }
            }

            binding.btnChallenge.setOnClickListener {

                var availableChallenges = contChallenge.get(contPlayer)

                if(availableChallenges > 0) {
                    availableChallenges--
                    contChallenge.set(contPlayer, availableChallenges)

                    val intent = Intent(this, ResponseActivity::class.java)
                    if(mode == "soft") {
                        intent.putExtra("choice", "softChallenge")

                    } else if(mode == "hot") {
                        intent.putExtra("choice", "hotChallenge")
                    }
                    // Resetar os contadores
                    if((contTrue.get(contPlayer) == 0) && (contChallenge.get(contPlayer) == 0)) {
                        contTrue.set(contPlayer, 3)
                        contChallenge.set(contPlayer, 1)
                    }

                    dataToResponse(player, intent)

                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Você já usou seu desafio, escolha verdade" , Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.btnClose.setOnClickListener {
            finish()
        }
    }

    private fun dataToResponse(player: List<PlayerModel>, intent: Intent) {
        intent.putExtra("playerName", player[contPlayer].name)
        intent.putExtra("playerSex", player[contPlayer].sex)

        var randomName = player[Random.nextInt(player.size)].name
        while (randomName == player[contPlayer].name) {
            randomName = player[Random.nextInt(player.size)].name
        }
        intent.putExtra("bothPlayer", randomName)

        var malePlayer = player[Random.nextInt(player.size)]

        var cont = 0
        while (malePlayer.sex != Constants.SEX.BOY) {
            malePlayer = player[Random.nextInt(player.size)]
            cont++
            if(cont == player.size){
                return
            }
        }
        intent.putExtra("malePlayer", malePlayer.name)

        cont = 0
        var femalePlayer = player[Random.nextInt(player.size)]
        while (femalePlayer.sex != Constants.SEX.GIRL) {
            femalePlayer = player[Random.nextInt(player.size)]
            cont++
            if(cont == player.size){
                return
            }
        }
        intent.putExtra("femalePlayer", femalePlayer.name)
    }
}

/*class ChoiceActivity : AppCompatActivity() {

    private lateinit var binding : ActivityChoiceBinding
    private lateinit var playerViewModel : PlayerViewModel

    private var contPlayer = -1
    private var contTrue = mutableListOf<Int>()
    private var contChallenge = mutableListOf<Int>()
    private lateinit var allPlayers: List<PlayerModel>

    private lateinit var bannerAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this) {}
        bannerAdView = binding.adView
        val bannerRequest = AdRequest.Builder().build()
        bannerAdView.loadAd(bannerRequest)

        playerViewModel = ViewModelProvider(this)[PlayerViewModel::class.java]


    }

    override fun onResume() {
        super.onResume()

        allPlayers = playerViewModel.getAllPlayers.value!!

        // Adicionando os contadores aos players
        var cont = 0
        while (contTrue.size < allPlayers.size) {
            contTrue.add(cont, 3)
            contChallenge.add(cont, 1)
            cont++
        }

        // Contador pra saber o player da vez
        contPlayer++

        // Mostrando o player da vez
        binding.textPlayer.text = allPlayers[contPlayer].name

        // Mudar o nome do jogador da vez
        if(contPlayer == allPlayers.size) {
            contPlayer = 0
            binding.textPlayer.text = allPlayers[contPlayer].name
            // Mostrando a quantidade de verdade e desafio que o jogador da vez tem
            binding.textContTrue.text = contTrue[contPlayer].toString()
            binding.textContChallenge.text = contChallenge[contPlayer].toString()
        } else {
            binding.textPlayer.text = allPlayers[contPlayer].name
            binding.textContTrue.text = contTrue[contPlayer].toString()
            binding.textContChallenge.text = contChallenge[contPlayer].toString()
        }

        val mode = intent.getStringExtra("mode")

        binding.btnTrue.setOnClickListener {

            var availableTruths = contTrue[contPlayer]

            if(availableTruths > 0) {
                availableTruths--
                contTrue[contPlayer] = availableTruths

                val intent = Intent(this, ResponseActivity::class.java)
                if(mode == "soft") {
                    intent.putExtra("choice", "softTrue")

                } else if(mode == "hot") {
                    intent.putExtra("choice", "hotTrue")
                }

                if((contTrue[contPlayer] == 0) && (contChallenge[contPlayer] == 0)) {
                    contTrue[contPlayer] = 3
                    contChallenge[contPlayer] = 1
                }

                startActivity(intent)
            } else {
                Toast.makeText(this, "Você já usou suas 3 verdades, escolha desafio" , Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnChallenge.setOnClickListener {

            var availableChallenges = contChallenge[contPlayer]

            if(availableChallenges > 0) {
                availableChallenges--
                contChallenge[contPlayer] = availableChallenges

                val intent = Intent(this, ResponseActivity::class.java)
                if(mode == "soft") {
                    intent.putExtra("choice", "softChallenge")

                } else if(mode == "hot") {
                    intent.putExtra("choice", "hotChallenge")
                }
                // Resetar os contadores
                if((contTrue[contPlayer] == 0) && (contChallenge[contPlayer] == 0)) {
                    contTrue[contPlayer] = 3
                    contChallenge[contPlayer] = 1
                }

                startActivity(intent)
            } else {
                Toast.makeText(this, "Você já usou seu desafio, escolha verdade" , Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnClose.setOnClickListener {
            finish()
        }
    }
}*/