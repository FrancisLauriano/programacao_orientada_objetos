package Aula01.Exercicio;
import java.util.Scanner;

public class FatoriaInterativo {
    
    public static int calcularFatorial(int n){
        int fatorial = 1;
        int i;

        if(n == 0 || n == 1){
            return fatorial;

        }else{
            for(i = n; i >= 1; i -= 1){
                fatorial *= i;
            }

            return fatorial;
        }
    }


    public static int receberNumero(){
        int num;
        Scanner receber = new Scanner(System.in);

        System.out.print("Digite numero inteiro: ");
        num = receber.nextInt();

        receber.close();

        return num;

    }

    public static void main(String[] args){
        int numero;
        int fatorial;
        numero = receberNumero();
        fatorial = calcularFatorial(numero);

        System.out.println("Fatorial do numero " + numero + " é: " + fatorial);

    }
}
