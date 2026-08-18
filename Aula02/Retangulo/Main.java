package Aula02.Retangulo;
import java.util.Scanner;


public class Main{

    public static void main(String[] args){
        float a, b, area, perimetro;
        
        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite a base: ");
        b = entrada.nextFloat();

        System.out.print("Digite a altura: ");
        a = entrada.nextFloat();

        Retangulo retangulo = new Retangulo(b, a);

        area = retangulo.calcularArea();
        perimetro = retangulo.calcularPerimetro();

        System.out.println("A area do retangulo é: " + area);
        System.out.println("O do retangulo é: " + perimetro);

        entrada.close();

    }
}