import pack.Caminhao;
import pack.Carro;
import pack.Moto;
import pack.Veiculo;

import java.util.ArrayList;

public class Concessionaria {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Toyota", "Corolla", 2022, 120000.0, 4, "Gasolina"));
        veiculos.add(new Moto("Honda", "CB500", 2023, 35000.0, 500));
        veiculos.add(new Caminhao("Volvo", "FH", 2021, 400000.0, 25.0, 4));

        for (Veiculo v : veiculos) {
            System.out.println("-----");
            v.exibirInformacoes();
        }
    }
}