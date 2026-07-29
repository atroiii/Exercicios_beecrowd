package Iniciante;

import java.util.Scanner;

public class Solucao_1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int valorDeN = n;
        int lista[] = {100, 50, 20, 10, 5, 2, 1};
        int contador100 = 0, contador50 = 0, contador20 = 0, contador10 = 0, contador5 = 0, contador2 = 0, contador1 = 0;

        while (true) {
            if (n > 0 && n < 1000000) {
                for (int i = 0; i < lista.length; i++) {
                    if (n >= lista[0]) {
                        contador100 = n / lista[0];
                        n = n % lista[0];
                    } else if (n >= lista[1]) {
                        contador50 = n / lista[1];
                        n = n % lista[1];
                    } else if (n >= lista[2]) {
                        contador20 = n / lista[2];
                        n = n % lista[2];
                    } else if (n >= lista[3]) {
                        contador10 = n / lista[3];
                        n = n % lista[3];
                    } else if (n >= lista[4]) {
                        contador5 = n / lista[4];
                        n = n % lista[4];
                    } else if (n >= lista[5]) {
                        contador2 = n / lista[5];
                        n = n % lista[5];
                    } else if (n >= lista[6]) {
                        contador1 = n / lista[6];
                        n = n % lista[6];
                    } else if (n <= 0) {
                        break;
                    }
                }
                System.out.printf("%d%n", valorDeN);
                System.out.printf("%d nota(s) de R$ 100,00%n", contador100);
                System.out.printf("%d nota(s) de R$ 50,00%n", contador50);
                System.out.printf("%d nota(s) de R$ 20,00%n", contador20);
                System.out.printf("%d nota(s) de R$ 10,00%n", contador10);
                System.out.printf("%d nota(s) de R$ 5,00%n", contador5);
                System.out.printf("%d nota(s) de R$ 2,00%n", contador2);
                System.out.printf("%d nota(s) de R$ 1,00%n", contador1);
                input.close();
                break;

            }
        }
    }
}