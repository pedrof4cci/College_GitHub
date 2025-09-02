import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*
        Pessoa pessoa = new Pessoa("Pedro", "email@email.com","123123123");
        Funcionario carol = new Funcionario("54321", "marketing", 50000, "Carol", "email!!!@","123321321");

        System.out.println("--------------------");
        System.out.println(carol.getSetor());
        System.out.println("--------------------");
        System.out.println("Nome: "+ carol.getNome());
        System.out.println("Email: "+carol.getEmail());
        System.out.println("CPF: "+carol.getCPF());
        System.out.println("--------------------");
        System.out.println("Matricula: "+carol.getMatricula());
        System.out.println("Salário: "+carol.getSalarioBase());
        System.out.println("--------------------");
 */

        Venda venda = new Venda("trembolona", 999, "produtos naturais", 4, 99999);
/*
        System.out.println("Digite o Número da Venda: ");
        venda.setNumeroVenda(scan.nextInt());
        System.out.println("Digite o Nome do Produto: ");
        System.out.println("Digite o Categoria do Produto: ");
        System.out.println("Digite o Id do Produto: ");
        System.out.println("Digite o Quantidade Vendida: ");
 */

        System.out.println("--------------------");
        System.out.println("Número da Venda: "+ venda.getNumeroVenda());
        System.out.println("Nome do Produto: " + venda.getNomeProduto());
        System.out.println("Categoria do Produto: " + venda.getCategoriaProduto());
        System.out.println("Id do Produto: " + venda.getIdProduto());
        System.out.println("Quantidade Vendida: " + venda.getQuantidadeVendida());
        System.out.println("--------------------");
    }
}