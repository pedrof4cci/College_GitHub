public class Quadrado implements I_FiguraGeometrica {
    private final double setLado;
    private double lado;

    public Quadrado(double lado) {
        this.setLado = lado;
    }

    @Override
    public double calcularArea() {
        double areaQuadrado = lado * lado;
        return areaQuadrado;
    }

    @Override
    public double calcularComprimento() {
        double comprimentoQuadrado = 2 * (lado + lado);
        return comprimentoQuadrado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
