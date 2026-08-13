package Aula01.Exercicio;
import java.util.Scanner;

public class NumPrimos {

    public static final int TAMANHO_VETOR = 2;

    public static int[] receberValor(int[] v){

        int i;

        Scanner receber = new Scanner(System.in);

        for(i = 0; i <= v.length - 1; i += 1){
            System.out.print("Digite o " + (i+1) + "° valor: ");
            v[i] = receber.nextInt();

        }

        receber.close();
        return v;
    }
    

    public static int[] numerosPrimos(int[] v){
        int i, j;
        int l = 0;
        int qtdDivisores;
        int[] primos = new int[v[v.length - 1] - v[0] + 1];

        for(i = v[0]; i <= v[v.length - 1]; i += 1){
            qtdDivisores = 0;
            for(j = 1; j <= i; j += 1){
                if(i % j == 0){
                    qtdDivisores += 1;

                }
            }

            if(qtdDivisores == 2){
                primos[l] = i;
                l += 1;
            }
        }

        int[] resultado = new int[l];

        for(i = 0; i < l; i += 1){
            resultado[i] = primos[i];
        }

        return resultado;

    }

    public static void imprimirPrimos(int[] v){
        int i;

        for(i = 0; i <= v.length - 1; i += 1){
            System.out.print(v[i]);

            if(i < v.length - 1){
                System.out.print(", ");
            }
        }

        System.out.println();
    }


    public static void main(String[] args){
    
        int[] intervalo = new int[TAMANHO_VETOR];
        intervalo = receberValor(intervalo);

        int[] numPrimos;
        numPrimos = numerosPrimos(intervalo);

        imprimirPrimos(numPrimos);

    }
}
