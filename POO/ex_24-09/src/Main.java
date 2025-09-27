import models.Gerente;
import models.Vendedor;

public class Main {
    public static void main(String[] args) {
        Gerente antonio = new Gerente("Antonio", "123", 2000, 4000);
        System.out.printf("\nNome: ", antonio.getNome());
        System.out.println("\nSalario Base R$ " + antonio.getSalarioBase());
        System.out.printf("\nNovo Salario R$ ", antonio.calcularSalario());

        System.out.println("\n-------------------\n");

        Vendedor samir = new Vendedor("Samir", "456", 1500, 10);
        System.out.println("Nome: " + samir.getNome());
        System.out.println("Salario Base R$ " + samir.getSalarioBase());
        System.out.printf("Novo Salario R$ ", samir.calcularSalario());
    }
}