package Aula02.Ponto;
import java.lang.Math;

public class Ponto{
    public double x;
    public double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }


    public double distanciaEntrePontos(Ponto pB){
        double distanciaAB;

        distanciaAB = Math.sqrt(Math.pow((pB.x - this.x), 2) + Math.pow((pB.y - this.y), 2)) ;

        return distanciaAB;

    }

}