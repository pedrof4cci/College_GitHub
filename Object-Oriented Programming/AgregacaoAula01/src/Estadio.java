public class Estadio {
    private String nome;
    private String cidade;

    public Estadio(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }



    @Override
    public String toString() {
        return "Estadio{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
