package cn.livraria;

public class Livro {
   private String nome;
   private String descricao;
   private double valor;
   private String isbn;

    Autor autor;

    Livro(String titulo, String descricao, double valor, String isbn, Autor autor){
        this.nome = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.autor = autor;
    }

    Livro(){};

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    void mostrarDetalhes(){
        System.out.println(this.nome);
        System.out.println(this.descricao);
        System.out.println(this.valor);
        System.out.println(this.isbn);
        autor.mostrarDetalhesAutor();
        System.out.println("---------------------------------------");
    }


}
