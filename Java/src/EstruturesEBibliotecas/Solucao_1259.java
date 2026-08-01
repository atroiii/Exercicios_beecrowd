import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Solucao_1259 {

    public static boolean parOuImpar(int num){//metodo estatico para ver se e um par ou impar
        return num % 2 == 0;//ser for par return true caso nao false
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//objeto para input
        var listaNumeros = new ArrayList<Integer>();//declaração do meu ArrayList nessas 3 linhas
        var listaNumerosPares = new ArrayList<Integer>();
        var listaNumerosImpares = new ArrayList<Integer>();
        //coloquei var ... para não precisar coloca exemplo ArrayList<Integer> listaNumerosImpares = new ArrayList<>();
        //ArrayList não aceitam tipos primitivos apenas objetos com isso ser usar a classesWrapper
        //com isso int passa a ser Integer, char passa a ser Character e etc

        int n,x;//declaração de n e x, do tipo primitivo int
        n = input.nextInt();


        for (int i = 0; i < n; i++) {//for para ler 'n' numeros
                x = input.nextInt();//leitura de x
                if (x >= 0){
                    if (parOuImpar(x)){//metodo dentro do if pois ele retorna um true caso seja par
                        //e um false no caso de impar
                        listaNumerosPares.add(x);//então ser ele e par vai para dentro de listaNumerosPares
                    }else {
                        listaNumerosImpares.add(x);//no caso de impar vai para dentro de listaNumerosImpares
                    }
                }

        }

        //Collection e uma classe utilitária que contem varios metodos estáticos
        //Collections.sort()ordenar elementos de um List
        Collections.sort(listaNumerosPares);
        //Collections.reverseOrder() inverte os elementos
        //colocamos primeiro o .sortpois primeiro tempos que ordenar para depois inverte
        Collections.sort(listaNumerosImpares, Collections.reverseOrder());

        for (Integer numPares : listaNumerosPares){//for each para percorrer os elementos tanto de listaNumerosPares
            System.out.println(numPares);
        }
        for (Integer numPares : listaNumerosImpares){//quanto de listaNumerosImpares
            System.out.println(numPares);
        }
        input.close();//fechamento do input

    }
}
