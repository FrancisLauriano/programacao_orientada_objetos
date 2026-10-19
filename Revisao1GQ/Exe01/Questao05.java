package Revisao1GQ.Exe01;

public class Questao05 {

    public void fatorial(int num){
        int i, f = 1;

        if(num == 0 || num == 1){
            System.out.printf("Fatorial de %d e: %d\n", num, f);
        }else if(num >= 2){
            for(i = num; i >= 1; i -= 1){
                f *= i;
            }

            for(i = num; i >= 1; i -= 1){
                System.out.printf("%d! = %d ", num, i);
                if(i > 1){
                    System.out.printf(". ");
                }

                System.out.printf("= %d\n", f);

            }

        }else{
            System.out.printf("Nao existe fatorial de valores negativos\n");
        }

    }
    
}
