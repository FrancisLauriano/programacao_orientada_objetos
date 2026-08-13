package Aula01.Exercicio;
import java.util.Scanner;

public class EhPrimo {
    
    public static String verificarSePrimo(int n){
        int qtdDivisores = 0;
        int i;

        for(i = 1; i <= n; i += 1){
            if(n % i == 0){
                qtdDivisores += 1;
            }
        }

        if(qtdDivisores == 2){
            return "verdadeiro";
        }else{
            return "falso";
        }
    }


    public static int receberValor(){
        Scanner receber = new Scanner(System.in);
        int num;

        System.out.print("Dogite um numero inteiro: ");
        num = receber.nextInt();

        receber.close();

        return num;

    }


    public static void main(String[] args){
        int numero; 
        String ehPrimo;

        numero = receberValor();
        ehPrimo = verificarSePrimo(numero);

        System.out.println("verificacao se o numero " + numero + " é primo: " + ehPrimo);
    }
}
