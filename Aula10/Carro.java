package Aula10;

public class Carro extends Veiculo{
    private String placa;

    public Carro(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual, double litragemTanque, double velocidadeMax, String placa){
        super(marca, estado, tanque, consumo, velocidadeAtual, litragemTanque, velocidadeMax);
        this.placa = placa;
    }

    @Override
    public boolean acelerar(){
        if(super.getVelocidadeAtual() + 10 <= super.getVelocidadeMax()){
            super.setVelocidadeAtual(super.getVelocidadeAtual() + 10);
            return true;
        }
    
        return false;
    }

    @Override
    public boolean frear(){
        if(super.getVelocidadeAtual() - 5 >= 0){
            super.setVelocidadeAtual(super.getVelocidadeAtual() - 5);
            return true;
        }
        if(super.getVelocidadeAtual() > 0){
            super.setVelocidadeAtual(0.00);
            return true;
        }

        return false;
    }

    @Override
    public void chavear(){
        if(super.getVelocidadeAtual() > 0 && super.isEstado()){
            while(super.getVelocidadeAtual() > 0){
                frear();
            }
        }

        super.chavear();
    }

    // sobrecarga
    public void corrida(double distancia, double gasolinaEspecial){

        if(distancia > 0 && gasolinaEspecial >= 0 && (super.getLitragemTanque() + gasolinaEspecial) <= super.getTanque()){
            double distanciaPercorridaGasEsp = gasolinaEspecial / (super.getConsumo() / 2);

            if(distanciaPercorridaGasEsp >= distancia){
                System.out.printf("Corrida realizada com gasolina especial\n");
            }else{
                double distanciaFalta = distancia - distanciaPercorridaGasEsp;
                double litragemNecessaria = distanciaFalta * super.getConsumo();

                if(litragemNecessaria <= super.getLitragemTanque()){
                    super.setLitragemTanque(super.getLitragemTanque() - litragemNecessaria);
                }else{
                    double distanciaRealizada = super.getLitragemTanque() / super.getConsumo();
                    super.setLitragemTanque(0.00);
                    super.setVelocidadeAtual(0.00);
                    System.out.printf("Falta %.2f Km para completar a corrida\n", distanciaFalta - distanciaRealizada);

                }
            }     
        }else{
            System.out.printf("Erro\n");   
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
}
