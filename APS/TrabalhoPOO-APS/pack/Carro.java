package pack;

public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(String marca, String modelo, int ano, double preco, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano, preco);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas);
        System.out.println("Tipo de combustível: " + tipoCombustivel);
    }
}