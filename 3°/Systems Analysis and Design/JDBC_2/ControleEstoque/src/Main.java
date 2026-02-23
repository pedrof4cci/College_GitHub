import DAO.Conexao;
import DAO.ProdutoDAO;
import Modelo.Produto;

public class Main {
    public static void main(String[] args) {
        //Produto produto = new Produto("Arroz ABE 5 kg", 2, 35.98);

        ProdutoDAO produtoDAO = new ProdutoDAO();
        //produtoDAO.inserir(produto);

        for(Produto p : produtoDAO.listarTodos()) {
            System.out.print("\n*****************************");
            System.out.print("\nID: " + p.getId());
            System.out.print("\nProduto: " + p.getNome());
            System.out.print("\nQuantidade: " + p.getQuantidade());
            System.out.print("\nPreço R$ " + p.getPreco());
            System.out.print("\nTotal R$ " + p.getQuantidade() * p.getPreco());
        }
    }
}