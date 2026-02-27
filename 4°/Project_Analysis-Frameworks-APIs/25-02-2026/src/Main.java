import java.util.ArrayList;

import formPagamento.*;

void main() {
    Scanner scanOp = new Scanner(System.in); //para o switch case
    Scanner scanh = new Scanner(System.in); //para os cases

    ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();

    int op;

    do{
        System.out.println("------------------------------");
        System.out.println("Gerenciamento de funcionarios");
        System.out.println("------------------------------");
        System.out.println("1- Cadastrar horista");
        System.out.println("2- Cadastrar Assalariado");
        System.out.println("3- Cadastrar Comissionado");
        System.out.println("4- Cadastrar Assalariado Comissionado");
        System.out.println("5- Listar funcionarios");
        System.out.println("0- Sair");
        op = scanOp.nextInt();

        switch (op){
            case 1:
                System.out.println("------------------------------");
                System.out.println("Cadastrar Horista");
                System.out.println("------------------------------");

                //Informações para o Funcionario
                System.out.println("Informe o nome: ");
                String nome = scanh.nextLine();

                System.out.println("Informe o CPF:");
                String CPF = scanh.nextLine();

                System.out.println("Informe o Telefone:");
                int telefone = scanh.nextInt();

                scanh.nextLine(); //erro do buffer

                System.out.println("Informe o Email:");
                String email = scanh.nextLine();

                //Informações Horista
                System.out.println("Informe o valor que ganha por hora trabalhada:");
                float horaTrabalhada= scanh.nextFloat();

                System.out.println("Informe quantos minutos o funcionario trabalhou:");
                int minutosTrabalhados=scanh.nextInt();

                Horista novoHorista = new Horista(CPF, nome, telefone, email, horaTrabalhada, minutosTrabalhados);
                listaDeFuncionarios.add(new Horista(CPF, nome, telefone, email, horaTrabalhada, minutosTrabalhados));

                break;
            case 2:
                System.out.println("------------------------------");
                System.out.println("Assalariado");
                System.out.println("------------------------------");

                //Informações para o Funcionario
                System.out.println("Informe o nome: ");
                String nomeAssalariado = scanh.nextLine();

                System.out.println("Informe o CPF:");
                String CPFAssalariado = scanh.nextLine();

                System.out.println("Informe o Telefone:");
                int telefoneAssalariado = scanh.nextInt();

                scanh.nextLine(); //erro do buffer

                System.out.println("Informe o Email:");
                String emailAssalariado = scanh.nextLine();

                //Informações Assalariado
                System.out.println("Informe o salário mensal do funcionário:");
                float salarioMensal = scanh.nextFloat();

                Assalariado novoAssalariado=new Assalariado(CPFAssalariado, nomeAssalariado, telefoneAssalariado, emailAssalariado, salarioMensal);
                listaDeFuncionarios.add(new Assalariado(CPFAssalariado, nomeAssalariado, telefoneAssalariado, emailAssalariado, salarioMensal));

                break;
            case 3:
                System.out.println("------------------------------");
                System.out.println("Comissionado");
                System.out.println("------------------------------");

                //Informações para o Funcionario
                System.out.println("Informe o nome: ");
                String nomeComissionado = scanh.nextLine();

                System.out.println("Informe o CPF:");
                String CPFComissionado = scanh.nextLine();

                System.out.println("Informe o Telefone:");
                int telefoneComissionado = scanh.nextInt();

                scanh.nextLine(); //erro do buffer

                System.out.println("Informe o Email:");
                String emailComissionado = scanh.nextLine();


                //Informações para o Comissionado
                System.out.println("Informe o percentual de comissão:");
                float percentualComissaoC=scanh.nextFloat();

                System.out.println("Informe o valor total de vendas realizadas pelo funcionário:");
                int valorTotalVendasC=scanh.nextInt();

                Comissionado novoComissionado=new Comissionado(CPFComissionado, nomeComissionado, telefoneComissionado, emailComissionado, percentualComissaoC,valorTotalVendasC);
                listaDeFuncionarios.add(new Comissionado(CPFComissionado, nomeComissionado, telefoneComissionado, emailComissionado, percentualComissaoC,valorTotalVendasC));

                break;
            case 4:
                System.out.println("------------------------------");
                System.out.println("Assalariado Comissionado");
                System.out.println("------------------------------");

                //Informações para o Funcionario
                System.out.println("Informe o nome: ");
                String nomeAC = scanh.nextLine();

                System.out.println("Informe o CPF:");
                String CPFAC = scanh.nextLine();

                System.out.println("Informe o Telefone:");
                int telefoneAC = scanh.nextInt();

                scanh.nextLine(); //erro do buffer

                System.out.println("Informe o Email:");
                String emailAC = scanh.nextLine();


                //Info AC
                System.out.println("Informe o salário mensal:");
                float salarioMensalAC = scanh.nextFloat();

                System.out.println("Informe o percentual de comissão:");
                float percentualComissaoAC= scanh.nextFloat();

                System.out.println("Informe o valor total das vendas:");
                float valorTotalVendaAC= scanh.nextFloat();


                Assalariado_Comissionado novoAC = new Assalariado_Comissionado(CPFAC, nomeAC, telefoneAC, emailAC, salarioMensalAC, percentualComissaoAC, valorTotalVendaAC);
                listaDeFuncionarios.add(new Assalariado_Comissionado(CPFAC, nomeAC, telefoneAC, emailAC, salarioMensalAC, percentualComissaoAC, valorTotalVendaAC));

                break;
            case 5:
                System.out.println("------------------------------");
                System.out.println("Listando funcionarios");
                System.out.println("------------------------------");

                for (Funcionario f : listaDeFuncionarios){
                    f.exibirDetalhes();
                }


                scanh.nextLine();
                scanh.nextLine();
                break;
            case 0:
                break;

            default:
                System.out.println("Opção invalida, tente novamente");
                scanOp.nextLine();
                scanOp.nextLine();
                break;
        }
    }while(op!=0);
    System.out.println(">> Saindo do Sistema");

}
