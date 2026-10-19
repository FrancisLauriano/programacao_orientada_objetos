package Aula10;

public class Veiculo {
    private String marca;
    private boolean estado;
    private double tanque;
    private double consumo;
    private double velocidadeAtual;
    private double litragemTanque;
    private double velocidadeMax;

    public Veiculo(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual, double litragemTanque, double velocidadeMax){
        this.marca = marca;
        this.estado = estado;
        this.tanque = tanque;
        this.consumo = consumo;
        this.velocidadeAtual = velocidadeAtual;
        this.litragemTanque = litragemTanque;
        this.velocidadeMax = velocidadeMax;
    }

    public void chavear(){
        estado = !estado;
    }

    public boolean acelerar(){
        if(velocidadeAtual + 1 <= velocidadeMax){
            velocidadeAtual += 1;
            return true;
        }

        return false;
    }

    public boolean frear(){
        if(velocidadeAtual - 1 >= 0){
            velocidadeAtual -= 1;
            return true;
        }

        if(velocidadeAtual > 0){
            velocidadeAtual = 0.00;
            return true;

        }
        return false;
    }

    public void corrida(double distancia){
        if(distancia > 0){
         
            double distanciaPercorridaCTanque = litragemTanque / consumo;

            if(distanciaPercorridaCTanque >= distancia){
                double litragemConsumida = distancia * consumo;
                litragemTanque -= litragemConsumida;
            }else{
                litragemTanque = 0.00;
                velocidadeAtual = 0.00;
                System.out.printf("Falta %.2f Km para completar a corrida\n", distancia - distanciaPercorridaCTanque);
            }
        }

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getLitragemTanque() {
        return litragemTanque;
    }

    public void setLitragemTanque(double litragemTanque) {
        this.litragemTanque = litragemTanque;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }


    
    
    
    
}
