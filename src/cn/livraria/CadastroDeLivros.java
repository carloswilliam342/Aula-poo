package cn.livraria;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro novoLivro = new Livro("Java", "Livro teste", 23.90, "304050");
        novoLivro.mostrarDetalhes();
    }
}
