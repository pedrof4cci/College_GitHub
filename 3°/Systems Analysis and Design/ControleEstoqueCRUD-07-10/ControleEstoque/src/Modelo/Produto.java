package Modelo;

public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto() {
    }

    public Produto(String nome, int quantidade, double preco) {
        this.setNome(nome);
        this.setQuantidade(quantidade);
        this.setPreco(preco);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
