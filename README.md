<h1 align="center">Verdade ou Desafio</h1>

<p align="center">
  <a href="https://android-arsenal.com/api?level=23"><img src="https://img.shields.io/badge/API-23%2B-blue.svg?style=flat" border="0" alt="API"></a>
  <br>
  <a href="https://wa.me/+5533999665927"><img alt="WhatsApp" src="https://img.shields.io/badge/WhatsApp-25D366?style=for-the-badge&logo=whatsapp&logoColor=white"/></a>
  <a href="https://www.linkedin.com/in/erickresende/"><img alt="Linkedin" src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"/></a>
  <a href="mailto:erickresend@gmail.com"><img alt="Gmail" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white"/></a>
</p>

<p align="center">  

⭐ Esse é um projeto para  demonstrar meu conhecimento técnico no desenvolvimento Android nativo com Kotlin e para que seja usado para diversão entre amigos.

Aplicativo do jogo verdade ou desafio. No aplicativo podemos adicionar, alterar e deletar jogadores. O jogo conta com mais de 400 perguntas e desafios diferentes filtrados dependendo do modo de jogo escolhido e do sexo do jogador, tendo restrição da quantidade de vezes que pode ser escolhido verdade ou desafio para que o jogador não fique apenas em um tipo de escolha.

Meu primeiro aplicativo criado totalmente do zero, tive a ideia em uma festa onde vi pessoas jogando o jogo da garrafa, mas que a maior dificuldade era elaborar perguntas e desafios interessantes, então decidi criar o aplicativo que faz isso automaticamente.

</p>

</br>

<p float="left" align="center">
<img alt="screenshot" width="30%" src="screenshots/screenshot1.jpeg"/>
<img alt="screenshot" width="30%" src="screenshots/screenshot2.jpeg"/>
<img alt="screenshot" width="30%" src="screenshots/screenshot3.jpeg"/>
</p>

<!--## Download
BADGE DA PLAYSTORE https://play.google.com/intl/en_us/badges/

Ou -->
Faça o download da <a href="apk/app-debug.apk?raw=true">APK diretamente</a>. Você pode ver <a href="https://www.google.com/search?q=como+instalar+um+apk+no+android">aqui</a> como instalar uma APK no seu aparelho android.

## Tecnologias usadas e bibliotecas de código aberto

- [Linguagem Kotlin](https://kotlinlang.org/)

- Jetpack
  - Lifecycle
  - ViewModel
  - ViewBinding
  - Room
  - Lifecycle

- Arquitetura e Design pattern
  - MVVM (View - ViewModel - Model)
  - Comunicação da ViewModel com a View através de LiveData
  - Repositories para abstração da comunidação com a camada de dados
  - Singleton na instância do banco
  
- Construção de tela com XML
  - RecyclerView com clique
  - LinearLayout
  - ConstraintLayout
  - CardView
  - TextView
  - EditText
  - RadioGroup e RadioButton
  - Button
  - ImageButton
 
- Armazenamento de dados internos
  
## Arquitetura
O jogo Verdade ou desafio utiliza a arquitetura MVVM e o padrão de Repositories, que segue as [recomendações oficiais do Google](https://developer.android.com/topic/architecture).
</br></br>

## Features

### Adicionando jogadores
<img src="screenshots/gif1.gif" width="25%"/>

Adicionando, alterando e deletando jogadores e atualizando dinamicamente o recyclerview com a lista de jogadores.

### Modo e escolha
<img src="screenshots/gif2.gif" width="25%"/>

Escolhendo o modo de jogo, que terão uma lista de verdades e desafios diferentes, e a escolha entre verdade ou desafio é restrita entre 3 verdades para cada 1 desafio por cada jogador.

