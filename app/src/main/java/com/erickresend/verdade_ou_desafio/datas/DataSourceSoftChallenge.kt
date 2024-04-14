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

            fun oa(): String {
                if(playerSex == Constants.SEX.BOY) {
                    return "o"
                } else {
                    return "a"
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
            list.add(ChallengeModel("$playerName. Lave tudo que estiver sujo na pia"))
            list.add(ChallengeModel("$playerName. Qual seu jogo preferido de todos?"))
            list.add(ChallengeModel("$playerName. Faça uma mímica de filme até alguem adivinhar"))
            list.add(ChallengeModel("$playerName. Tente fazer uma ponte, pode usar a parede ou a ajuda de algum jogador"))
            list.add(ChallengeModel("$playerName. Dance o quadradinho"))
            list.add(ChallengeModel("$playerName. Olhe para cima e uive"))
            list.add(ChallengeModel("$playerName. Faça a dança do siri"))
            list.add(ChallengeModel("$playerName. Fique de castigo com a cara na parede até sua próxima vez"))
            list.add(ChallengeModel("$playerName. Fique em uma perna só até a sua próxima vez"))
            list.add(ChallengeModel("$playerName. Gire 10x"))
            list.add(ChallengeModel("$playerName. Enrole papel higiênico em volta do seu rosto e fique por 2 rodadas"))
            list.add(ChallengeModel("$playerName. Beba alguma coisa rebolando"))
            list.add(ChallengeModel("$playerName. Fique na pose de meditação até a sua próxima vez"))
            list.add(ChallengeModel("$playerName. Imite uma galinha"))
            list.add(ChallengeModel("$playerName. Imite seu pai ou sua mãe"))
            list.add(ChallengeModel("$playerName. Pule como um sapo por 30 segundos"))
            list.add(ChallengeModel("$playerName. Dê um beijo em algum animal que tenha perto"))
            list.add(ChallengeModel("$playerName. Dance igual um robô"))
            list.add(ChallengeModel("$playerName. Dance balé"))
            list.add(ChallengeModel("$playerName. Dê 10 \"passos\" de joelho"))
            list.add(ChallengeModel("$playerName. Fique deitado no chão até a sua próxima vez"))
            list.add(ChallengeModel("$playerName. Mostre alguma cicatriz e conte como conseguiu ela"))
            list.add(ChallengeModel("$playerName. Mostre suas 5 últimas pesquisas do google"))

            list.add(ChallengeModel("$bothPlayer. Faça um desafio para $playerName"))
            list.add(ChallengeModel("$bothPlayer. Faça um desafio para $playerName"))
            list.add(ChallengeModel("$bothPlayer. Faça um desafio para $playerName"))
            list.add(ChallengeModel("$bothPlayer. Faça um desafio para $playerName"))
            list.add(ChallengeModel("$bothPlayer. Faça um desafio para $playerName"))
            list.add(ChallengeModel("$playerName. Tente pegar $bothPlayer no colo"))
            list.add(ChallengeModel("$playerName. Dê um beijo no pé de $bothPlayer"))
            list.add(ChallengeModel("$playerName. Penteie o cabelo de $bothPlayer com os dedos"))
            list.add(ChallengeModel("$playerName. Diga uma coisa ruim sobre todos os outros no jogo"))
            list.add(ChallengeModel("$playerName. Sussurre algo no ouvido de $bothPlayer"))
            list.add(ChallengeModel("$playerName. Imite o animal que $bothPlayer escolher"))
            list.add(ChallengeModel("$playerName. Faça uma previsão do futuro de $bothPlayer"))
            list.add(ChallengeModel("$playerName. Peça permissão para dar um beliscão em $bothPlayer"))
            list.add(ChallengeModel("$playerName. Obedeça tudo que $bothPlayer mandar por 1 rodada. Tenha juízo $bothPlayer :)"))
            list.add(ChallengeModel("$playerName. Dispute uma queda de braço / braço de ferro com $bothPlayer"))
            list.add(ChallengeModel("$playerName. Jogue par ou ímpar com $bothPlayer, quem ganhar escolhe um desafio para o outro"))
            list.add(ChallengeModel("$playerName. Jogue pedra, papel e tesoura com $bothPlayer, quem ganhar escolhe um desafio para o outro"))
            list.add(ChallengeModel("$playerName. Jogue briga de polegar com $bothPlayer, quem ganhar escolhe um desafio para o outro"))
            list.add(ChallengeModel("$playerName. Jogue basquete de papel na cesta de lixo com $bothPlayer, quem ganhar escolhe um desafio para o outro"))
            list.add(ChallengeModel("$playerName. Olhe nos olhos de $bothPlayer, quem rir primeiro o outro escolhe um desafio"))
            list.add(ChallengeModel("$playerName. Olhe nos olhos de $bothPlayer, quem piscar primeiro o outro escolhe um desafio"))
            list.add(ChallengeModel("$bothPlayer. Faça uma concha com as mãos e encha de água para $playerName beber"))
            list.add(ChallengeModel("$playerName. Dê um beijo no dedo do pé de $bothPlayer"))
            list.add(ChallengeModel("$playerName. Dê um beijo na nuca de $bothPlayer"))
            list.add(ChallengeModel("$playerName. Dê um beijo no cotovelo de $bothPlayer"))
            list.add(ChallengeModel("$playerName. Dê um beijo no joelho de $bothPlayer"))
            list.add(ChallengeModel("$playerName. Repita tudo que $bothPlayer fizer até a sua próxima vez"))
            list.add(ChallengeModel("$playerName. Feche os olhos e adivinhe qual objeto $bothPlayer escolheu, se errar ele te fará um desafio"))
            list.add(ChallengeModel("$playerName. Faça uma cena como se tivesse sido baleado por $bothPlayer"))

            if(malePlayer != "" && femalePlayer != "" ){
                list.add(ChallengeModel("$playerName. Diga qual o maior defeito de ${oppositeSex()}"))
                list.add(ChallengeModel("$playerName. Simule um pedido de casamento com ${oppositeSex()}"))
                list.add(ChallengeModel("$playerName. Faça cócegas n${oppositeSex()}"))
                list.add(ChallengeModel("$playerName. Fique no colo de ${oppositeSex()} por 2 rodadas"))
                list.add(ChallengeModel("$playerName. Faça uma massagem no ombro de ${oppositeSex()}"))
                list.add(ChallengeModel("$playerName. Beije ${oppositeSex()} na testa"))
                list.add(ChallengeModel("${oppositeSex()}. Mergulhe o dedo na bebida e desenhe um coração na barriga de $playerName deitado"))
                list.add(ChallengeModel("$playerName. Se você ficasse pres${oa()} em uma ilha deserta com ${oppositeSex()}, você acha que acabariam juntos no final?"))
            }

            if(playerSex == Constants.SEX.BOY) {
                list.add(ChallengeModel("$playerName. Tire sua camisa e mostre os músculos"))
                list.add(ChallengeModel("$playerName. Pegue um batom com algum jogador e peça para ${oppositeSex()} passar em você e fique até sua próxima vez"))
                list.add(ChallengeModel("${oppositeSex()}. Puxe 5 fios de cabelo da perna de $playerName"))
            }

            return list
        }
    }
}