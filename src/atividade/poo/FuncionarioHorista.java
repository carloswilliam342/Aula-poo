package atividade.poo;

public class FuncionarioHorista extends Funcionario{


  public FuncionarioHorista(int horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = calcularSalario();

    }

    private int horasTrabalhadas;

    private double valorHora;
    

    @Override
    public double calcularSalario() {
        return 0;
    }


    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }


    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }


    public double getValorHora() {
        return valorHora;
    }


    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
