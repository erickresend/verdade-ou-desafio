package com.erickresend.verdade_ou_desafio.datas

import com.erickresend.verdade_ou_desafio.database.models.ChallengeModel
import com.erickresend.verdade_ou_desafio.database.models.TruthModel
import com.erickresend.verdade_ou_desafio.repositories.PlayerRepository
import com.erickresend.verdade_ou_desafio.service.Constants

class DataSourceSoftTruth {

    companion object {

        fun createDataSetSoftTruth(playerName: String?, playerSex: String?, bothPlayer: String?, malePlayer: String? = "", femalePlayer: String? = ""): ArrayList<TruthModel> {

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
            list.add(TruthModel("$playerName. Qual é a mania mais nojenta que você tem?"))
            list.add(TruthModel("$playerName. Qual site no seu histórico de navegação que te deixaria constrangido se alguém visse?"))
            list.add(TruthModel("$playerName. De qual pessoa não famosa você tem inveja?"))
            list.add(TruthModel("$playerName. O que você faria se tivesse uma dor de barriga em um banheiro público, mas acabasse o papel higiênico?"))
            list.add(TruthModel("$playerName. Qual foi a coisa mais louca que você já fez bêbado?"))
            list.add(TruthModel("$playerName. O que você adora, mas tem vergonha de admitir?"))
            list.add(TruthModel("$playerName. Qual foi a pessoa mais aleatória que stalkeou nas redes sociais?"))
            list.add(TruthModel("$playerName. Quando foi a última vez que você chorou e por que?"))
            list.add(TruthModel("$playerName. Você já traiu algum namorad${oa()}?"))
            list.add(TruthModel("$playerName. Conte uma coisa que espera que seus pais nunca descubram"))
            list.add(TruthModel("$playerName. Qual é o apelido mais vergonhoso que alguém já lhe deu?"))
            list.add(TruthModel("$playerName. Quem é a pessoa mais bonita da roda?"))
            list.add(TruthModel("$playerName. Se tivesse que beijar um dos jogadores, quem seria?"))
            list.add(TruthModel("$playerName. Qual é o seu maior medo?"))
            list.add(TruthModel("$playerName. Qual é o seu desejo mais sombrio?"))
            list.add(TruthModel("$playerName. Com quem se arrepende de já ter se envolvido?"))
            list.add(TruthModel("$playerName. Qual é a coisa mais estranha ou vergonhosa que já fez por dinheiro?"))
            list.add(TruthModel("$playerName. Se pudesse mudar de vida com uma celebridade por um dia, com quem seria?"))
            list.add(TruthModel("$playerName. Qual é a maior mentira que já contou para alguém da sua família?"))
            list.add(TruthModel("$playerName. O que a maioria das pessoas pensa que é verdade sobre você, mas não é?"))
            list.add(TruthModel("$playerName. Qual foi a maior conquista que já teve?"))
            list.add(TruthModel("$playerName. O que você faria se fosse do sexo oposto por uma semana?"))
            list.add(TruthModel("$playerName. Por que você terminou seu último namoro?"))
            list.add(TruthModel("$playerName. Você se acha bonit${oa()}?"))
            list.add(TruthModel("$playerName. Você da uma olhada dentro do vaso sanitário antes de dar descarga?"))
            list.add(TruthModel("$playerName. O que não consegue viver sem?"))
            list.add(TruthModel("$playerName. Que erro simples você ainda comete com frequência?"))
            list.add(TruthModel("$playerName. Você tem alguma lacuna de conhecimento? Algo simples que todos sabem fazer, mas você não"))
            list.add(TruthModel("$playerName. Qual a mania de limpeza que você tem e os outros acham frescura?"))
            list.add(TruthModel("$playerName. Qual talento estranho que você tem?"))
            list.add(TruthModel("$playerName. Qual o último rolê que você foi que não gostou?"))
            list.add(TruthModel("$playerName. Qual a mistura de comidas estranhas de que você gosta?"))
            list.add(TruthModel("$playerName. O que você faria com 1 milhão de reais agora?"))
            list.add(TruthModel("$playerName. Qual é a sua maior vergonha na vida?"))
            list.add(TruthModel("$playerName. Se você pudesse mudar algo em você, o que seria?"))
            list.add(TruthModel("$playerName. Se hoje fosse o seu último dia de vida, o que você faria?"))
            list.add(TruthModel("$playerName. O que os olhos não vêem o coração não sente?"))
            list.add(TruthModel("$playerName. Se o mundo fosse acabar e você pudesse salvar apenas uma pessoa para sobreviver, quem seria?"))
            list.add(TruthModel("$playerName. Você já beijou mais de uma pessoa no mesmo dia? Quantas?"))
            list.add(TruthModel("$playerName. Você ficaria tranquilo se todo o histórico do seu WhatsApp ficasse público agora?"))
            list.add(TruthModel("$playerName. Qual é o seu maior orgulho?"))
            list.add(TruthModel("$playerName. Para onde você viajaria agora?"))
            list.add(TruthModel("$playerName. Qual animal você gostaria de ser?"))
            list.add(TruthModel("$playerName. Se você pudesse voltar no tempo para mudar algo, o que mudaria?"))
            list.add(TruthModel("$playerName. Se você pudesse voltar no tempo, e assistir um momento da sua vida, qual seria?"))
            list.add(TruthModel("$playerName. Como foi a primeira vez que você beijou na boca?"))
            list.add(TruthModel("$playerName. Qual característica você realmente valoria em um amigo?"))
            list.add(TruthModel("$playerName. Qual é o animal que você tem mais medo?"))
            list.add(TruthModel("$playerName. Qual é o seu filme preferido?"))
            list.add(TruthModel("$playerName. Você prefere ser rico ou famoso?"))
            list.add(TruthModel("$playerName. Qual a pior mentira que já contaram sobre você?"))
            list.add(TruthModel("$playerName. Em quais superstições você acredita?"))
            list.add(TruthModel("$playerName. Qual o segredo do sucesso?"))
            list.add(TruthModel("$playerName. Você acredita em vidas passadas?"))
            list.add(TruthModel("$playerName. Por qual tipo de talento você gostaria de ser famoso e reconhecido?"))
            list.add(TruthModel("$playerName. Qual é a comida que te faz realmente muito feliz?"))
            list.add(TruthModel("$playerName. Qual é o prato que você cozinha melhor?"))
            list.add(TruthModel("$playerName. Qual outro idioma você gostaria de aprender?"))
            list.add(TruthModel("$playerName. O que é que o dinheiro não pode comprar?"))
            list.add(TruthModel("$playerName. Qual a melhor invenção da face da terra?"))
            list.add(TruthModel("$playerName. Inverno ou verão?"))
            list.add(TruthModel("$playerName. Qual é a doença que você tem mais medo?"))
            list.add(TruthModel("$playerName. 1 ano na cadeia ou para todo o sempre com seu ex?"))
            list.add(TruthModel("$playerName. Prefere saber a data ou causa da sua morte?"))
            list.add(TruthModel("$playerName. O que você compraria agora com mil reais?"))
            list.add(TruthModel("$playerName. Qual a coisa mais engraçada que você já fez para conquistar alguém?"))
            list.add(TruthModel("$playerName. Conte sobre a maior bebedeira da sua vida."))
            list.add(TruthModel("$playerName. Mulheres devem pagar menos em baladas?"))
            list.add(TruthModel("$playerName. Você acredita em extraterrestres?"))
            list.add(TruthModel("$playerName. Quem você acha que é a pessoa mais mal vestida do jogo?"))
            list.add(TruthModel("$playerName. Qual o filme que você mais assistiu na vida?"))
            list.add(TruthModel("$playerName. O que você acha que todos deveriam fazer pelo menos uma vez na vida?"))
            list.add(TruthModel("$playerName. O que você se interessa que a maioria das pessoas não conhece?"))
            list.add(TruthModel("$playerName. Qual foi o pior fora que você levou?"))
            list.add(TruthModel("$playerName. Qual foi a última vergonha que você passou?"))
            list.add(TruthModel("$playerName. Quantas pessoas você já beijou? Pode ser um número aproximado"))
            list.add(TruthModel("$playerName. O que você mais se arrepende de ter feito?"))
            list.add(TruthModel("$playerName. Qual pessoa você finge que gosta, mas não gosta?"))
            list.add(TruthModel("$playerName. Qual a situação mais perigosa pela qual você passou?"))
            list.add(TruthModel("$playerName. Qual a profissão dos seus sonhos?"))
            list.add(TruthModel("$playerName. O que mais te irrita nas pessoas?"))
            list.add(TruthModel("$playerName. Já encobriu a traição de um(a) amigo(a)?"))
            list.add(TruthModel("$playerName. Se tivesse de comer a mesma coisa por um ano, o que seria?"))
            list.add(TruthModel("$playerName. Qual foi sua experiência mais dolorosa fisicamente?"))
            list.add(TruthModel("$playerName. Que relacionamentos você está feliz por ter rompido? (não precisa ser somente relacionamento romântico)"))
            list.add(TruthModel("$playerName. Você namoraria sua paixão do ensino médio hoje?"))
            list.add(TruthModel("$playerName. Quando foi a última vez que você se desculpou? Pelo quê?"))
            list.add(TruthModel("$playerName. Que celebridade você acha que é superestimada?"))
            list.add(TruthModel("$playerName. Com quem do jogo você gostaria de trocar de vida por uma semana?"))
            list.add(TruthModel("$playerName. Qual foi a última coisa que você pesquisou no Google?"))
            list.add(TruthModel("$playerName. Qual foi o último vídeo do YouTube que você assistiu?"))
            list.add(TruthModel("$playerName. Você já experimentou alguma droga?"))
            list.add(TruthModel("$playerName. Qual é a sua maior insegurança?"))
            list.add(TruthModel("$playerName. Qual cirurgia plástica você faria?"))
            list.add(TruthModel("$playerName. Você acha que uma traição pode ser justificada?"))
            list.add(TruthModel("$playerName. Quando foi a última vez que você foi rejeitado?"))
            list.add(TruthModel("$playerName. Qual responsabilidade que você gostaria de não ter?"))
            list.add(TruthModel("$playerName. O que você fez e ainda se sente culpado?"))
            list.add(TruthModel("$playerName. Qual é a sua memória menos favorita do ensino médio?"))
            list.add(TruthModel("$playerName. Qual sotaque mais feio do Brasil?"))
            list.add(TruthModel("$playerName. Você já foi parado pela polícia? Se sim, conte a história"))
            list.add(TruthModel("$playerName. Qual o pior crime na sua opinião?"))
            list.add(TruthModel("$playerName. Qual peça de roupa masculina mais feia de todas?"))
            list.add(TruthModel("$playerName. Qual peça de roupa feminina mais feia de todas?"))
            list.add(TruthModel("$playerName. Qual é o seu cantor internacional favorito?"))
            list.add(TruthModel("$playerName. Qual é o seu cantor nacional favorito?"))
            list.add(TruthModel("$playerName. Qual show você gostaria muito de ir?"))
            list.add(TruthModel("$playerName. Se você pudesse ficar invisível, o que gostaria de observar?"))
            list.add(TruthModel("$playerName. O que você gostaria de saber do seu futuro?"))
            list.add(TruthModel("$playerName. Qual é sua bebida preferida?"))
            list.add(TruthModel("$playerName. Quando você era criança, o que você queria ser quando crescesse"))
            list.add(TruthModel("$playerName. Qual personagem de filme ou série você seria apaixonado(a) na vida real?"))
            list.add(TruthModel("$playerName. Qual personagem de filme ou série você gostaria de ser amigo(a)?"))
            list.add(TruthModel("$playerName. Qual personagem de filme ou série você gostaria de ser?"))
            list.add(TruthModel("$playerName. Você já teve apagão com álcool? Se sim, conte para o grupo a história"))
            list.add(TruthModel("$playerName. Lindo(a) e pobre ou feio(a) e rico(a)"))
            list.add(TruthModel("$playerName. Acha que existe pessoa que só serve pra ficar e as que servem para namorar?"))
            list.add(TruthModel("$playerName. Em qual mundo de série ou filme você gostaria de viver?"))
            list.add(TruthModel("$playerName. Qual música te faz arrepiar?"))
            list.add(TruthModel("$playerName. Você já treinou beijo no espelho?"))
            list.add(TruthModel("$playerName. Você já beijou alguem dentro da escola?"))
            list.add(TruthModel("$playerName. Você já beijou alguem no trabalho?"))
            list.add(TruthModel("$playerName. O que você faria se o mundo fosse acabar daqui uma semana?"))
            list.add(TruthModel("$playerName. Qual canal do YouTube você mais assiste?"))
            list.add(TruthModel("$playerName. Qual conta do instagram você mais acompanha?"))
            list.add(TruthModel("$playerName. Quem do grupo você acha que é mais capaz de trair o(a) namorado(a)?"))
            list.add(TruthModel("$playerName. Qual super poder você gostaria de ter?"))
            list.add(TruthModel("$playerName. Como você vê sua vida daqui 5 anos?"))
            list.add(TruthModel("$playerName. O que é vencer na vida na sua opinião?"))
            list.add(TruthModel("$playerName. Por qual causa você daria a sua vida?"))
            list.add(TruthModel("$playerName. O que você ainda não tem e te faria muito feliz se tivesse?"))
            list.add(TruthModel("$playerName. Qual a pessoa mais famosa que você já encostou?"))
            list.add(TruthModel("$playerName. Qual teoria da conspiração você acredita?"))
            list.add(TruthModel("$playerName. Qual a melhor sensação do mundo?"))
            list.add(TruthModel("$playerName. O que te faz desanimar quando está conhecendo alguém?"))
            list.add(TruthModel("$playerName. Qual foi o seu desenho favorito na infância?"))
            list.add(TruthModel("$playerName. Qual era a sua brincadeira favorita na infância"))
            list.add(TruthModel("$playerName. Qual foi a coisa mais romântica que já fizeram por você?"))
            list.add(TruthModel("$playerName. Qual foi a coisa mais romântica que você já fez por alguém?"))
            list.add(TruthModel("$playerName. Qual seria o pior casal entre os jogadores na sua opinião?"))
            list.add(TruthModel("$playerName. Você deixaria seu parceiro por uma pessoa muito rica?"))
            list.add(TruthModel("$playerName. Qual parte do corpo você olha primeiro em alguém que te interessa?"))
            list.add(TruthModel("$playerName. Se o seu melhor amigo está levando chifre. Você conta ou não conta?"))
            list.add(TruthModel("$playerName. Você já usou aplicativos de encontros? Se sim, conte uma história"))
            list.add(TruthModel("$playerName. Quem foi a última pessoa com quem ficou? não vale ${oa()} atual namorad${oa()}"))
            list.add(TruthModel("$playerName. Com quem gostaria de esquecer que ficou?"))
            list.add(TruthModel("$playerName. Como seria uma tarde de domingo perfeita para você?"))
            list.add(TruthModel("$playerName. Qual o seu maior vício em compras?"))
            list.add(TruthModel("$playerName. Qual o seu doce favorito?"))
            list.add(TruthModel("$playerName. Qual o seu sabor de pizza favorito?"))
            list.add(TruthModel("$playerName. Você é mais otimista ou pessimista?"))
            list.add(TruthModel("$playerName. Você acredita em fantasmas? Se sim, tem medo deles?"))
            list.add(TruthModel("$playerName. Qual o lugar mais bonito que você já foi?"))
            list.add(TruthModel("$playerName. Qual coisa você considera que fez melhor?"))
            list.add(TruthModel("$playerName. Qual profissão você gostaria de ter?"))
            list.add(TruthModel("$playerName. Qual foi seu maior problema na escola?"))
            list.add(TruthModel("$playerName. Quem é a pessoa mais engraçado do jogo?"))
            list.add(TruthModel("$playerName. Qual o lugar mais distante que você já foi?"))
            list.add(TruthModel("$playerName. Qual o pior emprego que você já teve?"))
            list.add(TruthModel("$playerName. Qual é a sua perda de tempo favorita?"))
            list.add(TruthModel("$playerName. Quem é a pessoa mais responsável da brincadeira"))
            list.add(TruthModel("$playerName. Quem é a pessoa mais irresponsável da brincadeira"))
            list.add(TruthModel("$playerName. Qual foi a última coisa que você comprou?"))
            list.add(TruthModel("$playerName. Qual seria pior, vazar suas conversar do whatsapp ou instagram?"))

            list.add(TruthModel("$bothPlayer. Faça uma pergunta para $playerName"))
            list.add(TruthModel("$bothPlayer. Faça uma pergunta para $playerName"))
            list.add(TruthModel("$bothPlayer. Faça uma pergunta para $playerName"))
            list.add(TruthModel("$bothPlayer. Faça uma pergunta para $playerName"))
            list.add(TruthModel("$bothPlayer. Faça uma pergunta para $playerName"))
            list.add(TruthModel("$playerName. De 0 a 10, que nota você daria para a beleza de $bothPlayer"))
            list.add(TruthModel("$playerName. De 0 a 10, que nota você daria para a simpatia de $bothPlayer"))
            list.add(TruthModel("$playerName. De 0 a 10, que nota você daria para a inteligência de $bothPlayer"))
            list.add(TruthModel("$playerName. Cite uma coisa que você mudaria em $bothPlayer"))

            if(malePlayer != "" && femalePlayer != "" ){
                list.add(TruthModel("$playerName. Você beijaria ${oppositeSex()}"))
                list.add(TruthModel("$playerName. Qual parte mais bonita do corpo d${oppositeSex()}"))

            }

            if(playerSex == Constants.SEX.BOY) {
                list.add(TruthModel("$playerName. Como você agiria se sua namorada te traísse"))
                list.add(TruthModel("$playerName. Se a sua namorada decidisse ficar sem sexo até o casamento, você aceitaria?"))
                list.add(TruthModel("$playerName. Quais as 3 melhores qualidades de uma mulher?"))
            }

            if(playerSex == Constants.SEX.GIRL) {
                list.add(TruthModel("$playerName. Como você agiria se seu namorado te traísse"))
                list.add(TruthModel("$playerName. Se o seu namorado decidisse ficar sem sexo até o casamento, você aceitaria?"))
                list.add(TruthModel("$playerName. Quais as 3 melhores qualidades de um homem?"))
            }

            return list
        }
    }
}