import DAO.Conexao;
import DAO.ProdutoDAO;
import Modelo.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n# Controle de Estoque #");
            System.out.println("escolha uma opção:");
            System.out.println("1 - Inserir Produto");
            System.out.println("2 - Listar Produto");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Excluir Produto");
            System.out.println("0 - Sair");
            op = scanner.nextInt();

            switch (op){
                case 1: //inserir produto
                    Produto produto = new Produto();

                    System.out.println("digite as informações do produto:");
                    scanner.nextLine();
                    System.out.println("Digite o nome do produto:");
                    produto.setNome(scanner.nextLine());
                    System.out.println("Digite a quantidade:");
                    produto.setQuantidade(scanner.nextInt());
                    System.out.println("Digite o preço:");
                    produto.setPreco(scanner.nextDouble());

                    produtoDAO.inserir(produto);
                    break;
                case 2://listar produto
                    for(Produto p : produtoDAO.listarTodos()) {
                        System.out.print("\n*****************************");
                        System.out.print("\nID: " + p.getId());
                        System.out.print("\nProduto: " + p.getNome());
                        System.out.print("\nQuantidade: " + p.getQuantidade());
                        System.out.print("\nPreço R$ " + p.getPreco());
                        System.out.print("\nTotal R$ " + p.getQuantidade() * p.getPreco());
                        System.out.print("\n*****************************");
                    }
                    break;
                case 3://atualizar produto
                    Produto produtoAtualizar = new Produto();
                    System.out.println("Digite o ID do produto que deseja atualizar:");
                    produtoAtualizar.setId(scanner.nextInt());

                    System.out.println("digite as novas informações do produto:");
                    scanner.nextLine();
                    System.out.println("Digite o NOVO nome do produto:");
                    produtoAtualizar.setNome(scanner.nextLine());
                    System.out.println("Digite a NOVA quantidade:");
                    produtoAtualizar.setQuantidade(scanner.nextInt());
                    System.out.println("Digite o NOVO preço:");
                    produtoAtualizar.setPreco(scanner.nextDouble());

                    produtoDAO.atualizar(produtoAtualizar);
                    break;
                case 4://excluir produto
                    System.out.println("Digite o ID do produto que deseja excluir:");
                    int idExcluir = scanner.nextInt();
                        produtoDAO.excluir(idExcluir);
                    break;
            }
        }while(op != 0);


        /*
        1 - Implementar o menu
        2 - Implementar os cases para o CRUD
        3 - Implementar as entradas de valores para o insert
        4 - Solicitar o código, listar o produto, e implementar as entradas de valores para o update
        5 - Solicitar o código, e perguntar se realmente deseja excluir o produtom, se sim excluir
        6 - Atualizar o excluir para ativar e inativar
        */

        /*
        //Inserir Produto
        Produto produto = new Produto("Azeite", 1, 52.98);
        produtoDAO.inserir(produto);
        */
        /*
        //Atualizar Produto
        Produto produtoAtualizar = new Produto("Manteiga", 5, 11.95);
        produtoAtualizar.setId(3);
        produtoDAO.atualizar(produtoAtualizar);
        */
        /*
        //Excluir Produto
        produtoDAO.excluir(3);
        */


    }
}