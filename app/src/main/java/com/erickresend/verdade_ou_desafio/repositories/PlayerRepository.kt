package com.erickresend.verdade_ou_desafio.repositories

import androidx.lifecycle.LiveData
import com.erickresend.verdade_ou_desafio.database.daos.PlayerDao
import com.erickresend.verdade_ou_desafio.database.models.PlayerModel

class PlayerRepository(private val playerDao: PlayerDao) {

    val getAllPlayers: LiveData<List<PlayerModel>> = playerDao.getAllPlayers()

    suspend fun insertPlayer(player: PlayerModel) {
        playerDao.insertPlayer(player)
    }

    suspend fun updatePlayer(id: Int, name: String) {
        playerDao.updatePlayer(id, name)
    }

    suspend fun deletePlayer(id: Int) {
        playerDao.deletePlayer(id)
    }

    fun getPlayer(id: Int): PlayerModel {
        return playerDao.getPlayer(id)
    }
}