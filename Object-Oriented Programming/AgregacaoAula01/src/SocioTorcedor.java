public class SocioTorcedor {
    private String nome;
    private String categoria;

    public SocioTorcedor(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "SocioTorcedor{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
