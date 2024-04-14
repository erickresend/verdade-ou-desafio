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

            fun oa(): String {
                if(playerSex == Constants.SEX.BOY) {
                    return "o"
                } else {
                    return "a"
                }
            }

            val list = ArrayList<TruthModel>()
            list.add(TruthModel("$playerName. Seus pais já pegaram fazendo sexo?"))
            list.add(TruthModel("$playerName. Quem foi a última pessoa com quem fez sexo? não vale ${oa()} atual namorad${oa()}"))
            list.add(TruthModel("$playerName. Qual foi o lugar mais esquisito ou curioso que já transou com alguém?"))
            list.add(TruthModel("$playerName. Qual o maior segredo que já escondeu de algum namorad${oa()}?"))
            list.add(TruthModel("$playerName. Com quem gostaria de esquecer que fez sexo?"))
            list.add(TruthModel("$playerName. Quem desta roda você tem vontade de fazer sexo?"))
            list.add(TruthModel("$playerName. Já estudou para ser melhor no sexo? Qual fonte?"))
            list.add(TruthModel("$playerName. Qual é o tipo de provocação que você não resiste?"))
            list.add(TruthModel("$playerName. Qual é a sua técnica de conquista que mais funciona?"))
            list.add(TruthModel("$playerName. Você já ficou com pai ou mãe de amigo(a)?"))
            list.add(TruthModel("$playerName. Você já ficou com prim${oa()}?"))
            list.add(TruthModel("$playerName. Você já traiu algum namorad${oa()}?"))
            list.add(TruthModel("$playerName. Você já sofreu algum tipo de acidente na hora H?"))
            list.add(TruthModel("$playerName. Se você pudesse escolher um famoso para fazer sexo, qual seria?"))
            list.add(TruthModel("$playerName. Prefere dormir pelado ou com roupa?"))
            list.add(TruthModel("$playerName. Peito ou bunda? Justifique sua resposta"))
            list.add(TruthModel("$playerName. O que você se considera melhor no sexo?"))
            list.add(TruthModel("$playerName. Como foi a primeira vez que você fez sexo"))
            list.add(TruthModel("$playerName. Se você pudesse ficar invisível, quem da brincadeira você olharia pelad${oa()}"))
            list.add(TruthModel("$playerName. Qual é seu maior desejo sexual que nunca teve a chance de realizar?"))
            list.add(TruthModel("$playerName. Qual parte do seu corpo você acha mais sexy?"))
            list.add(TruthModel("$playerName. Qual foi sua experiência sexual mais doida?"))
            list.add(TruthModel("$playerName. Qual é o seu maior fetiche?"))
            list.add(TruthModel("$playerName. De quanto em quanto tempo você se masturba?"))
            list.add(TruthModel("$playerName. Qual foi a última vez que você se masturbou?"))
            list.add(TruthModel("$playerName. Qual foi o lugar mais estranho no qual você já fez sexo?"))
            list.add(TruthModel("$playerName. Quando foi a última vez que você transou?"))
            list.add(TruthModel("$playerName. Você já pensou em alguém diferente enquanto transava?"))
            list.add(TruthModel("$playerName. O que te excita e não é sexual?"))
            list.add(TruthModel("$playerName. Já se imaginou ficando com alguém que você não pode?"))
            list.add(TruthModel("$playerName. Voê já fez sexo com mais de uma pessoa ao mesmo tempo?"))
            list.add(TruthModel("$playerName. Você prefere fazer ou receber sexo oral?"))
            list.add(TruthModel("$playerName. Quantas pessoas você já transou? Pode ser um número aproximado"))
            list.add(TruthModel("$playerName. Qual a posição que você menos gosta da hora do sexo?"))
            list.add(TruthModel("$playerName. Qual a posição que você mais gosta da hora do sexo?"))
            list.add(TruthModel("$playerName. Alguem já fez striptease pra você?"))
            list.add(TruthModel("$playerName. Alguem já se fantasiou pra você?"))
            list.add(TruthModel("$playerName. Qual é o melhor horário para transar?"))
            list.add(TruthModel("$playerName. Qual pessoa famosa você transaria se pudesse?"))
            list.add(TruthModel("$playerName. Você faria sexo com alguém em segredo por muito dinheiro?"))
            list.add(TruthModel("$playerName. Qual sua categoria de pornô favorito?"))
            list.add(TruthModel("$playerName. Você gosta de assistir pornô?"))
            list.add(TruthModel("$playerName. Qual o melhor cômodo da casa para transar?"))
            list.add(TruthModel("$playerName. É melhor transar com a luz acessa ou apagada?"))
            list.add(TruthModel("$playerName. Já usou algum brinquedo sexual?"))
            list.add(TruthModel("$playerName. Já enviou nudes para alguém?"))
            list.add(TruthModel("$playerName. Já recebeu nudes de alguém? Se sim, você apagou?"))
            list.add(TruthModel("$playerName. Já assistiu hentai?"))
            list.add(TruthModel("$playerName. Já leu contos eróticos?"))
            list.add(TruthModel("$playerName. Qual a idade da pessoa mais velha que você já fez sexo?"))
            list.add(TruthModel("$playerName. Qual a idade da pessoa mais nova que você já fez sexo?"))
            list.add(TruthModel("$playerName. Alguém já te viu fazendo sexo?"))
            list.add(TruthModel("$playerName. Você se considera bom na hora do sexo?"))

            list.add(TruthModel("$bothPlayer. Faça uma pergunta para $playerName"))
            list.add(TruthModel("$bothPlayer. Faça uma pergunta para $playerName"))
            list.add(TruthModel("$bothPlayer. Faça uma pergunta para $playerName"))
            list.add(TruthModel("$bothPlayer. Faça uma pergunta para $playerName"))
            list.add(TruthModel("$bothPlayer. Faça uma pergunta para $playerName"))

            if(malePlayer != "" && femalePlayer != "" ){
            }

            if (playerSex == Constants.SEX.BOY) {
                list.add(TruthModel("$playerName. Você já pagou por sexo?"))
                list.add(TruthModel("$playerName. Você já foi em um puteiro?"))
                list.add(TruthModel("$playerName. Você gostaria de ver sua parceira beijar outra mulher?"))
                list.add(TruthModel("$playerName. Qual o tamanho dos seis ideais?"))
            }

            if (playerSex == Constants.SEX.GIRL) {
                list.add(TruthModel("$playerName. O tamanho do pênis importa?"))
                list.add(TruthModel("$playerName. Já ficou com alguém com o pênis bem pequeno?"))
                list.add(TruthModel("$playerName. Já ficou com alguém com o pênis muito grande?"))
            }

            return list
        }
    }
}