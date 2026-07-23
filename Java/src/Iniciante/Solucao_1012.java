import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double areaRaioCirculo(double raio) {
        final double pi = 3.14159;
        return pi * Math.pow(raio, 2);
    }

    public static double areaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;

    }

    public static double areaQuadrado(double lado) {
        return lado * lado;
    }

    public static double areaRetagulo(double lado, double altura) {
        return lado * altura;
    }

    public static void main(String[] args) throws IOException {
        var input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo(a,c));
        System.out.printf("CIRCULO: %.3f%n", areaRaioCirculo(c));
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio(a,b,c));
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado(b));
        System.out.printf("RETANGULO: %.3f%n", areaRetagulo(a,b));

        input.close();
    }
}
