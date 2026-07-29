import java.io.IOException;
import java.util.Scanner;

public class Solucao_1014 {

    public static double calcularConsumo(int a, double b){//metodo estatico para calcular consumo
        return (a + b + Math.abs(a - b)) / 2;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        double y = input.nextDouble();

        System.out.printf("%.3f km/l%n", calcularConsumo(x,y));

        input.close();
    }

}