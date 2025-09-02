public class Venda extends Produto {
    private int numeroVenda;
    private int quantidadeVendida;

    public Venda(String nomeProduto, int idProduto, String categoriaProduto, int numeroVenda, int quantidadeVendida){
        super(nomeProduto, idProduto, categoriaProduto);
        this.numeroVenda = numeroVenda;
        this.quantidadeVendida = quantidadeVendida;
    }


    public int getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda() {
        this.numeroVenda = numeroVenda;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
}
