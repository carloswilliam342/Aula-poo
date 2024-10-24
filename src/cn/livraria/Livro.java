package cn.livraria;

public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;

    Livro(String titulo, String descricao, double valor, String isbn){
        this.nome = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
    }

    void mostrarDetalhes(){
        System.out.println(this.nome);
        System.out.println(this.descricao);
        System.out.println(this.valor);
        System.out.println(this.isbn);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
