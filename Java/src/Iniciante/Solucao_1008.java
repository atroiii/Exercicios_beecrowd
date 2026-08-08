import java.io.IOException;
import java.util.Scanner;

public class Solucao_1008 {
    public static double CalcularHoras(int horasTrabalhada, double valorHora){
        return horasTrabalhada * valorHora;
    }

    public static void main(String[] args) throws IOException {
        var input = new Scanner(System.in);
        int numeroFuncionario, horasTrabalhadas;
        double valorHora;

        numeroFuncionario = input.nextInt();
        horasTrabalhadas = input.nextInt();
        valorHora = input.nextDouble();

        System.out.printf("NUMBER = %d%n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f",CalcularHoras(horasTrabalhadas,valorHora) );

        input.close();
    }

}