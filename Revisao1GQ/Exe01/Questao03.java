package Revisao1GQ.Exe01;
import java.util.Scanner;

public class Questao03 {

    public boolean ehPrimo(int num){
        int i, div = 0;

        for(i = 1; i <= num; i += 1){
            if(num % i == 0){
                div += 1;
            }
        }

        if(div == 2){
            return true;
        }

        return false;
    }


    public void recebe(int n){
        Scanner recebe = new Scanner(System.in);

        System.out.printf("Digite o valor: ");
        n = recebe.nextInt();

        recebe.close();

    }
    
}
