package Aula03.Salario;
import java.util.Scanner;


public class Main{

    public static void main(String[] args){

        double salarioBase, salarioCalculado;
        DiaDaSemana dia;
        int horas;

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Salario Base R$: ");
        salarioBase = entrada.nextDouble();

        System.out.printf("Quantidade horas: ");
        horas = entrada.nextInt();

        entrada.nextLine();

        System.out.printf("Dia da semana: ");
        dia = DiaDaSemana.valueOf(entrada.nextLine().toUpperCase());

        Salario salario = new Salario(salarioBase, dia, horas);

        salarioCalculado = salario.calcularSalario();

        System.out.printf("Valor a pagar ao funcionario R$: %.2f\n", salarioCalculado);

        entrada.close();

    }
}