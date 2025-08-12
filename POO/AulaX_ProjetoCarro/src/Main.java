import models.Carro;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> listCarro = new ArrayList<>();

        // Adicionando objetos Carro na lista
        listCarro.add(new Carro("Toyota", "Corolla", 2020));
        listCarro.add(new Carro("Honda", "Civic", 2019));
        listCarro.add(new Carro("Ford", "Mustang", 2021));
        listCarro.add(new Carro("Chevrolet", "Onix", 2022));
        listCarro.add(new Carro("Volkswagen", "Golf", 2018));
        listCarro.add(new Carro("Fiat", "Argo", 2023));
        listCarro.add(new Carro("Hyundai", "HB20", 2021));
        listCarro.add(new Carro("Jeep", "Renegade", 2020));
        listCarro.add(new Carro("Nissan", "Kicks", 2022));
        listCarro.add(new Carro("Peugeot", "208", 2021));

        Scanner scan = new Scanner(System.in);
        short opcao;
        do {
            System.out.println("---------------------------");
            System.out.println("-------Menu Principal------");
            System.out.println("---------------------------");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Buscar");
            System.out.println("4 - Relatório");
            System.out.println("5 - Excluir");
            System.out.println("6 - Sair do Sistema");
            opcao = scan.nextShort();
            Boolean encontrouCarro = false;

            switch (opcao) {
                case 1:
                    scan.nextLine();
                    System.out.println(">> CADASTRO DE CARROS");
                    Carro novoCarro = new Carro();
                    System.out.println("Informe os dados do veículo");
                    System.out.println("Modelo: ");
                    novoCarro.setModelo(scan.nextLine());

                    System.out.println("Marca: ");
                    novoCarro.setMarca(scan.nextLine());

                    System.out.println("Ano: ");
                    novoCarro.setAno(scan.nextInt());
                    listCarro.add(novoCarro);
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println(">> ALTERAR DADOS DO CARRO");
                    System.out.println("Informe o modelo do carro");
                    String nomeModelo = scan.nextLine();
                    Boolean encontrou = false;
                    int i = 0;
                    for (Carro elemento : listCarro) {
                        if(elemento.getModelo().equals(nomeModelo)){
                            scan.nextLine();
                            System.out.println(">> ATUALIZAÇÃO DE CARROS");

                            Carro alteraCarro = new Carro();
                            System.out.println("Informe os novos dados do veículo");
                            System.out.println("Modelo: ");
                            alteraCarro.setModelo(scan.nextLine());

                            System.out.println("Marca: ");
                            alteraCarro.setMarca(scan.nextLine());

                            System.out.println("Ano: ");
                            alteraCarro.setAno(scan.nextInt());
                            listCarro.set(i, alteraCarro);
                            encontrou = true;
                            break;
                        }
                    }
                    if(!encontrou) System.out.println("Registro não foi encontrado!!!");
                    i++;
                    break;
                case 3:
                    scan.nextLine();
                    System.out.println(">> BUSCAR CARRO");
                    System.out.println(">> ALTERAR DADOS DO CARRO");
                    System.out.println("Informe o modelo do carro");
                    String nomeModeloBuscar = scan.nextLine();


                    for (Carro elemento : listCarro) {
                        if(elemento.getModelo().equals(nomeModeloBuscar)){
                            System.out.println("Modelo: " + elemento.getModelo());
                            System.out.println("Marca: " + elemento.getMarca());
                            System.out.println("Ano: " + elemento.getAno());
                            encontrouCarro = true;
                            break;
                        }
                    }
                    if(!encontrouCarro) System.out.println("Registro não foi encontrado!!!");

                    break;
                case 4:
                    System.out.println(">> RELATÓRIOS DE CARRO");
                    for (Carro elemento : listCarro) {
                        System.out.println("---------------------------------------");
                        System.out.println("Modelo: " + elemento.getModelo());
                        System.out.println("Marca: " + elemento.getMarca());
                        System.out.println("Ano: " + elemento.getAno());
                    }
                    break;
                case 5:
                    System.out.println(">> EXCLUIR");
                    scan.nextLine();
                    System.out.println(">> BUSCAR CARRO");
                    System.out.println("Informe o modelo do carro");
                    nomeModeloBuscar = scan.nextLine();
                    encontrouCarro = false;

                    for (Carro elemento : listCarro) {
                        if(elemento.getModelo().equals(nomeModeloBuscar)){
                            System.out.println("Modelo: " + elemento.getModelo());
                            System.out.println("Marca: " + elemento.getMarca());
                            System.out.println("Ano: " + elemento.getAno());
                            encontrouCarro = true;
                            System.out.println("Deseja excluir? [s]-sim ou [n]-nao");
                            String resposta = scan.nextLine();
                            if(resposta.equals("s") || resposta.equals("S")) {
                                listCarro.remove(elemento);
                                System.out.println("Carro Removido com sucesso");
                            }else {
                                System.out.println("Ação cancelada pelo usuario");
                            }
                            break;
                        }
                    }
                    if(!encontrouCarro) System.out.println("Registro não foi encontrado!!!");

                    break;
                case 6:
                    System.out.println(">> Saindo do Sistema!!!");
                    break;
                default:
                    break;
            }
        }while (opcao != 6);
    }
}