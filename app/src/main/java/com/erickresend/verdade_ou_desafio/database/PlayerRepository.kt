package com.erickresend.verdade_ou_desafio.database

import android.content.Context
import androidx.lifecycle.LiveData
import com.erickresend.verdade_ou_desafio.models.PlayerModel

class PlayerRepository(private val playerDao: PlayerDao) {

    val readAllData: LiveData<List<PlayerModel>> = playerDao.getAllPlayers()

    //private var playerDatabase = PlayerDatabase.getDatabase(context).playerDao()

    suspend fun insertPlayer(player: PlayerModel) {
        playerDao.insertPlayer(player)
    }

    /*fun updatePlayer(player: PlayerModel): Boolean {
        return playerDatabase.updatePlayer(player) > 0
    }

    fun getPlayer(id: Int): PlayerModel {
        return playerDatabase.getPlayer(id)
    }

    fun deletePlayer(id: Int) {
        val player = getPlayer(id)
        return playerDatabase.deletePlayer(player)
    }

    fun getAllPlayers(): List<PlayerModel> {
        return playerDatabase.getAllPlayers()
    }*/
}