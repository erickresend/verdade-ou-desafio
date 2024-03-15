package com.erickresend.verdade_ou_desafio.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.erickresend.verdade_ou_desafio.database.PlayerDatabase
import com.erickresend.verdade_ou_desafio.repository.PlayerRepository
import com.erickresend.verdade_ou_desafio.model.PlayerModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PlayerViewModel(application: Application) : AndroidViewModel(application) {

    val getAllPlayers: LiveData<List<PlayerModel>>
    private val repository: PlayerRepository

    init {
        val playerDao = PlayerDatabase.getDatabase(application).playerDao()
        repository = PlayerRepository(playerDao)
        getAllPlayers = repository.getAllPlayers
    }

    fun insertPlayer(player: PlayerModel) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertPlayer(player)
        }
    }
}