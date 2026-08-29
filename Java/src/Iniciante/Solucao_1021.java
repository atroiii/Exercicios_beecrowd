import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Solucao_1021 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        double[] moedas = {0.50, 0.25, 0.10, 0.05, 0.01};
        double[] moedasVezes100 = new double[5];
        int i = 0;
        double contador100 = 0, contador50 = 0, contador20 = 0, contador10 = 0, contador5 = 0, contador2 = 0, contador1 = 0,
                contador050 = 0, contador025 = 0, contador010 = 0, contador005 = 0, contador001 = 0;

        double entrada = input.nextDouble();


        for (double m : moedas) {
            moedasVezes100[i] = m * 100;
            i++;
        }


        while (true) {
            if (entrada > 100) {
                contador100 = entrada / notas[0];
                entrada = entrada % notas[0];
            } else if (entrada >= 50 && entrada < 100) {
                contador50 = entrada / notas[1];
                entrada = entrada % notas[1];
            } else if (entrada >= 20 && entrada < 50) {
                contador20 = entrada / notas[2];
                entrada = entrada % notas[2];
            } else if (entrada >= 10 && entrada < 20) {
                contador10 = entrada / notas[3];
                entrada = entrada % notas[3];
            } else if (entrada >= 5 && entrada < 10) {
                contador5 = entrada / notas[4];
                entrada = entrada % notas[4];
            } else if (entrada >= 2 && entrada < 5) {
                contador2 = entrada / notas[5];
                entrada = entrada % notas[5];
            } else if (entrada >= 1 && entrada < 2) {
                contador1 = entrada / notas[6];
                entrada = entrada % notas[6];
            } else if (entrada < 1) {
                break;
            }
        }

        double entradaC = entrada * 100;
        BigDecimal bdC = BigDecimal.valueOf(entradaC);
        bdC = bdC.setScale(0, RoundingMode.DOWN);
        entradaC = bdC.doubleValue();

        while (true){

            if (entradaC >= 50 && entradaC < 100) {
                contador050 = entradaC / moedasVezes100[0];
                entradaC = entradaC % moedasVezes100[0];
            } else if (entradaC >= 25 && entradaC < 50) {
                contador025 = entradaC / moedasVezes100[1];
                entradaC = entradaC % moedasVezes100[1];
            } else if (entradaC >= 10 && entradaC < 25) {
                contador010 = entradaC / moedasVezes100[2];
                entradaC = entradaC % moedasVezes100[2];
            } else if (entradaC >= 5 && entradaC < 10) {
                contador005 = entradaC / moedasVezes100[3];
                entradaC = entradaC % moedasVezes100[3];
            } else if (entradaC >= 1 && entradaC < 5) {
                contador001 = entradaC / moedasVezes100[4];
                entradaC = entradaC % moedasVezes100[4];
            }else if (entradaC < 1){
                break;
            }
        }

        System.out.println("NOTAS:");
        System.out.printf("%.0f nota(s) de R$ 100.00%n", Math.floor(contador100));
        System.out.printf("%.0f nota(s) de R$ 50.00%n", Math.floor(contador50));
        System.out.printf("%.0f nota(s) de R$ 20.00%n", Math.floor(contador20));
        System.out.printf("%.0f nota(s) de R$ 10.00%n", Math.floor(contador10));
        System.out.printf("%.0f nota(s) de R$ 5.00%n", Math.floor(contador5));
        System.out.printf("%.0f nota(s) de R$ 2.00%n", Math.floor(contador2));

        System.out.println("MOEDAS:");
        System.out.printf("%.0f moeda(s) de R$ 1.00%n", Math.floor(contador1));
        System.out.printf("%.0f moeda(s) de R$ 0.50%n", Math.floor(contador050));
        System.out.printf("%.0f moeda(s) de R$ 0.25%n", Math.floor(contador025));
        System.out.printf("%.0f moeda(s) de R$ 0.10%n", Math.floor(contador010));
        System.out.printf("%.0f moeda(s) de R$ 0.05%n", Math.floor(contador005));
        System.out.printf("%.0f moeda(s) de R$ 0.01%n", Math.floor(contador001));

    }
}