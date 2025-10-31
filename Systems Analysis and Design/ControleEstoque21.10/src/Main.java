import DAO.Conexao;
import DAO.ProdutoDAO;
import Modelo.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FormGerenciadorEstoque form = new FormGerenciadorEstoque();
        form.setVisible(true);

        /*ProdutoDAO produtoDAO = new ProdutoDAO();
        Scanner scan = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("**** SISTEMA DE CONTROLE DE ESTOQUE ****");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Excluir");
            System.out.println("6 - Sair do Sistema");
            System.out.println("Escolha uma opção no menu: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    //Inserir Produto
                    Produto produto = new Produto();

                    System.out.println("Informe os dados do produto:");
                    scan.nextLine();//limpa buffer
                    System.out.println("Nome: ");
                    produto.setNome(scan.nextLine());
                    System.out.println("Quantidade: ");
                    produto.setQuantidade(scan.nextInt());
                    System.out.println("Preço: ");
                    produto.setPreco(scan.nextDouble());

                    produtoDAO.inserir(produto);
                    break;
                case 2:
                    for(Produto p : produtoDAO.listarTodos()) {
                        System.out.print("\n*****************************");
                        System.out.print("\nID: " + p.getId());
                        System.out.print("\nProduto: " + p.getNome());
                        System.out.print("\nQuantidade: " + p.getQuantidade());
                        System.out.print("\nPreço R$ " + p.getPreco());
                        System.out.print("\nTotal R$ " + p.getQuantidade() * p.getPreco());
                    }
                    break;
                case 3:
                    //Atualizar Produto
                    System.out.println("Informe o código do produto:");
                    int codigo = scan.nextInt();

                    //fazer a validação da existencia deste produto pelo metodo buscarId(id)
                    //Segunda versão
                    //retornar todos os dados do objeto para não termos valores nulos

                    Produto produtoAtualizar = new Produto();

                    System.out.println("Informe os NOVOS dados do produto:");
                    scan.nextLine();//limpa buffer
                    System.out.println("Nome: ");
                    produtoAtualizar.setNome(scan.nextLine());
                    System.out.println("Quantidade: ");
                    produtoAtualizar.setQuantidade(scan.nextInt());
                    System.out.println("Preço: ");
                    produtoAtualizar.setPreco(scan.nextDouble());

                    produtoAtualizar.setId(codigo);
                    produtoDAO.atualizar(produtoAtualizar);
                    break;
                case 4:
                    //Excluir Produto
                    System.out.println("Informe o código do produto:");
                    int codigoExluir = scan.nextInt();

                    produtoDAO.excluir(codigoExluir);

                    break;
            }
        }while(opcao != 6);

        /*
        ATIVIDADES A SEREM REALIZADAS
        TERMINAL
        1 - Implementar o menu - ok
        2 - Implementar os cases para o CRUD - ok
        3 - Implementar as entradas de valores para o insert - ok
        4 - Solicitar o código, listar o produto, e implementar as entradas de valores para o update
        5 - Solicitar o código, e perguntar se realmente deseja excluir o produtom, se sim excluir
        6 - Atualizar o excluir para ativar e inativar

        SWING
        1 - Implementar o menu
        2 - Implementar os BOTÕES E O JTABLE para o CRUD
        3 - Implementar as entradas de valores para o insert
        4 - Solicitar o código, listar o produto, e implementar as entradas de valores para o update
        5 - Solicitar o código, e perguntar se realmente deseja excluir o produtom, se sim excluir
        6 - Atualizar o excluir para ativar e inativar
        */

        /*

        */
        /*

        */
        /*

        */


    }
}