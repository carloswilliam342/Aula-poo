package cn.livraria;

public class Livraria {
    int capacidade = 100;

    Livro livros[];
    int size;
    Livraria(int tam){
        livros = new Livro[tam];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void adicionar(Livro livro) throws  RuntimeException{
        if (size == livros.length){
           throw new RuntimeException("Não dá mais!!");
        }
        livros[size]  = livro;
        size++;
    }

    public Livro buscarLivro(String nome) throws  RuntimeException{
        for (int i = 0; i < livros.length; i++){
            Livro livro= livros[i];
            if (livro.getNome().equals(nome)){
                return livro;
            }
        }
        throw new RuntimeException("Livro não encontrado");
    }
}
