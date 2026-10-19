package Revisao1GQ.Exe01;

public class Questao04 {

    public void numerosPrimos(int n1, int n2){
        int i, j, div;
        
        System.out.printf("Valores primos entre %d e %d:\n", n1, n2);


        for(i = n1; i <= n2; i += 1){
            div = 0;

            for(j = i; j <= i; j += 1){
                if(i % j == 0){
                    div += 1;
                }
            }

            if(div == 2){
                System.out.printf("%d, ", i);
            }

        }

        System.out.println();

    }
    
}
