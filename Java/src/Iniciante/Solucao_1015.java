import java.io.IOException;
import java.util.Scanner;

public class Solucao_1015 {

    public static double calcularDistancia(double x1, double y1, double x2, double y2){//metodo estatico para calcular a distancia
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2 - y1),2));// Math.sqrt raiz Math.pow pontencia
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);//objeto de input

        double x1,x2,y1,y2,resultando;//declaração das variaveis

        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        resultando = calcularDistancia(x1,y1,x2,y2);
        System.out.printf("%.4f%n",resultando);

        input.close();//fechamento do input
    }

}