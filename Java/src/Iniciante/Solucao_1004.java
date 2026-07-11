package Iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Solucao_1004 {
    public static void main(String[] args)throws IOException {
        var input = new Scanner(System.in); //Objeto Scanner para leituras das variaveis X e Y
        int x = input.nextInt();
        int y = input.nextInt();
        int prod = x * y; // variavel prod receber X vezes Y
        System.out.printf("PROD = %d%n",prod);// impressão de prod %n(pula linha)
        input.close();//fechamento do input
    }
}
