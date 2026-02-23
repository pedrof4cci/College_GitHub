public class Produto {
    private String nomeProduto;
    private int idProduto;
    private String categoriaProduto;

    public Produto (String nomeProduto, int idProduto, String categoriaProduto){
        this.nomeProduto = nomeProduto;
        this.idProduto = idProduto;
        this.categoriaProduto = categoriaProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }
}
