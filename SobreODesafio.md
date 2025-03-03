
Seja bem vindo você que está lendo esse texto. Estou realizando a trilha de formação java developer da plataforma dio.me e quero compartilhar sobre o processo para realizar um desafio específico da plataforma (o desafio: https://web.dio.me/project/desafio-de-projeto-1/learning/6d16483b-8e3c-4275-9e1d-9ecea46a839c?back=/track/formacao-java-developer&tab=undefined&moduleId=undefined)

Não é a primeira vez que tenho contato com tal tecnologia, cheguei a ver em outros momentos, tanto por estudos independentes quanto por questões acadêmicas, quando estive estudando POO na faculdade de ADS. 

A proposta do desafio é criar um diagrama de classe para representar o iphone (2007) e as 3 principais funcionalidades que ele oferece.

Dentro do repositório com os arquivos relacionados ao desafio (https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo), já tem um diagrama como base para facilitar e ter uma ideia de como as coisas devem ser organizadas. 

Após pesquisar como deveria implementar o diagrama de classe, notei que existe um princípio muito importante para manter o código funcional e limpo, trata-se do S.O.L.I.D. O princípio que estou aplicando trata-se do "**Interface Segregation Principle**", trata-se do princípio que devemos criar interfaces especializadas em algo, para que as classes apenas as use. No contexto do desafio, podemos criar as interfaces para cada coisa que o iphone é capaz de fazer e criar os métodos especializados para cada ação dos apps.

Navegador = Contêm métodos relacionados a exibir páginas, adicionar uma nova página, mostrar as abas e atualizar a página.

Telefone = Contêm métodos para lidar com ligações, por exemplo ligar, antender e iniciar correio de voz.

Reprodutor Musical = Contêm métodos relacionados a lidar com reprodução de músicas, como tocar, pausar e selecionar uma música específica.


E assim foi feito o diagrama:


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


Agora que tudo foi idealizado, é momento de por a mão na massa!

Primeiro criei um repositório remoto para guardar as informações do desafio como o modelo de classes e os próprios arquivos do projeto. Para criar o projeto, estou usando o VScode com extensão para desenvolvedores java, além é claro de estar usando o JDK, a versão é a 1.8.0_202.

Após clonar o respositório remoto, criei um projeto java vazio. Por alguma razão, os projetos java por padrão não possuem a pasta bin no vscode, então criei manualmente para que os arquivos compilados fiquem guardados nela. 

Dentro da pasta src criei o esquema de pastas, uma parte contendo as interfaces, outra as classes e outra contendo conteúdos para testar o que foi desenvolvido

algo mais ou menos assim:

src
    ├───main
    │   ├───classes
    │   └───interfaces
    └───test

dentro da pasta interface encontra-se as seguintes interfaces:


AparelhoTelefonico.java

Navegador.java

ReprodutorMusica.java

Agora basta criar uma classe para o iphone dentro da pasta de classes. Devemos implementar as interfaces, usando os métodos de cada uma, além de por variáveis dentro do iphone. 

Com a classe Iphone pronta, basta ir na pasta de test, e criar uma classe para fazer o teste,

Ao executar o IphoneTestManual, vamos ter o seguinte output:

A música Minha Música foi selecionada!
O Iphone está tocando música
Pausando a música Minha Música
false
Ligando para o número 123456789
Atendendo uma ligação...
Iniciando correio de voz.
Página em exibiçãohttps://example.com
Usuário adicionou uma nova aba: https://google.com
Usuário está atualizando as informações da página.
https://google.com

O programa está apresentando um bom resultando, se comportando da maneira que planejei.

Foi muito divertido e interessante o desafio, pois coloquei em prática os princípios de orientação a objeto, além de ver mais a fundo o tema UML, que até então tinha visto de maneira superficial na faculdade, também gostei de ter buscado na internet e ter visto coisas relacionadas ao S.O.L.I.D, que apesar do professor do curso ainda não ter ensinado, já vi e tenho uma noção de como funciona. Agora vou me preparar para o próximo desafio do curso!


Segue com o código das interfaces e classes usadas nesse desafio.
