package Iniciante;
import java.util.Scanner;

public class Solucao_1019 {
    public static int calcularHoras(int x){
        return x / 3600;
    }

    public static int calcularMinutos(int x){
        return (x % 3600) / 60;
    }

    public static int calcularSegundos(int x){
        return (x % 3600) % 60;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.printf("%d:%d:%d%n",calcularHoras(n),calcularMinutos(n),calcularSegundos(n));
    }
}
