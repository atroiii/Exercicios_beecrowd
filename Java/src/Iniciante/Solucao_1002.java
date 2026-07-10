package Iniciante;
import java.io.IOException;
import java.util.Scanner;
//troca Solucao_1002 por Main para testa no BeeCrowd

public class Solucao_1002 {

    static double areaCirculo(double raio){//metodo para calcular a area do circulo onde receber um double e devolver um double
        //tem que ser static para usar o metodo sem precisar instancia um objeto
        final double n = 3.14159;//final para n ser uma constante
        return n * (Math.pow(raio,2)); //formula que = n vezes raio²
    }

    public static void main(String[] args) throws IOException{
        var input = new Scanner(System.in);//objeto Scanner para leitura dos inputs
        double raio = input.nextDouble();//input para leitura do raio

        System.out.printf("A=%.4f%n",areaCirculo(raio));//saida chamando a metodo
        input.close();//fechamento do input
    }
}
