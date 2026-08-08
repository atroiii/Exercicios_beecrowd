package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Solucao_1020 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int anos = 0, meses = 0, dias = 0 , x;
        x = input.nextInt();

        while (true) {
            if (x > 365) {
                x = x - 365;
                anos++;
            } else if (x >= 30 && x < 365) {
                x = x - 30;
                meses++;
            } else if (x < 30) {
                dias++;
                x = x - 1;
            }
            if(x == 0){
                break;
            }
        }

        System.out.printf("%d ano(s)%n",anos);
        System.out.printf("%d mese(s)%n",meses);
        System.out.printf("%d dia(s)%n",dias);

        input.close();
    }
}