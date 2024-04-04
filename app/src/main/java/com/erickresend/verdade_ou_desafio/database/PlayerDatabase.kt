package com.erickresend.verdade_ou_desafio.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.erickresend.verdade_ou_desafio.database.daos.PlayerDao
import com.erickresend.verdade_ou_desafio.database.models.PlayerModel

@Database(entities = [PlayerModel::class], version = 1, exportSchema = false)
abstract class PlayerDatabase: RoomDatabase() {

    abstract fun playerDao(): PlayerDao

    /*companion object {
        @Volatile
        private var INSTANCE: PlayerDatabase? = null

        fun getDatabase(context: Context): PlayerDatabase {
            val tempInstance = INSTANCE
            if(tempInstance != null) {
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PlayerDatabase::class.java,
                    "player"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }*/

    companion object {
        private lateinit var INSTANCE: PlayerDatabase

        fun getDatabase(context: Context): PlayerDatabase {
            if (!Companion::INSTANCE.isInitialized) {
                synchronized(PlayerDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context, PlayerDatabase::class.java, "playerdb")
                        .addMigrations(MIGRATION_1_2)
                        .allowMainThreadQueries()
                        .build()
                }
            }
            return INSTANCE
        }

        private val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("DELETE FROM player")
            }

        }
    }
}