package com.erickresend.verdade_ou_desafio.repository

import androidx.lifecycle.LiveData
import com.erickresend.verdade_ou_desafio.database.PlayerDao
import com.erickresend.verdade_ou_desafio.model.PlayerModel

class PlayerRepository(private val playerDao: PlayerDao) {

    val getAllPlayers: LiveData<List<PlayerModel>> = playerDao.getAllPlayers()

    //private var playerDatabase = PlayerDatabase.getDatabase(context).playerDao()

    suspend fun insertPlayer(player: PlayerModel) {
        playerDao.insertPlayer(player)
    }
}