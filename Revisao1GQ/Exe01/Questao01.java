package Revisao1GQ.Exe01;
import java.util.Scanner;

public class Questao01 {
    private static final int TAM = 3;

    public int[][] transposta(int[][] m){

        int aux[][] = new int[TAM][TAM];
        int i, j;

        for(i = 0; i < m.length; i += 1){
            for(j = 0; j < m[i].length; j += 1){
                aux[j][i] = m[i][j];
            }
        }

        return aux;
    }

    public void recebeMatriz(int[][] m){
        int i, j;
        Scanner recebe = new Scanner(System.in);


        for(i = 0; i < m.length; i += 1){
            for(j = 0; j < m[i].length; j += 1){
                System.out.printf("Digite valor[%d][%d]: ", i, j);
                m[i][j] = recebe.nextInt();
            }

        }

       recebe.close();

    }
}
