package com.erickresend.verdade_ou_desafio.datas

import com.erickresend.verdade_ou_desafio.database.models.ChallengeModel
import com.erickresend.verdade_ou_desafio.database.models.TruthModel
import com.erickresend.verdade_ou_desafio.service.Constants

class DataSourceHotTruth {

    companion object {
        fun createDataSetHotTruth(playerName: String?, playerSex: String?, bothPlayer: String?, malePlayer: String? = "", femalePlayer: String? = ""): ArrayList<TruthModel> {

            fun oppositeSex(): String {
                if(playerSex == Constants.SEX.BOY) {
                    return "a ${femalePlayer.toString()}"
                } else {
                    return "o ${malePlayer.toString()}"
                }
            }

            val list = ArrayList<TruthModel>()
            list.add(TruthModel("Qual foi a coisa mais embaraçosa que seus pais já pegaram você fazendo?"))
            list.add(TruthModel("Quem foi a última pessoa com quem ficou? não vale atual namorado(a)"))
            list.add(TruthModel("Qual foi o lugar mais esquisito ou curioso em que transou com alguém?"))
            list.add(TruthModel("Qual o maior segredo que já escondeu de algum namorado ou namorada?"))
            list.add(TruthModel("Com quem gostaria de esquecer que ficou?"))
            list.add(TruthModel("Quem desta roda você tem vontade de fazer sexo?"))
            list.add(TruthModel("Já estudou para ser melhor no sexo? Qual fonte?"))
            list.add(TruthModel("Qual é o tipo de provocação a que você não resiste?"))
            list.add(TruthModel("Qual é a sua técnica de conquista que mais funciona?"))
            list.add(TruthModel("Já ficou com pai ou mãe de amigo(a)?"))
            list.add(TruthModel("Já ficou com primo(a)?"))
            list.add(TruthModel("Já traiu algum namorado ou namorada?"))
            list.add(TruthModel("Já sofreu algum tipo de acidente na hora H?"))
            list.add(TruthModel("Se você pudesse escolher um famoso para fazer sexo, qual seria?"))
            list.add(TruthModel("Dormir pelado ou com roupa?"))
            list.add(TruthModel("Peito ou bunda? Justifique sua resposta"))
            list.add(TruthModel("O que você se considera melhor no sexo?"))
            list.add(TruthModel("Como foi a primeira vez que você fez sexo"))
            list.add(TruthModel("Se você pudesse ficar invisível, quem da brincadeira você olharia pelado(a)"))
            list.add(TruthModel("Qual é seu maior desejo sexual que nunca teve a chance de realizar?"))
            list.add(TruthModel("Qual parte do seu corpo você acha mais sexy?"))
            list.add(TruthModel("Qual foi sua experiência sexual mais doida?"))
            list.add(TruthModel("Qual é o seu maior fetiche?"))
            list.add(TruthModel("De quanto em quanto tempo você se masturba?"))
            list.add(TruthModel("Qual foi o lugar mais estranho no qual você já fez sexo?"))
            list.add(TruthModel("Quando foi a última vez que você transou?"))
            list.add(TruthModel("Você já pensou em alguém diferente enquanto transava?"))
            list.add(TruthModel("O que te excita e não é sexual?"))
            list.add(TruthModel("Já se imaginou ficando com alguém que você não pode?"))
            list.add(TruthModel("Já fez sexo com mais de uma pessoa ao mesmo tempo?"))
            list.add(TruthModel("Dar ou receber sexo oral?"))
            list.add(TruthModel("Quantas pessoas você já transou? Pode ser um número aproximado"))
            list.add(TruthModel("Qual a posição que você menos gosta da hora do sexo?"))
            list.add(TruthModel("Alguem já fez striptease pra você?"))
            list.add(TruthModel("Alguem já se fantasiou pra você?"))
            list.add(TruthModel(""))
            list.add(TruthModel(""))
            list.add(TruthModel(""))

            if(malePlayer != "" && femalePlayer != "" ){
                list.add(TruthModel(""))
            }

            return list
        }
    }
}