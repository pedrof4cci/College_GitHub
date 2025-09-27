import java.util.Scanner;

public class SistemaRecursos {
    private ProdutoDAO dao = new ProdutoDAO();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        int opcao;
        do {
            System.out.println("\n--- Sistema de Controle de Produtos ---");
            System.out.println("1. Inserir produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Buscar produto por ID");
            System.out.println("4. Excluir produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    inserirProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    buscarProduto();
                    break;
                case 4:
                    excluirProduto();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void inserirProduto() {
        System.out.print("Digite o ID do produto: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        Produto produto = new Produto(id, nome);
        dao.inserir(produto);
        System.out.println("Produto inserido com sucesso!");
    }

    private void listarProdutos() {
        System.out.println("\nLista de produtos:");
        for (Produto p : dao.listar()) {
            System.out.println(p);
        }
    }

    private void buscarProduto() {
        System.out.print("Digite o ID do produto: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Produto p = dao.buscarPorId(id);
        if (p != null) {
            System.out.println("Produto encontrado: " + p);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private void excluirProduto() {
        System.out.print("Digite o ID do produto a excluir: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (dao.excluir(id)) {
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}

