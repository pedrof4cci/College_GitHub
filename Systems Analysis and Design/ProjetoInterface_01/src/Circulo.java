public class Circulo implements I_FiguraGeometrica {
    private final double setRaio;
    private double raio;
    public static final double PI = 3.141592;

    public Circulo(double raio) {
        this.setRaio = raio;
    }
    @Override
    public double calcularArea() {
        double areaCirculo = PI * this.getRaio() * this.getRaio();
        return areaCirculo;
    }
    @Override
    public double calcularComprimento() {
        double comprimentoCirculo = 2 * PI * this.getRaio();
        return comprimentoCirculo;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
