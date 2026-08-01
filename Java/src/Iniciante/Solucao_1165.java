package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Solucao_1165 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        var numeros = new ArrayList<Integer>();
        int n = 0;

        while (flag) {
            n = input.nextInt();
            if (n >= 1 && n <= 100) {
                flag = false;
            }
        }

        while (numeros.size() != n) {
            int x = input.nextInt();
            if (x > 1 && x <= Math.pow(10,7)) {
                numeros.add(x);
            }
        }
        for (Integer num : numeros) {
            boolean flagPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flagPrimo = false;
                    break;
                }
            }
            if (flagPrimo) {
                System.out.println(num + " eh primo");
            } else {
                System.out.println(num + " nao eh primo");
            }

        }
    }
}