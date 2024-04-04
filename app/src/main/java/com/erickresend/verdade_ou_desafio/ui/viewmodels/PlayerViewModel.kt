package com.erickresend.verdade_ou_desafio.ui.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.erickresend.verdade_ou_desafio.database.PlayerDatabase
import com.erickresend.verdade_ou_desafio.repositories.PlayerRepository
import com.erickresend.verdade_ou_desafio.database.models.PlayerModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PlayerViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = PlayerRepository(application.applicationContext)
    val getAllPlayers = repository.getAllPlayers

    fun insertPlayer(player: PlayerModel) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertPlayer(player)
        }
    }

    fun updatePlayer(id: Int, name: String, sex: String) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updatePlayer(id, name, sex)
        }
    }

    fun deletePlayer(id: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deletePlayer(id)
        }
    }
}