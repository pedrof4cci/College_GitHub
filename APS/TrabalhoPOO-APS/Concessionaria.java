import pack.Caminhao;
import pack.Carro;
import pack.Moto;
import pack.Veiculo;
import visual.Login;

import java.util.ArrayList;

public class Concessionaria {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        Login login = new Login();
        login.setVisible(true);

        for (Veiculo v : veiculos) {
            System.out.println("-----");
            v.exibirInformacoes();
        }
    }
}