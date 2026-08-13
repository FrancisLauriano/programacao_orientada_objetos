package Aula01.Exercicio;
import java.util.Scanner;

public class FatorialRecursiva {

    public static int fatorial(int n){

        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * fatorial(n - 1);
        }
    }
    

    public static int receberValor(){
        int n;
        Scanner receber = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        n = receber.nextInt();

        receber.close();
        return n;
    }


    public static void main(String[] args){
        int num, resultado;
        num = receberValor();

        resultado = fatorial(num);

        System.out.println("O fatorial do numero " + num + " é: " + resultado);

    }
}
