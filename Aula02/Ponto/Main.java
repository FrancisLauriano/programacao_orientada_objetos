package Aula02.Ponto;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        double x1, x2, y1, y2, distanciaAB;
        Scanner entrada = new Scanner(System.in);

        
    
        System.out.print("Informe X1: ");
        x1 = entrada.nextDouble();

        System.out.print("Informe Y1: ");
        y1 = entrada.nextDouble();

        Ponto p1 = new Ponto(x1, y1);


        System.out.print("Informe X2: ");
        x2 = entrada.nextDouble();

        System.out.print("Informe Y2: ");
        y2 = entrada.nextDouble();

        Ponto p2 = new Ponto(x2, y2);
            

        distanciaAB = p1.distanciaEntrePontos(p2);
    

        System.out.println("A distancia entre A e B é: " + distanciaAB);

        entrada.close();
        
    }
    
}
