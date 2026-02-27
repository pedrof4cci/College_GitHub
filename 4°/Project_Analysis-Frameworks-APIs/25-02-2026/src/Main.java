import formPagamento.Horista;
import formPagamento.Assalariado_Comissionado;
import formPagamento.Comissionado;
import formPagamento.Assalariado;

void main() {
    Scanner scanOp = new Scanner(System.in);

    Assalariado Pedro = new Assalariado("123.456.789-46", "Pedro Lopes", 4499126, "pedro.lopes@gmail.exemplo", 3014);


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
                System.out.println("op1");
                System.out.println("------------------------------");
                break;
            case 2:
                System.out.println("------------------------------");
                System.out.println("op2");
                System.out.println("------------------------------");
                break;
            case 3:
                System.out.println("------------------------------");
                System.out.println("op3");
                System.out.println("------------------------------");
                break;
            case 4:
                System.out.println("------------------------------");
                System.out.println("op4");
                System.out.println("------------------------------");
                break;
            case 5:
                System.out.println("------------------------------");
                System.out.println("Listando funcionarios");
                System.out.println("------------------------------");

                System.out.println("Nome: " + Pedro.getNome() + " CPF: " + Pedro.getCPF() + " Valor a receber: "+ Pedro.mostra_valor_receber_mensal());
                break;
            case 0:
                System.out.println("------------------------------");
                System.out.println("Saindo");
                System.out.println("------------------------------");
                break;
        }
    }while(op!=0);
    System.out.println(">> Saindo do Sistema");

}
