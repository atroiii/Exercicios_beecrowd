import java.io.IOException;
import java.util.Scanner;

public class Solucao_1017 {

    public  static double conversaoParaDouble(int num){// como no exercicio a entrada e do tipo int quando eu faço divisão de dois int o resultado e um int
        //então com isso temos que fazer uma conversão para double
        //então fiz esse metodo estatico para isso
        double numConvertido = (double) num;
        return numConvertido;
    }

    public static double calcularLitros(int tempoGasto, int velocidadeMedia){//metodo para calcular os litros
        final int kmPorLitro = 12;//contaste para km/l

        double tempoGastoDouble = conversaoParaDouble(tempoGasto);//chamada do metodo nessa e na proxima linha
        double velocidadeMediaDouble = conversaoParaDouble(velocidadeMedia);

        return (velocidadeMediaDouble / kmPorLitro) * tempoGastoDouble;

    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);//objeto Scanner para o input
        int tempoGasto, velocidadeMedia;//declaração das variaveis com int

        tempoGasto = input.nextInt();//essa e a proxima linha são a leituras das variaveis
        velocidadeMedia = input.nextInt();
        double teste = calcularLitros(tempoGasto, velocidadeMedia);//a variavel teste recebr o metodo calcularLitros passando como paramentro as variaveis que foram lidas acima


        System.out.printf("%.3f%n", teste); //print para 3 casas decimas %n para quebrar de linha
        input.close();//fechamento do input
    }

}