import dao.LoginDao;
import model.Login;

import java.util.Scanner;

public class Main {

    static LoginDao loginDao = new LoginDao();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        TelaPrincipalMenu telaMenu = new TelaPrincipalMenu();
        telaMenu.setVisible(true); //chama tela menu

        /* TelaPrincipalBotoes tpb = new TelaPrincipalBotoes();
        tpb.setVisible(true);   //chama tela de botoes
         */

        /*
        FormCadastroLogin formCadastroLogin = new FormCadastroLogin();
        formCadastroLogin.setVisible(true); //chama tela de formulário

         */


        /*int opcao;
        do {
            System.out.println("-----------------");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Listar usuário");
            System.out.println("3. Sair");
            System.out.println("Informe uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            loginDao.inserirLogin(new Login("Pedro", "pedrolas@gmail.com", "SenhaSecreta123", "2025-07-01", "2025-08-18"));
            loginDao.inserirLogin(new Login("Maria", "maria.silva@gmail.com", "SenhaForte456", "2025-06-15", "2025-08-10"));
            loginDao.inserirLogin(new Login("João", "joao123@hotmail.com", "JoaoSenha789", "2025-05-20", "2025-08-12"));
            loginDao.inserirLogin(new Login("Ana", "ana.costa@yahoo.com", "Costa@2025", "2025-07-05", "2025-08-17"));
            loginDao.inserirLogin(new Login("Lucas", "lucas_oliveira@gmail.com", "LcsOlv#001", "2025-04-11", "2025-08-13"));
            loginDao.inserirLogin(new Login("Fernanda", "fernanda.moura@gmail.com", "F3r!2025", "2025-06-25", "2025-08-16"));
            loginDao.inserirLogin(new Login("Carlos", "carlos.santos@hotmail.com", "Carl0s2025", "2025-03-30", "2025-08-14"));
            loginDao.inserirLogin(new Login("Juliana", "juliana_ferreira@gmail.com", "Jul@1234", "2025-05-01", "2025-08-15"));
            loginDao.inserirLogin(new Login("Rafael", "rafael.azevedo@yahoo.com", "RafPass!55", "2025-06-10", "2025-08-18"));
            loginDao.inserirLogin(new Login("Beatriz", "bia.martins@gmail.com", "BiaMartins#2025", "2025-07-02", "2025-08-17"));

            switch (opcao) {
                case 1:
                    System.out.println("Cadastro de Usuário");

                    Login login = new Login("Pedro", "pedrolas@gmail.com", "SenhaSecreta123", "2025-07-01");

                    System.out.println("Informe o nome do usuário: ");
                    login.setNome(scan.nextLine());

                    System.out.println("Informe o e-mail: ");
                    login.setEmail(scan.nextLine());

                    System.out.println("Informe a Senha: ");
                    login.setSenha(scan.nextLine());

                    System.out.println("Informe [false] para inativo e [true] para ativo");
                    login.setAtivo(scan.nextBoolean());

                    login.setDataCadastro("2025-10-10");
                    loginDao.inserirLogin(login);

                    break;
                case 2:
                    System.out.println("Lista de Usuário");
                    System.out.println(loginDao.getLista());

                    for (Login l : loginDao.getLista()){
                        System.out.println("######################################");
                        System.out.println("Nome: " + l.getNome());
                        System.out.println("Email: " + l.getEmail());
                        System.out.println("Senha: " + l.getSenha());
                        System.out.println("Ativo: " + l.isAtivo());
                        System.out.println("Data Cadastro: " + l.getDataCadastro());
                        System.out.println("Data da última atualização: " + l.getDataAtualizacao());
                        System.out.println("######################################");
                    }

                    break;
                case 3:
                    System.out.println("Saindo do Sistema");
                    break;
                default:
                    System.out.println("Opção Inválida, tente novamente");
                    break;
            }
        }while (opcao != 3);

         */
    }
}