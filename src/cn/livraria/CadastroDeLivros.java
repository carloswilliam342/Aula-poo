package cn.livraria;

public class CadastroDeLivros {
    public static void main(String[] args) {

        Autor novoAutor = new Autor("Carlos William", "carlos@gmail.com", "02236048390");
        Autor autorWeslen = new Autor("Weslen", "weslen@gmail.com", "137473272726462");

        Livro novoLivro = new Livro("Java", "Livro teste", 23.90, "304050", novoAutor);
        novoLivro.mostrarDetalhes();

        Livro livroPython = new Livro("Python para iniciantes", "aprenda python", 50.90, "3583485", autorWeslen);
        livroPython.mostrarDetalhes();

        Livro livroAvulso = new Livro();


    }
}
