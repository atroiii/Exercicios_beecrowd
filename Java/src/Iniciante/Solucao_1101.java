package Iniciante;
import java.util.ArrayList;
import java.util.Scanner;

public class Solucao_1101 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true) {
            int soma = 0;
            ArrayList<Integer> numeros = new ArrayList<>();
            int num, num2, maior, menor;

            num = input.nextInt();
            num2 = input.nextInt();

            if (num <= 0 || num2 <= 0) {
                break;
            }else {
                if (num > num2) {
                    maior = num;
                    menor = num2;
                } else {
                    maior = num2;
                    menor = num;
                }
                for (int i = menor; i <= maior; i++) {
                    numeros.add(i);
                    soma += i;
                }

                for (Integer numero : numeros) {
                    System.out.print(numero + " ");
                }
                System.out.printf("Sum=%d%n", soma);

            }
        }
            input.close();
    }
}
