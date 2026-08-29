import java.io.IOException;
import java.util.Scanner;

public class Solucao_1036 {

    public static double delta(double a, double b, double c) { // metodo para calcular o delta
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public static double[] calcularBhaskara(double a, double b, double c, double delta) {//metodo para calcular as raizes com retorno em um array para retorna tanto
        double r1 = (-b + Math.sqrt(delta)) / (2 * a);//quando a raiz delta for positivo
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);//quanto negativo
        double[] raizes = {r1, r2};
        return raizes;
    }


    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        double[] raizes = new double[2];
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean flag = true;
        double delta = delta(a, b, c);


        if ( a == 0 || delta < 0 ) {//ser a  igual a 0 ou delta e nagativo então não existem raizes
            System.out.println("Impossivel calcular");
        } else {
            raizes = calcularBhaskara(a, b, c, delta);//chamo a metodo
            int i = 1;//contador para imprimir R1 e R2
            for (double raiz : raizes){
                System.out.printf("R%d = %.5f%n", i, raiz);
                i++;
            }
        }
        input.close();//fechamento do input
    }
}