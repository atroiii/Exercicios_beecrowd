package Iniciante;
import java.util.Scanner;


public class Solucao_1046 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int horaInicial, horaFinal, duracaoJogo;

        horaInicial = input.nextInt();
        horaFinal = input.nextInt();
        //aqui e como a formular em fisica deltaT = Tfinal - Tinicial
        duracaoJogo = horaFinal - horaInicial;

        if (duracaoJogo == 0){//ser o delta T e igual a 0 então a duração foi igual a 24 hrs
            duracaoJogo = 24;
        } else if (duracaoJogo < 0) {//ser a duração menor que 0 então o deltaT deu negativo então temos que soma + 24 horas
            duracaoJogo = duracaoJogo + 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracaoJogo);
        input.close();
    }
}
