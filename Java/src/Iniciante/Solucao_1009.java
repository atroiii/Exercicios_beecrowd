import java.io.IOException;
import java.util.Scanner;

public class Solucao_1009 {

    public static double calcularSalarioComComisao(float salario, float vendas){
        final double comisao = 0.15;
        return salario + vendas * comisao;
    }

    public static void main(String[] args) throws IOException {
        var input = new Scanner(System.in);
        String nome;
        float salario,vendas;

        nome = input.next();
        salario = input.nextFloat();
        vendas = input.nextFloat();

        System.out.printf("TOTAL = R$ %.2f%n", calcularSalarioComComisao(salario,vendas));

    }

}