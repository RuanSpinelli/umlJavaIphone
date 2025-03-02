package main.classes;

// Importando coisas para array list para facilitar o desenvolvimento

import java.util.ArrayList;
import java.util.List;

import main.interfaces.AparelhoTelefonico;
import main.interfaces.Navegador;
import main.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, Navegador, ReprodutorMusical{

    // Atributos do Iphone
    
    //Informa qual a música que está sendo tocada no momento
    private String musicaAtual;
    
    // Informa se está tocando no momento
    private boolean  tocando;

    // Numero para qual está ligando no momento
    private String numeroLigando;

    // Página que está aberta no momento
    private String paginaAtual;

    // Coleção de dados com as abas que estão abertas 
    private List<String> abas = new ArrayList<>();

    // Métodos do Iphone


    // Relacionados a música
    @Override
    public void tocar() {
        this.tocando = true;
        System.out.println("O Iphone está tocando música");
    }

    @Override
    public void pausar() {
        this.tocando = false;
        System.out.println("Pausando a música "+ musicaAtual);
        System.out.println(tocando);
    
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("A música "+musica+" foi selecionada!");
    }


    // Relacionados a telefone
    @Override
    public void ligar(String numero) {
        this.numeroLigando = numero;
        System.out.println("Ligando para o número "+ numeroLigando);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Relacionados a navegação web
    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Página em exibição" + paginaAtual);
        
    }

    @Override
    public void adicionarNovaAba(String aba) {
        abas.add(aba);
        System.out.println("Usuário adicionou uma nova aba: "+ aba);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Usuário está atualizando as informações da página.");
    
    }

    @Override
    public void mostrarAbas(){
        abas.forEach(System.out::println);
    }


}