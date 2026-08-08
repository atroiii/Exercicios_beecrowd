package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Solucao_1048 {

    public static void calcularSalarioComReajuste(double salario , double percetual){//como o foco aqui são os exercicios do beecrowd onde temos que tenta se o mais rapido possivel isso vale
        double novoSalario = salario + (salario * (percetual/100));//porem no mundo real isso viola varias questões como Princípio da Responsabilidade Única, onde metodo ou funções deve ter responsabilidade única
        double ganhoReajuste = novoSalario - salario;//nesse codigo ele faz 3 coisas diferentes
        System.out.printf("Novo salario: %.2f%n",novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", ganhoReajuste);
        System.out.printf("Em percentual: %.0f %%%n",percetual);
    }//voltado no metodo ele receber o salario e o percetual e realizar as seguintes contas novo salrio com o percetual
    //valor do reajuste
    //print como pedir o exercicio

    public static double verificarPercentual(double salario){
        double percetual = 0;
        if (salario <= 400){
            percetual = 15;
        }else if (salario > 400 && salario <= 800) {
            percetual = 12;
        }else if (salario > 800 && salario <= 1200) {
            percetual = 10;
        }else if (salario > 1200 && salario <= 2000) {
            percetual = 7;
        }if (salario > 2000){
            percetual = 4;
        }
        return percetual;
    }

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        double percetual;
        double salario = input.nextDouble();

        percetual = verificarPercentual(salario);
        calcularSalarioComReajuste(salario,percetual);
        input.close();
    }
}