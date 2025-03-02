package main.interfaces;

public interface Navegador {
    void exibirPagina(String url);
    void adicionarNovaAba(String aba);
    void atualizarPagina();
    void mostrarAbas();
}
