package atividade.poo;

public class FuncionarioComum extends Funcionario {

    private double SalarioMensal;

    public FuncionarioComum(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}
