Seja bem vindo você que está lendo esse texto. Estou realizando a trilha de formação java developer da plataforma dio.me e quero compartilhar sobre o processo para realizar um desafio específico da plataforma (o desafio: https://web.dio.me/project/desafio-de-projeto-1/learning/6d16483b-8e3c-4275-9e1d-9ecea46a839c?back=/track/formacao-java-developer&tab=undefined&moduleId=undefined)

Não é a primeira vez que tenho contato com tal tecnologia, cheguei a ver em outros momentos, tanto por estudos independentes quanto por questões acadêmicas, quando estive estudando POO na faculdade de ADS. 

A proposta do desafio é criar um diagrama de classe para representar o iphone (2007) e as 3 principais funcionalidades que ele oferece.

Dentro do repositório com os arquivos relacionados ao desafio (https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo), já tem um diagrama como base para facilitar e ter uma ideia de como as coisas devem ser organizadas. 

Após pesquisar como deveria implementar o diagrama de classe, notei que existe um princípio muito importante para manter o código funcional e limpo, trata-se do S.O.L.I.D. O princípio que estou aplicando trata-se do "**Interface Segregation Principle**", trata-se do princípio que devemos criar interfaces especializadas em algo, para que as classes apenas as use. No contexto do desafio, podemos criar as interfaces para cada coisa que o iphone é capaz de fazer e criar os métodos especializados para cada ação dos apps.

Navegador = Contêm métodos relacionados a exibir páginas, adicionar uma nova página e atualizar a página.

Telefone = Contêm métodos para lidar com ligações, por exemplo ligar, antender e iniciar correio de voz.

Reprodutor Musical = Contêm métodos relacionados a lidar com reprodução de músicas, como tocar, pausar e selecionar uma música específica.


E assim foi feito o diagrama:

```UML

classDiagram

    class ReprodutorMusical {

        +void tocar()

        +void pausar()

        +void selecionarMusica(String musica)


    }

  

    class AparelhoTelefonico {

        +void ligar(String numero)

        +void atender()

        +void iniciarCorreioVoz()


    }

  

    class NavegadorInternet {

        +void exibirPagina(String url)

        +void adicionarNovaAba()

        +void atualizarPagina()


    }

  

    class iPhone {

        +void tocar()

        +void pausar()

        +void selecionarMusica(String musica)

        +void ligar(String numero)

        +void atender()

        +void iniciarCorreioVoz()

        +void exibirPagina(String url)

        +void adicionarNovaAba()

        +void atualizarPagina()

        -String musicaAtual

        -boolean tocando

        -String numeroLigando

        -String paginaAtual

        -List<String> abas

    }

  

    iPhone ..|> ReprodutorMusical

    iPhone ..|> AparelhoTelefonico

    iPhone ..|> NavegadorInternet
```
