import java.io.IOException;
import java.util.Scanner;

public class Solucao_1013 {

    public static int maiorAB(int a, int b){ //metodo estatico da formula do exercicio
        return ((a+b)+Math.abs(a-b))/2; //Math.abs() serve para modulo ||
    }

    public static void main (String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int a, b, c, maiorDosTres;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int maiorEntreAB = maiorAB(a,b);//chamo o metodo e passa A e B


        if (maiorEntreAB > c){//if para verificar qual e o maior
            maiorDosTres = maiorEntreAB;
        }else {
            maiorDosTres = c;
        }


        System.out.printf("%d eh o maior%n",maiorDosTres);

        input.close();
    }
}
