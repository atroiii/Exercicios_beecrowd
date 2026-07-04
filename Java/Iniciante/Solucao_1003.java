package Iniciante;
import java.io.IOException;
import java.util.Scanner;
//lembrar de tirar colocar o Main no lugar de Solucao
public class Solucao_1003 {
    public static void main(String[] args)throws IOException{
        var input = new Scanner(System.in);//objeto Scanner para a leitura das variaveis
        int a, b;//declaração da variaveis A e B

        //leitura das variaveis A e B
        a = input.nextInt();
        b = input.nextInt();

        System.out.printf("SOMA = %d%n",a+b);//Sainda com a soma de A e B
        input.close();//fechamento do Scanner
    }
}
