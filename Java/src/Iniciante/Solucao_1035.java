package Iniciante;

import java.util.Scanner;

public class Solucao_1035 {
    public static boolean ehPar(int num) {
        return num % 2 == 0;
    }

    public static boolean ehMaior(int num1, int num2) {
        return num1 > num2;
    }

    public static boolean somaABMaiorQueCD(int a, int b, int c, int d) {
        return c + d > a + b;
    }

    public static boolean ehPositivoCD(int c, int d) {
        return c >= 0 && d >= 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        if (ehMaior(b, c) && ehMaior(d, a) && somaABMaiorQueCD(a, b, c, d) && ehPositivoCD(c, d) && ehPar(a)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }
        input.close();
    }
}