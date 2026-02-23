package pack;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private int numeroEixos;

    public Caminhao(String marca, String modelo, int ano, double preco, double capacidadeCarga, int numeroEixos) {
        super(marca, modelo, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
        System.out.println("Número de eixos: " + numeroEixos);
    }
}