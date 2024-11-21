package atividade.poo;

public class FuncionarioHorista extends Funcionario{


  public FuncionarioHorista(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}
