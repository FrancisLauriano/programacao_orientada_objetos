package Aula01;
import java.util.Scanner;

public class Introducao {

    public static int soma(int numero1, int numero2){
        System.out.println("Numero 1 " + numero1);
        System.out.println("Numero 2 " + numero2);
        return numero1 + numero2;
    }

    public static void main(String[] Args){
        System.out.println("ola mundo");
        String nome;
        int idade;//nome e idade criados
        
        int contador;

        Scanner entrada = new Scanner(System.in);

        nome = entrada.nextLine();
        idade = entrada.nextInt();

        System.out.println("ola, meu nome e " + nome + "; e minha idade e " + idade);

        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
        contador = 0;

        do{
            System.out.println("estou dentro do do-while");
            contador++;
        }while(contador < 10);

        int contador1 = 0;
        while(contador1 < 10){
            System.out.println("estou dentro do while\n");
            contador1++;
        }

        for(int contador2 = 0; contador2 < 10; contador2++){
            System.out.println("estou dentro do for");
        }

        System.out.println("\n\n===============================================================\n\n");

        int[] vetor = {1,2,3};
        int[] vetor2 = new int[3];

        int posicoes;
        int[] teste;
        posicoes = entrada.nextInt();

        teste = new int[posicoes];

        for (int i : vetor) {
            System.out.println("vetor " + i);            
        }

        vetor2[1] = 10;
        
        for (int i : vetor2) {
            System.out.println("vetor 2 " + i);
        }

        for (int i : teste) {
            System.out.println("teste " + i);
        }
        
        int resposta = soma(3, 5);
        
        System.out.println("A resposta da soma e: " + resposta);
        entrada.close();
        
    }
    
}
