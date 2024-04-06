package com.erickresend.verdade_ou_desafio.datas

import com.erickresend.verdade_ou_desafio.database.models.ChallengeModel
import com.erickresend.verdade_ou_desafio.database.models.TruthModel
import com.erickresend.verdade_ou_desafio.service.Constants

class DataSourceSoftChallenge {

    companion object {
        fun createDataSetSoftChallenge(playerName: String?, playerSex: String?, bothPlayer: String?, malePlayer: String? = "", femalePlayer: String? = ""): ArrayList<ChallengeModel> {

            fun oppositeSex(): String {
                if(playerSex == Constants.SEX.BOY) {
                    return "a ${femalePlayer.toString()}"
                } else {
                    return "o ${malePlayer.toString()}"
                }
            }

            val list= ArrayList<ChallengeModel>()
            list.add(ChallengeModel("$playerName. Passe um trote para algum amigo que não está jogando"))
            list.add(ChallengeModel("$playerName. Mostre para o grupo o que falou nas três últimas conversas do WhatsApp"))
            list.add(ChallengeModel("$playerName. Mostre para o grupo as cinco últimas fotos da galeria do celular"))
            list.add(ChallengeModel("$playerName. Ande pela casa ou apartamento pulando num pé só"))
            list.add(ChallengeModel("$playerName. Fale “três tigres tristes” por um minuto, o mais rápido possível, sem errar"))
            list.add(ChallengeModel("$playerName. Tape os olhos e passe a mão no rosto de cada participante e diga quem é sem errar"))
            list.add(ChallengeModel("$playerName. Comente a primeira foto de uma pessoa que você segue no Instagram (não vale pessoas famosas)"))
            list.add(ChallengeModel("$playerName. Conte uma pessoa que você já ficou e ninguém sabe"))
            list.add(ChallengeModel("$playerName. Faça o máximo de flexões que conseguir em 1 minuto"))
            list.add(ChallengeModel("$playerName. Desenhe uma pessoa do grupo num papel"))
            list.add(ChallengeModel("$playerName. De ou transfira R\$2,00 para alguém do grupo"))
            list.add(ChallengeModel("$playerName. Encene um trecho de filme para todos."))
            list.add(ChallengeModel("$playerName. Rebole em um bambolê imaginário"))
            list.add(ChallengeModel("$playerName. Tente colocar o pé atrás da cabeça"))
            list.add(ChallengeModel("$playerName. Faça uma imitação de algum famoso ou de alguém que está na roda"))
            list.add(ChallengeModel("$playerName. Improvise uma coreografia de balé."))
            list.add(ChallengeModel("$playerName. Tome água de uma tigela como se fosse um cachorro"))
            list.add(ChallengeModel("$playerName. Imite um gato se limpando"))
            list.add(ChallengeModel("$playerName. Dance na boquinha da garrafa"))
            list.add(ChallengeModel("$playerName. Finja que está na balada e mostrar como você faria para chegar em alguém."))
            list.add(ChallengeModel("$playerName. Chupe um limão como se fosse uma laranja"))
            list.add(ChallengeModel("$playerName. Faça uma dança sensual usando só uma perna"))
            list.add(ChallengeModel("$playerName. Tome o gole de algo e faça uma análise detalhada como se fosse um especialista em vinhos."))
            list.add(ChallengeModel("$playerName. Dê uma cambalhota"))
            list.add(ChallengeModel("$playerName. Finja participar de uma competição de natação imaginária no chão"))
            list.add(ChallengeModel("$playerName. Faça uma performance ao som de uma música do Michael Jackson"))
            list.add(ChallengeModel("$playerName. Dê uma aula de axé anos 90 com todos da roda"))
            list.add(ChallengeModel("$playerName. Dance em cima da mesa"))
            list.add(ChallengeModel("$playerName. Fique até a próxima rodada congelado, como se fosse uma estátua"))
            list.add(ChallengeModel("$playerName. Dance em silêncio até adivinharem qual é a música."))
            list.add(ChallengeModel("$playerName. Leia a mão da pessoa à sua frente e veja seu futuro"))
            list.add(ChallengeModel("$playerName. Vire um shot de alguma bebida"))
            list.add(ChallengeModel("$playerName. "))
            list.add(ChallengeModel("$playerName. "))
            list.add(ChallengeModel("$playerName. "))
            list.add(ChallengeModel("$playerName. "))
            list.add(ChallengeModel("$playerName. "))
            list.add(ChallengeModel("$playerName. "))
            list.add(ChallengeModel("$playerName. "))
            list.add(ChallengeModel("$playerName. Tente pegar $bothPlayer no colo"))
            list.add(ChallengeModel("$playerName. Dê um beijo no pé de $bothPlayer"))
            list.add(ChallengeModel("$playerName. Penteie o cabelo de $bothPlayer com os dedos"))
            list.add(ChallengeModel("$playerName. Diga uma coisa ruim sobre todos os outros no jogo"))
1
            if(malePlayer != "" && femalePlayer != "" ){
                list.add(ChallengeModel("$playerName. Diga qual o maior defeito de ${oppositeSex()}"))
                list.add(ChallengeModel("$playerName. Deixe que ${oppositeSex()} lamba sua testa"))
                list.add(ChallengeModel("$playerName. Simule um pedido de casamento com ${oppositeSex()}"))
                list.add(ChallengeModel("$playerName. Faça cócegas n${oppositeSex()}"))
                list.add(ChallengeModel(""))
            }

            return list
        }
    }
}