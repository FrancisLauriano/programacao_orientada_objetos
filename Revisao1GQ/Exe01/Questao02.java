package Revisao1GQ.Exe01;
import java.util.Scanner;
// import java.util.ArrayList;


public class Questao02 {
    

    public void menorValor(int[] numeros){
        int menor = numeros[0];

        for(int num : numeros){
            if(num < menor){
                menor = num;
            }
        }


        System.out.printf("Menor valor: %d\n", menor);
    }

    public void menorVAlor(double[] numeros ){
        int i, menor = 0;

        for(i = 1; i < numeros.length; i += 1){
            if(numeros[i] < numeros[menor]){
                menor = i;

            }
        }

        System.out.printf("Menor valor: %f\n", numeros[menor]);

    }

    public void receberValor(double[] numeros){
        int i;
        Scanner recebe = new Scanner(System.in);


        for(i = 0; i < numeros.length; i += 1){
            System.out.printf("Digite %dº valor: ", i + 1);
            numeros[i] = recebe.nextDouble();


        }

        recebe.close();

    }


    // public static void main(String[] args){
    //     ArrayList<Integer> lista1 = new ArrayList<Integer>();
    //     ArrayList<Double> lista2 = new ArrayList<Double>();


    // }
    
}
