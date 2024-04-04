package com.erickresend.verdade_ou_desafio.repositories

import android.content.Context
import com.erickresend.verdade_ou_desafio.database.PlayerDatabase
import com.erickresend.verdade_ou_desafio.database.models.PlayerModel

class PlayerRepository(context: Context) {

    private val playerDatabase = PlayerDatabase.getDatabase(context).playerDao()
    val getAllPlayers = playerDatabase.getAllPlayers()

    suspend fun insertPlayer(player: PlayerModel) {
        playerDatabase.insertPlayer(player)
    }

    suspend fun updatePlayer(id: Int, name: String, sex: String) {
        playerDatabase.updatePlayer(id, name, sex)
    }

    suspend fun deletePlayer(id: Int) {
        playerDatabase.deletePlayer(id)
    }
}