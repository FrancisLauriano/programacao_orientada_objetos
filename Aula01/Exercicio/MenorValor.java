package Aula01.Exercicio;
import java.util.Scanner;

public class MenorValor {

    public static final int TAMANHO_VETOR = 7;

    
    public static int menorValor(int[] v){
        int i;
        int indMenor = 0;

        for(i = 1; i <= v.length - 1; i += 1){
            if(v[i] < v[indMenor]){
                indMenor = i;
            }
        }

        return v[indMenor];
    }


    public static int[] receberVetor(int[] v){
        int i;
        Scanner receber = new Scanner(System.in);

        for(i = 0; i <= v.length - 1; i += 1){
            System.out.println("Vetor [" + i + "]: ");
            v[i] = receber.nextInt();
        }

        receber.close();

        return v;

    }
    

    public static void main(String[] args){
        int menor;

        int[] vetor = new int[TAMANHO_VETOR];

        vetor = receberVetor(vetor);

        menor = menorValor(vetor);

        System.out.println("Menor valor é: "+ menor);

    }
}
