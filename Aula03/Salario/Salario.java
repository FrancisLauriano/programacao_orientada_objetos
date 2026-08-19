package Aula03.Salario;

public class Salario{
    private double salarioBaseHora;
    private DiaDaSemana dia;
    private int horas;

    public Salario(double salarioBaseHora, DiaDaSemana dia, int horas){
        this.salarioBaseHora = salarioBaseHora;
        this.dia = dia;
        this.horas = horas;
    }


    public double calcularSalario(){
        return this.salarioBaseHora * this.horas * this.dia.getFatorMultiplicacao();

    }


}