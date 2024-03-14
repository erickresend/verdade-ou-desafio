package com.erickresend.verdade_ou_desafio.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.erickresend.verdade_ou_desafio.database.PlayerDatabase
import com.erickresend.verdade_ou_desafio.database.PlayerRepository
import com.erickresend.verdade_ou_desafio.models.PlayerModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PlayerViewModel(application: Application) : AndroidViewModel(application) {

    val readAllData: LiveData<List<PlayerModel>>
    private val repository: PlayerRepository

    init {
        val playerDao = PlayerDatabase.getDatabase(application).playerDao()
        repository = PlayerRepository(playerDao)
        readAllData = repository.readAllData
    }

    fun insertPlayer(player: PlayerModel) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertPlayer(player)
        }
    }
}