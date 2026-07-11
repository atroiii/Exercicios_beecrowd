
import java.io.IOException;
import java.util.Scanner;

public class Solucao_1005 {
    public static boolean CalcularSeEstaEntre0E10(double num){// Metodo estatico para num esta entre 0 e 10
        if(num >= 0 && num <= 10){ //if olha se u num entra entre 0 e 10
            return true; //se sim retorna um true
        }else {
            return false;//senão retorna um false
        }
    }

    public static void  main(String[] args)throws IOException {
        var input = new Scanner(System.in);//objeto Scanner para input


        while(true) {// loop infinito
            double pesoUm = 3.5;//peso de A
            double pesoDois = 7.5; //peso de B
            double a = input.nextFloat(); //leitura de A e B
            double b = input.nextFloat();

            boolean aValido = CalcularSeEstaEntre0E10(a);//aqui eu chamo o metodo que se estive entre 0 e 10 aValido receber um TRUE
            boolean bValido = CalcularSeEstaEntre0E10(b);//caso não receber um FALSE esse metodo nas duas variaveis (A e B)

            if(aValido && bValido){// Se 'a' e 'b' forem true vai imprimir o resultado
                double resultando = (a * pesoUm + b * pesoDois)/(pesoUm + pesoDois); //formula da media
                System.out.printf("MEDIA = %.5f%n",resultando);//impressão com cinco casas decimais
                break;// se estou no bloco do if então aqui para o fluxo do while
            }//se não o loop vai roda novamente
        }



        input.close();// fechamento do input
    }
}
