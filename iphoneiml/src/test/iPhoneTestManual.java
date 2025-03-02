package test;

import main.classes.Iphone;


public class iPhoneTestManual {
    public static void main(String[] args) {
        
        testTocar();
        testLigar();
        testExibirPagina();
    }

    public static void testTocar() {
        Iphone iphone = new Iphone();
        iphone.selecionarMusica("Minha Música");
        iphone.tocar();
        iphone.pausar();
    
    }

    public static void testLigar() {
        Iphone iphone = new Iphone();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
       
    }

    public static void testExibirPagina() {
        Iphone iphone = new Iphone();
        iphone.exibirPagina("https://example.com");
        iphone.adicionarNovaAba("https://google.com");
        iphone.atualizarPagina();
        iphone.mostrarAbas();
    }
}
