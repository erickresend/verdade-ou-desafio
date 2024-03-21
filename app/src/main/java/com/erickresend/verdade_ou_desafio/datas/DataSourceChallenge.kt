package com.erickresend.verdade_ou_desafio.datas

import com.erickresend.verdade_ou_desafio.database.models.ChallengeModel

class DataSourceChallenge {

    companion object {
        fun createDataSetChallenge(): ArrayList<ChallengeModel> {
            val listChallenge= ArrayList<ChallengeModel>()
            listChallenge.add(ChallengeModel("Passar um trote para algum amigo que não está jogando"))
            listChallenge.add(ChallengeModel("Mandar uma imagem aleatória por mensagem para o pai ou mãe e esperar a resposta"))
            listChallenge.add(ChallengeModel("Mostrar para o grupo o que falou nas três últimas conversas do WhatsApp"))
            listChallenge.add(ChallengeModel("Mostrar para o grupo as cinco últimas fotos da galeria do celular"))
            listChallenge.add(ChallengeModel("Andar pela casa ou apartamento pulando num pé só"))
            listChallenge.add(ChallengeModel("Dizer a alguma pessoa do grupo qual o maior defeito dela"))
            listChallenge.add(ChallengeModel("Ficar de mãos dadas com a pessoa que você tem menos intimidade da roda, durante toda a jogada"))
            listChallenge.add(ChallengeModel("Deixar que uma pessoa do grupo lamba o seu rosto"))
            listChallenge.add(ChallengeModel("Falar “três tigres tristes” por um minuto, o mais rápido possível, sem errar"))
            listChallenge.add(ChallengeModel("Ser vendado, passar a mão no rosto de cada participante e dizer quem é sem errar"))
            listChallenge.add(ChallengeModel("Comentar a primeira foto de uma pessoa que você segue no Instagram (não vale pessoas famosas)"))
            listChallenge.add(ChallengeModel("Contar com qual pessoa que você já ficou e ninguém sabe"))
            listChallenge.add(ChallengeModel("Fazer o máximo de flexões que conseguir em 1 minuto"))
            listChallenge.add(ChallengeModel("Desenhar uma pessoa do grupo num papel"))
            listChallenge.add(ChallengeModel("Dar ou transferir R\$5,00 para alguém do grupo"))

            return listChallenge
        }
    }
}