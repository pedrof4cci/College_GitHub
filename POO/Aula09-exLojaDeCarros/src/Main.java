import Pack.Caminhao;
import Pack.Carro;
import Pack.Moto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao();
        Scanner scan = new Scanner(System.in);
        Scanner scanOp = new Scanner(System.in);

        ArrayList<Carro> listCarro = new ArrayList<>();
        ArrayList<Moto> listMoto = new ArrayList<>();
        ArrayList<Caminhao> listCaminhao = new ArrayList<>();

        int op;

        do {
            System.out.println(">> Menu <<");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Adicionar veiculo");
            System.out.println("2 - Alterar");
            System.out.println("3 - Buscar");
            System.out.println("4 - Listar Todos");
            System.out.println("5 - Excluir um veiculo");
            System.out.println("6 - Sair");
            op = scanOp.nextInt();
            Boolean encontrouCarro = false;
            Boolean encontrouMoto = false;
            Boolean encontrouCaminhao = false;

            switch (op){
                case 1:             //--------Registros--------
                    int op2;

                    System.out.println("Selecione uma veiculo para adicionar: ");
                    System.out.println("1 - Carro");
                    System.out.println("2 - Moto");
                    System.out.println("3 - Caminhão");
                    op2 = scanOp.nextInt();

                    if(op2==1 || op2==2 || op2==3){
                        if(op2==1){
                            Carro novoCarro = new Carro();
                            System.out.println("Informe os dados do carro");
                            System.out.println("Modelo: ");
                            novoCarro.setModelo(scan.nextLine());

                            System.out.println("Marca: ");
                            novoCarro.setMarca(scan.nextLine());

                            System.out.println("Ano: ");
                            novoCarro.setAno(scan.nextInt());
                            listCarro.add(novoCarro);
                        }
                        if(op2==2){
                            Moto novaMoto = new Moto();
                            System.out.println("Informe os dados da moto");
                            System.out.println("Modelo: ");
                            novaMoto.setModelo(scan.nextLine());

                            System.out.println("Marca: ");
                            novaMoto.setMarca(scan.nextLine());

                            System.out.println("Ano: ");
                            novaMoto.setAno(scan.nextInt());
                            listMoto.add(novaMoto);
                        }
                        if(op2==3){
                            Caminhao novoCaminhao = new Caminhao();
                            System.out.println("Informe os dados da moto");
                            System.out.println("Modelo: ");
                            novoCaminhao.setModelo(scan.nextLine());

                            System.out.println("Marca: ");
                            novoCaminhao.setMarca(scan.nextLine());

                            System.out.println("Ano: ");
                            novoCaminhao.setAno(scan.nextInt());
                            listCaminhao.add(novoCaminhao);
                        }
                    }else System.out.println("Opção invalida!");



                case 2:                        //--------Altera Dados--------
                    int op3;
                    System.out.println("Selecione uma veiculo para alterar os dados: ");
                    System.out.println("1 - Moto");
                    System.out.println("2 - Carro");
                    System.out.println("3 - Caminhão");
                    op3 = scanOp.nextInt();

                    if(op3==1 || op3==2 || op3==3){
                        if(op3==1){
                            scan.nextLine();
                            System.out.println(">> Alterar dados da moto");
                            System.out.println("Informe o modelo da moto");
                            String nomeModelo = scan.nextLine();
                            Boolean encontrou = false;
                            int i = 0;
                            for (Moto elemento : listMoto) {
                                if(elemento.getModelo().equals(nomeModelo)){
                                    scan.nextLine();
                                    System.out.println(">> ATUALIZAÇÃO DE MOTOS");

                                    Moto alteraMoto = new Moto();
                                    System.out.println("Informe os novos dados do veículo");
                                    System.out.println("Modelo: ");
                                    alteraMoto.setModelo(scan.nextLine());

                                    System.out.println("Marca: ");
                                    alteraMoto.setMarca(scan.nextLine());

                                    System.out.println("Ano: ");
                                    alteraMoto.setAno(scan.nextInt());
                                    listMoto.set(i, alteraMoto);
                                    encontrou = true;
                                    break;
                                }
                                i++;
                            }
                            if(!encontrou) System.out.println("Registro não foi encontrado!!!");

                        }
                        if(op3==2){
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
                                i++;
                            }
                            if(!encontrou) System.out.println("Registro não foi encontrado!!!");
                        }
                        if(op3==3){
                            scan.nextLine();
                            System.out.println(">> Alterar dados do caminhão");
                            System.out.println("Informe o modelo do caminhão");
                            String nomeModelo = scan.nextLine();
                            Boolean encontrou = false;
                            int i = 0;
                            for (Caminhao elemento : listCaminhao) {
                                if(elemento.getModelo().equals(nomeModelo)){
                                    scan.nextLine();
                                    System.out.println(">> ATUALIZAÇÃO DE CAMINHÕES");

                                    Caminhao alteraCaminhao = new Caminhao();
                                    System.out.println("Informe os novos dados do veículo");
                                    System.out.println("Modelo: ");
                                    alteraCaminhao.setModelo(scan.nextLine());

                                    System.out.println("Marca: ");
                                    alteraCaminhao.setMarca(scan.nextLine());

                                    System.out.println("Ano: ");
                                    alteraCaminhao.setAno(scan.nextInt());
                                    listCaminhao.set(i, alteraCaminhao);
                                    encontrou = true;
                                    break;
                                }
                                i++;
                            }
                            if(!encontrou) System.out.println("Registro não foi encontrado!!!");
                        }
                    }else System.out.println("Opção invalida!");
                    break;





                case 3:             //--------Busca veiculo--------
                    int op4;
                    System.out.println("Selecione uma veiculo para buscar: ");
                    System.out.println("1 - Carro");
                    System.out.println("2 - Moto");
                    System.out.println("3 - Caminhão");
                    op4 = scanOp.nextInt();


                    if(op4==1 || op4==2 || op4==3){
                        if(op4==1){
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
                        }
                        if(op4==2){
                            scan.nextLine();
                            System.out.println(">> BUSCAR Moto");
                            System.out.println(">> ALTERAR DADOS Da Moto");
                            System.out.println("Informe o modelo da moto");
                            String nomeModeloBuscar = scan.nextLine();


                            for (Moto elemento : listMoto) {
                                if(elemento.getModelo().equals(nomeModeloBuscar)){
                                    System.out.println("Modelo: " + elemento.getModelo());
                                    System.out.println("Marca: " + elemento.getMarca());
                                    System.out.println("Ano: " + elemento.getAno());
                                    encontrouMoto = true;
                                    break;
                                }
                            }
                            if(!encontrouMoto) System.out.println("Registro não foi encontrado!!!");
                        }
                        if(op4==3){
                            scan.nextLine();
                            System.out.println(">> BUSCAR Caminhao");
                            System.out.println(">> ALTERAR DADOS Do Caminhao");
                            System.out.println("Informe o modelo do Caminhao");
                            String nomeModeloBuscar = scan.nextLine();


                            for (Caminhao elemento : listCaminhao) {
                                if(elemento.getModelo().equals(nomeModeloBuscar)){
                                    System.out.println("Modelo: " + elemento.getModelo());
                                    System.out.println("Marca: " + elemento.getMarca());
                                    System.out.println("Ano: " + elemento.getAno());
                                    encontrouCaminhao = true;
                                    break;
                                }
                            }
                            if(!encontrouCaminhao) System.out.println("Registro não foi encontrado!!!");
                        }
                    }else System.out.println("Opção invalida!");
                    break;



                case 4:         //------------Lista veiculos cadastrados-----------------
                    int op5;
                    System.out.println("Selecione uma veiculo para listar: ");
                    System.out.println("1 - Carro");
                    System.out.println("2 - Moto");
                    System.out.println("3 - Caminhão");
                    op5 = scanOp.nextInt();


                    if(op5==1 || op5==2 || op5==3){
                        if(op5==1){
                            System.out.println(">> RELATÓRIOS DE CARRO");
                            for (Carro elemento : listCarro) {
                                System.out.println("---------------------------------------");
                                System.out.println("Modelo: " + elemento.getModelo());
                                System.out.println("Marca: " + elemento.getMarca());
                                System.out.println("Ano: " + elemento.getAno());
                            }
                        }
                        if(op5==2){
                            System.out.println(">> RELATÓRIOS DE Motos");
                            for (Moto elemento : listMoto) {
                                System.out.println("---------------------------------------");
                                System.out.println("Modelo: " + elemento.getModelo());
                                System.out.println("Marca: " + elemento.getMarca());
                                System.out.println("Ano: " + elemento.getAno());
                            }
                        }
                        if(op5==3){
                            System.out.println(">> RELATÓRIOS DE Caminhoes");
                            for (Caminhao elemento : listCaminhao) {
                                System.out.println("---------------------------------------");
                                System.out.println("Modelo: " + elemento.getModelo());
                                System.out.println("Marca: " + elemento.getMarca());
                                System.out.println("Ano: " + elemento.getAno());
                            }
                        }
                    }else System.out.println("Opção invalida!");
                    break;





                case 5:             //------------------Excluí veiculos-------------------
                    int op6;
                    System.out.println("Selecione uma veiculo para listar: ");
                    System.out.println("1 - Carro");
                    System.out.println("2 - Moto");
                    System.out.println("3 - Caminhão");
                    op6 = scanOp.nextInt();

                    if(op6==1 || op6==2 || op6==3){
                        if(op6==1){
                            System.out.println(">> EXCLUIR");
                            scan.nextLine();
                            System.out.println(">> BUSCAR CARRO");
                            System.out.println("Informe o modelo do carro");
                            String nomeModeloBuscar = scan.nextLine();
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

                        }
                        if(op6==2){
                            System.out.println(">> EXCLUIR");
                            scan.nextLine();
                            System.out.println(">> BUSCAR Moto");
                            System.out.println("Informe o modelo do moto");
                            String nomeModeloBuscar = scan.nextLine();
                            encontrouCarro = false;

                            for (Moto elemento : listMoto) {
                                if(elemento.getModelo().equals(nomeModeloBuscar)){
                                    System.out.println("Modelo: " + elemento.getModelo());
                                    System.out.println("Marca: " + elemento.getMarca());
                                    System.out.println("Ano: " + elemento.getAno());
                                    encontrouCarro = true;
                                    System.out.println("Deseja excluir? [s]-sim ou [n]-nao");
                                    String resposta = scan.nextLine();
                                    if(resposta.equals("s") || resposta.equals("S")) {
                                        listMoto.remove(elemento);
                                        System.out.println("Moto Removida com sucesso");
                                    }else {
                                        System.out.println("Ação cancelada pelo usuario");
                                    }
                                    break;
                                }
                            }
                            if(!encontrouMoto) System.out.println("Registro não foi encontrado!!!");
                        }
                        if(op6==3){
                            System.out.println(">> EXCLUIR");
                            scan.nextLine();
                            System.out.println(">> BUSCAR Caminhao");
                            System.out.println("Informe o modelo do caminhao");
                            String nomeModeloBuscar = scan.nextLine();
                            encontrouCaminhao = false;

                            for (Caminhao elemento : listCaminhao) {
                                if(elemento.getModelo().equals(nomeModeloBuscar)){
                                    System.out.println("Modelo: " + elemento.getModelo());
                                    System.out.println("Marca: " + elemento.getMarca());
                                    System.out.println("Ano: " + elemento.getAno());
                                    encontrouCaminhao = true;
                                    System.out.println("Deseja excluir? [s]-sim ou [n]-nao");
                                    String resposta = scan.nextLine();
                                    if(resposta.equals("s") || resposta.equals("S")) {
                                        listCaminhao.remove(elemento);
                                        System.out.println("Caminhao Removido com sucesso");
                                    }else {
                                        System.out.println("Ação cancelada pelo usuario");
                                    }
                                    break;
                                }
                            }
                            if(!encontrouCaminhao) System.out.println("Registro não foi encontrado!!!");
                        }
                    }else System.out.println("Opção invalida!");
                    break;



                default:
                    System.out.println("Opção inválida, tente novamente!!!");
                    break;
            }
        }while(op!=6);
        System.out.println(">> Saindo do Sistema!!!");

    }
}