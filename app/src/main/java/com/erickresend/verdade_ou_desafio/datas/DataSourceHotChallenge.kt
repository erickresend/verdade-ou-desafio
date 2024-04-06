package com.erickresend.verdade_ou_desafio.datas

import com.erickresend.verdade_ou_desafio.database.models.ChallengeModel
import com.erickresend.verdade_ou_desafio.database.models.TruthModel
import com.erickresend.verdade_ou_desafio.service.Constants

class DataSourceHotChallenge {

    companion object {
        fun createDataSetHotChallenge(playerName: String?, playerSex: String?, bothPlayer: String?, malePlayer: String? = "", femalePlayer: String? = ""): ArrayList<ChallengeModel> {

            fun oppositeSex(): String {
                if(playerSex == Constants.SEX.BOY) {
                    return "a ${femalePlayer.toString()}"
                } else {
                    return "o ${malePlayer.toString()}"
                }
            }

            val list = ArrayList<ChallengeModel>()
            list.add(ChallengeModel("Imite a cara que você faz quando tem um orgasmo"))
            list.add(ChallengeModel("Tire a sua blusa e fiquei sem até o fim do jogo"))
            list.add(ChallengeModel("Escolha um participante para dar um tapa na sua bunda"))
            list.add(ChallengeModel("Imite sua posição sexual favorita"))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))
            list.add(ChallengeModel(""))

            if(malePlayer != "" && femalePlayer != "" ){
                list.add(ChallengeModel(""))
            }

            return list
        }
    }
}