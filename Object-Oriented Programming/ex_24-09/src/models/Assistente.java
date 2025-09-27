package models;

public class Assistente extends Funcionario{
    public Assistente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    double calcularSalario() {
        return this.getSalarioBase() + (this.getSalarioBase() * 0.2);
    }
}
