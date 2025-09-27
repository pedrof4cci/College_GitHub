import java.util.ArrayList;

public class ProdutoDAO {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void inserir(Produto produto) {
        produtos.add(produto);
    }

    public ArrayList<Produto> listar() {
        return produtos;
    }

    public Produto buscarPorId(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean excluir(int id) {
        Produto p = buscarPorId(id);
        if (p != null) {
            produtos.remove(p);
            return true;
        }
        return false;
    }
}

