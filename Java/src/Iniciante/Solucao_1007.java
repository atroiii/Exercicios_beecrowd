package Iniciante;

import java.util.Scanner;

public class Solucao_1007 {

    public static int diferencaDosProdutos(int a,int b,int c,int d){
        return (a*b - c*d);
    }

    public static void main(String[] args){
        var input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        System.out.println("DIFERENCA = "+diferencaDosProdutos(a,b,c,d));

    }
}
