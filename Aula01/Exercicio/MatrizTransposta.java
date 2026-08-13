package Aula01.Exercicio;
import java.util.Scanner;


public class MatrizTransposta {

    public static final int TAMANHO_MATRIZ = 3;
    
    
    public static int[][] matrizTresPorTres(int[][] m){
        int[][] t = new int[TAMANHO_MATRIZ][TAMANHO_MATRIZ];
        int i, j;
        

        for(i = 0; i <= m.length - 1; i += 1){

            for(j = 0; j <= m[i].length - 1; j += 1){
                t[j][i] = m[i][j];

            }
        }
        return t;  
    }

    public static int[][] receberMatriz(int[][] m){
        int i, j;

        Scanner recebe = new Scanner(System.in);

        for(i = 0; i < TAMANHO_MATRIZ; i += 1){
            for(j = 0; j < TAMANHO_MATRIZ; j += 1){
                System.out.print("Dgite matriz["+ i +"]"+"[" + j +"]: ");
                m[i][j] = recebe.nextInt();
            }
        }

        recebe.close();
        return m;

    }



    public static void imprimir(int[][] t){
        int i, j;

        for(i = 0; i <= t.length - 1; i += 1){

            for(j = 0; j <= t[i].length - 1; j += 1){
                System.out.print(t[i][j] + " ");

            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        // int[][] matriz1 = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        // int[][] transposta1 = matrizTresPorTres(matriz1);

        // imprimir(transposta1);

        int[][] matriz2 = new int[TAMANHO_MATRIZ][TAMANHO_MATRIZ];

        matriz2 = receberMatriz(matriz2);

        int[][] transposta2 = matrizTresPorTres(matriz2);
       
        imprimir(transposta2);


       
    }



    
}
