package models;

public class Gerente extends Funcionario{
    private double novoSalario;

    public Gerente(String nome, String matricula, double salarioBase, double novoSalario) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calcularSalario() {
        setNovoSalario(this.getSalarioBase() * 2);
        return this.getNovoSalario();
    }



    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }
}
