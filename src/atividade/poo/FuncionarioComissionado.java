package atividade.poo;

public class FuncionarioComissionado extends Funcionario{

   public FuncionarioComissionado(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}
