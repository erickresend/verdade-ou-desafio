package com.erickresend.verdade_ou_desafio.datas

import com.erickresend.verdade_ou_desafio.database.models.TruthModel

class DataSourceTruth {

    companion object {
        fun createDataSetTruth(): ArrayList<TruthModel> {
            val listTruth = ArrayList<TruthModel>()
            listTruth.add(TruthModel("Qual é a mania mais nojenta que você tem?"))
            listTruth.add(TruthModel("Qual site no seu histórico de navegação te deixaria constrangido se alguém visse?"))
            listTruth.add(TruthModel("De qual pessoa não famosa você tem inveja?"))
            listTruth.add(TruthModel("O que você faria se tivesse uma dor de barriga em um banheiro público, mas acabasse o papel higiênico?"))
            listTruth.add(TruthModel("Qual foi a coisa mais embaraçosa que você já fez bêbado?"))
            listTruth.add(TruthModel("O que você adora, mas tem vergonha de admitir?"))
            listTruth.add(TruthModel("Qual foi a coisa mais embaraçosa que já fez?"))
            listTruth.add(TruthModel("Qual foi a pessoa mais aleatória que stalkeou nas redes sociais?"))
            listTruth.add(TruthModel("Qual foi a última coisa que pesquisou no seu telefone?"))
            listTruth.add(TruthModel("Quando foi a última vez que chorou e por quê?"))
            listTruth.add(TruthModel("Já traiu algum namorado ou namorada?"))
            listTruth.add(TruthModel("Conte uma coisa que espera que seus pais nunca descubram."))
            listTruth.add(TruthModel("Qual é o apelido mais vergonhoso que alguém já lhe deu?"))
            listTruth.add(TruthModel("Quem é a pessoa mais bonita da roda?"))
            listTruth.add(TruthModel("Se tivesse que beijar um dos jogadores, quem seria?"))
            listTruth.add(TruthModel("Qual é o seu medo mais sombrio?"))
            listTruth.add(TruthModel("Com quem se arrepende de já ter se envolvido?"))
            listTruth.add(TruthModel("Qual é a coisa mais estranha ou vergonhosa que já fez por dinheiro?"))
            listTruth.add(TruthModel("Se pudesse mudar de vida com uma celebridade por um dia, com quem seria?"))
            listTruth.add(TruthModel("Qual é a maior mentira que já contou para alguém da sua família?"))
            listTruth.add(TruthModel("O que a maioria das pessoas pensa que é verdade sobre você, mas não é?"))
            listTruth.add(TruthModel("Qual foi a maior conquista que já teve?"))
            listTruth.add(TruthModel("O que você faria se fosse do sexo oposto por uma semana?"))
            listTruth.add(TruthModel("Por que você terminou com seu último namorado ou namorada?"))
            listTruth.add(TruthModel("Se acha bonito(a)?"))
            listTruth.add(TruthModel("Dá uma olhada dentro do vaso sanitário antes de dar descarga?"))
            listTruth.add(TruthModel("O que não consegue viver sem?"))
            listTruth.add(TruthModel("Qual a maior vergonha que já passou em termos de erro em roupa?"))
            listTruth.add(TruthModel("Que erro simples você ainda comete com frequência?"))
            listTruth.add(TruthModel("Você tem alguma lacuna de conhecimento? Algo simples que todos sabem fazer, mas você não"))
            listTruth.add(TruthModel("Qual a mania de limpeza que você tem e os outros acham frescura?"))
            listTruth.add(TruthModel("Qual o talento estranho que você tem?"))
            listTruth.add(TruthModel("Qual o passeio que você já fez que foi mais \"rolê errado\" e você só queria fugir?"))
            listTruth.add(TruthModel("Qual a mistura de comidas estranhas de que você gosta?"))

            return listTruth
        }
    }
}