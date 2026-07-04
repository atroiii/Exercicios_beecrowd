import java.io.IOException;
import java.util.Scanner;

public class Solucao_1001 {
    public static void main(String[] args) throws IOException{
        var input = new Scanner(System.in);

        int a, b, x;
        a = input.nextInt();//entrada de a e b
        b = input.nextInt();
        x = a + b;//Variavel X receber a soma de a + b

        System.out.printf("X = %d%n",x);//Print de X no estilo de C %n pula linha

        input.close();//fechamento do input
    }
}
