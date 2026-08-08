package Iniciante;

import java.util.Scanner;

public class Solucao_1011 {

    public static double CalcularVolumeEsfera(double raioEsfera){
        final double pi = 3.14159;
        final double primeiroTermo = 4.0/3;
        return primeiroTermo * pi * Math.pow(raioEsfera,3);
    }

    public static void main(String[] args){
        var input = new Scanner(System.in);

        double raioEsfera = input.nextDouble();
        System.out.printf("VOLUME = %.3f%n",CalcularVolumeEsfera(raioEsfera));

        input.close();
    }
}
