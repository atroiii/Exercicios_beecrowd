import java.math.BigDecimal;
import java.math.RoundingMode;
import java.io.IOException;
import java.util.Scanner;

public class Solucao_1040 {
    public static double calcularMediaPonderada(double nota1, double nota2, double nota3, double nota4){//metodo para media poderada
        double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / 10;
        return media;
    }

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        double nota1, nota2,  nota3,  nota4;

        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();
        nota4 = input.nextDouble();

        double media = calcularMediaPonderada(nota1, nota2,  nota3,  nota4);
        BigDecimal bd = BigDecimal.valueOf(media);//aqui estou instanciando um objeto usando o valueOf que e um metodo de fabrica então não preciso de coloca new
        bd = bd.setScale(1, RoundingMode.DOWN);//aqui ele pegar e diz quero somente um numero decimal o resto joga fora seria como o %.1f porem mais preciso
        media = bd.doubleValue();

        if(media >= 7){//logica do exercicio
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        }else if (media < 7 && media >= 5){
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            double notaExame = input.nextDouble();
            double mediaComExame = (notaExame + media) / 2;
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            if(mediaComExame >= 5){
                System.out.println("Aluno aprovado.");
            }else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaComExame);
        }else {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
        }
        input.close();
    }
}
