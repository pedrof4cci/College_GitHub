

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(45);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Comprimento do círculo: " + circulo.calcularComprimento());
        System.out.println("-------------------------------!");
        Quadrado quadrado = new Quadrado(25);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Comprimento do quadrado: " + quadrado.calcularComprimento());
    }
}
