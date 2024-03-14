package com.erickresend.verdade_ou_desafio.datas

import com.erickresend.verdade_ou_desafio.models.ChallengeModel
import com.erickresend.verdade_ou_desafio.models.PlayerModel

class DataSourcePlayer {

    companion object {

        private val listPlayer= ArrayList<PlayerModel>()

        fun addPlayer(player: String) {
            listPlayer.add(PlayerModel(player))
        }

        fun getAll(): List<PlayerModel> {
            return listPlayer
        }

        fun removePlayer(position: Int) {
            listPlayer.removeAt(position)
        }

        fun createDataSetPlayer(): ArrayList<PlayerModel> {
            listPlayer.add(PlayerModel("Fulano"))
            listPlayer.add(PlayerModel("Ciclano"))
            listPlayer.add(PlayerModel("Beltrano"))
            listPlayer.add(PlayerModel("Maria"))
            listPlayer.add(PlayerModel("Joana"))

            return listPlayer
        }
    }
}