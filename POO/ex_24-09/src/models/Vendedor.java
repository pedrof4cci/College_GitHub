package models;

public class Vendedor extends Funcionario{
    private double comisao;


    public Vendedor(String nome, String matricula, double salarioBase, double comisao) {
        super(nome, matricula, salarioBase);
        this.setComisao(comisao);
    }

    @Override
    public double calcularSalario(){
        double novoSalario = this.getSalarioBase() + (this.getSalarioBase() * this.getComisao());
        return this.getNovoSalario();
    }

    public double getComisao() {
        return comisao;
    }

    public void setComisao(double comisao) {
        this.comisao = comisao/100;
    }
}
