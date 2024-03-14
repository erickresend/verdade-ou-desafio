package com.erickresend.verdade_ou_desafio.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.erickresend.verdade_ou_desafio.models.PlayerModel

@Dao
interface PlayerDao {

    @Insert
    suspend fun insertPlayer(player: PlayerModel)

    @Update
    fun updatePlayer(player: PlayerModel)

    @Delete
    fun deletePlayer(player: PlayerModel)

    @Query("SELECT * FROM player WHERE id = :id")
    fun getPlayer(id: Int): PlayerModel

    @Query("SELECT * FROM player")
    fun getAllPlayers(): LiveData<List<PlayerModel>>
}