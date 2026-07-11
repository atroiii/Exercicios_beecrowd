import java.io.IOException;
import java.util.Scanner;

public class Solucao_1006{

    public static void main(String[] args) throws IOException {
        var input = new Scanner(System.in); //objeto Scanner para os inputs

        double pesoA = 2; //peso A, B e C
        double pesoB = 3;
        double pesoC = 5;
        double x, y, z, resultado;//declaração das variaveis

        x = input.nextDouble();//leitura dos inputs
        y = input.nextDouble();
        z = input.nextDouble();

        resultado = ((x * pesoA) + (y * pesoB) + (z * pesoC))/(pesoA + pesoB + pesoC );//resultado recebe a media
        System.out.printf("MEDIA = %.1f%n",resultado);//print com uma casa decimal
        input.close();//fechamento do input
    }

}