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

            fun oa(): String {
                if(playerSex == Constants.SEX.BOY) {
                    return "o"
                } else {
                    return "a"
                }
            }

            val list = ArrayList<ChallengeModel>()
            list.add(ChallengeModel("$playerName. Imite a cara que você faz quando tem um orgasmo"))
            list.add(ChallengeModel("$playerName. Imite sua posição sexual favorita"))
            list.add(ChallengeModel("$playerName. Mostre alguma tatuagem escondida se tiver"))

            list.add(ChallengeModel("$bothPlayer. Faça um desafio para $playerName"))
            list.add(ChallengeModel("$bothPlayer. Faça um desafio para $playerName"))
            list.add(ChallengeModel("$bothPlayer. Faça um desafio para $playerName"))
            list.add(ChallengeModel("$bothPlayer. Faça um desafio para $playerName"))
            list.add(ChallengeModel("$bothPlayer. Faça um desafio para $playerName"))
            list.add(ChallengeModel("$bothPlayer. Escolha uma peça de roupa para $playerName tirar"))
            list.add(ChallengeModel("$bothPlayer. Escolha uma peça de roupa para $playerName tirar"))
            list.add(ChallengeModel("$bothPlayer. Escolha uma peça de roupa para $playerName tirar"))
            list.add(ChallengeModel("$bothPlayer. Escolha uma peça de roupa para $playerName tirar"))
            list.add(ChallengeModel("$bothPlayer. Escolha uma peça de roupa para $playerName tirar"))

            if(malePlayer != "" && femalePlayer != "" ){
                list.add(ChallengeModel("$playerName. Fique 4 dedos de distância do rosto de ${oppositeSex()} olhando em seus olhos por 30 segundos"))
                list.add(ChallengeModel("${oppositeSex()}. Dê um tapa na bunda de $playerName"))
                list.add(ChallengeModel("${oppositeSex()}. Mergulhe o dedo na bebida e desenhe um coração na barriga de $playerName deitado"))
                list.add(ChallengeModel("$playerName. Beije o pescoço de ${oppositeSex()} lentamente"))
                list.add(ChallengeModel("$playerName. Beije o queixo de ${oppositeSex()}"))
                list.add(ChallengeModel("$playerName. Beije a bochecha de ${oppositeSex()} 2x de cada lado"))
                list.add(ChallengeModel("$playerName. Beije o nariz de ${oppositeSex()}"))
            }

            if (playerSex == Constants.SEX.BOY) {
            }

            if (playerSex == Constants.SEX.GIRL) {
                list.add(ChallengeModel("$playerName. Arranhe devagar e lentamente as costas de ${oppositeSex()}"))
                list.add(ChallengeModel("$playerName. Sente no colo de ${oppositeSex()} e fique até a sua próxima vez"))
            }

            return list
        }
    }
}