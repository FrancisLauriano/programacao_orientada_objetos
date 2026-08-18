package Aula02.Aluno;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        String nome, situacao;
        double n1, n2, media;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite nota 1: ");
        n1 = entrada.nextDouble();

        System.out.print("Digite nota 2: ");
        n2 = entrada.nextDouble();

        Aluno aluno = new Aluno(nome, n1, n2);

        media = aluno.calcularMedia();
        situacao = aluno.verificarSituacao(media);

        System.out.printf("Media do aluno '%s' é: %.2f\n", aluno.nome, media);
        System.out.printf("Situacao do aluno: %s\n", situacao);

        entrada.close();


    }
}