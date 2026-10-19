package Revisao1GQ.Exe07;

public class Carro extends Veiculo{
    private String placa;

    public Carro(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual, double litragemTanque, double velocidadeMax, String placa){
        super(marca, estado, tanque, consumo, velocidadeAtual, litragemTanque, velocidadeMax);
        this.placa = placa;
    }

    @Override
    public void chavear(){
        if(super.getVelocidadeAtual() > 0.00 && super.isEstado()){
            while(super.getVelocidadeAtual() > 0.00){
                frear();
            }
        }
        
        super.chavear();
        
    }

    
    public void corrida(double distancia, double gasolinaEsp){
        if(distancia > 0.00 && gasolinaEsp > 0.00 && super.getLitragemTanque() + gasolinaEsp <= super.getTanque()){
            double distanciaGasolinaEsp = gasolinaEsp / (super.getConsumo() / 2);

            if(distancia > distanciaGasolinaEsp){
                double distanciaFalta = distancia - distanciaGasolinaEsp;
                double distanciaMax = super.getLitragemTanque() / super.getConsumo();

                if(distanciaMax >= distanciaFalta){
                    double litragemConsumida = distanciaFalta * super.getConsumo();
                    super.setLitragemTanque(getLitragemTanque() - litragemConsumida);
                }else{
                    super.setLitragemTanque(0.00);
                    super.setVelocidadeAtual(0.00);
                }
            }

        }else{
            System.out.printf("Erro\n");
        }
    }


    @Override
    public boolean frear(){
        if(super.getVelocidadeAtual() - 5 >= 0.00){
            super.setVelocidadeAtual(super.getVelocidadeAtual() - 5);
            return true;
        }

        if(super.getVelocidadeAtual() > 0.00){
            super.setVelocidadeAtual(0.00);
            return true;
        }

        return false;
    }

    @Override
    public boolean acelerar(){
        if(super.getVelocidadeAtual() + 10 <= super.getVelocidadeMax()){
            super.setVelocidadeAtual(super.getVelocidadeAtual() + 10);
            return true;
        }

        if(super.getVelocidadeAtual() < super.getVelocidadeMax()){
            super.setVelocidadeAtual(super.getVelocidadeMax());
            return true;
        }

        return false;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    
}
