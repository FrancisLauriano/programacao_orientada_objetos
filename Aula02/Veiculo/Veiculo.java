package Aula02.Veiculo;

public class Veiculo{
    private String placa;
    private String modelo;
    private int horas;
    private double valorHora;


    public Veiculo(String placa, String modelo, int horas, double valorHora){
        this.placa = placa;
        this.modelo = modelo;
        this.horas = horas;        
        this.valorHora = valorHora;
    }



    public double calcularValor(){
        return this.horas * this.valorHora;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getHoras(){
        return this.horas;
    }

    public void setHoras(int horas){
        this.horas = horas;
    }

    public double getValorHora(){
        return this.valorHora;
    }

    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }
    
}