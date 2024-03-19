package com.erickresend.verdade_ou_desafio.database.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.erickresend.verdade_ou_desafio.database.models.PlayerModel

@Dao
interface PlayerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPlayer(player: PlayerModel)

    @Query("UPDATE player SET name = :name WHERE id = :id")
    suspend fun updatePlayer(id: Int, name: String)

    @Query("DELETE FROM player WHERE id = :id")
    suspend fun deletePlayer(id: Int)

    @Query("SELECT * FROM player WHERE id = :id")
    fun getPlayer(id: Int): PlayerModel

    @Query("SELECT * FROM player")
    fun getAllPlayers(): LiveData<List<PlayerModel>>
}