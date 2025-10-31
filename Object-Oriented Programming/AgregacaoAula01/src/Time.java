public class Time {
    private String nome;
    private Estadio estadio;
    private SocioTorcedor socioTorcedor;

    public Time(String nome, Estadio estadio, SocioTorcedor socioTorcedor) {
        this.nome = nome;
        this.estadio = estadio;
        this.socioTorcedor = socioTorcedor;
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", estadio=" + estadio +
                ", socioTorcedor=" + socioTorcedor +
                '}';
    }
}
