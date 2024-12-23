package cn.livraria;

public class Autor {
   private String nome;
   private String email;
   private String cpf;

    Autor(String nome, String email, String cpf){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    void mostrarDetalhesAutor(){
        System.out.println(this.nome);
        System.out.println(this.email);
        System.out.println(this.cpf);
        System.out.println("------------------");
    }
}
