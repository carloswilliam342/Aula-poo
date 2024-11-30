package atividade.poo;

public class FuncionarioComum extends Funcionario {

    private double salarioMensal;

    public FuncionarioComum(String nome, String cpf, double salarioMensal) {
        super(nome, cpf, salarioMensal);
    }

    @Override
    public double calcularSalario() {
        return this.salarioMensal;
    }
}
