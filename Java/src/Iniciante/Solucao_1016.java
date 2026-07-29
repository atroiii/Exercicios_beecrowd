import java.io.IOException;
import java.util.Scanner;


public class Solucao_1016 {


        public static int calculartempoParaDistancia(int km){
            return km * 2;
        }

        public static void main(String[] args)throws IOException{
            Scanner input = new Scanner(System.in);
            int km = input.nextInt();

            System.out.printf("%d minutos%n", calculartempoParaDistancia(km));

            input.close();

        }
    }


