
import java.io.IOException;
import java.util.Scanner;

public class Solucao_1010 {

    public static double CalcularValorAPagar(int numerosDePecas, double valorPecas){
        return numerosDePecas * valorPecas;
    }

    public static void main(String[] args)throws IOException{
        var input = new Scanner(System.in);

        int numPecas1, numDePecas1, numPecas2, numDePecas2;
        double valorPeca1, valorPeca2, resultado;

        numPecas1 = input.nextInt();
        numDePecas1 = input.nextInt();
        valorPeca1 = input.nextDouble();

        numPecas2 = input.nextInt();
        numDePecas2 = input.nextInt();
        valorPeca2 = input.nextDouble();

        resultado = CalcularValorAPagar(numDePecas1,valorPeca1) + CalcularValorAPagar(numDePecas2,valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", resultado);
        input.close();

    }
}
