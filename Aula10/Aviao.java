package Aula10;

public class Aviao extends Veiculo{
    private boolean voando;

    public Aviao(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual, double litragemTanque, double velocidadeMax, boolean voando){
        super(marca, estado, tanque, consumo, velocidadeAtual, litragemTanque, velocidadeMax);
        this.voando = voando;
    }


    public void voar(){
        if(super.getVelocidadeAtual() >= 200){
            voando = true;
            System.out.printf("Esta voando\n");
        }
    }


    @Override
    public boolean acelerar(){
        if(voando){
            super.setVelocidadeAtual(super.getVelocidadeAtual() + 20);
            return true;
        }else{
            if(super.getVelocidadeAtual() + 10 <= super.getVelocidadeMax()){
                super.setVelocidadeAtual(super.getVelocidadeAtual() + 10);

                if(super.getVelocidadeAtual() >= 200){
                    voar();
                }
                return true; 
            } 
        }
        return false;
    }

    @Override
    public boolean frear(){
        if(voando){
            super.setVelocidadeAtual(super.getVelocidadeAtual() - 10);

            if(super.getVelocidadeAtual() < 200){
                voando = false;
                System.out.printf("Aviao esta pousando\n");
            }
            return true;
        }else{
            if(super.getVelocidadeAtual() - 5 >= 0){
                super.setVelocidadeAtual(super.getVelocidadeAtual() - 5);
                return true;

            }

            if(super.getVelocidadeAtual() > 0){
                super.setVelocidadeAtual(0.00);
                return true;
            }
  
        }
        return false;
    }

    @Override
    public void chavear(){
        if(super.getVelocidadeAtual() > 0 && super.isEstado()){
            System.out.printf("Aviao nao pode ser desligado\n");
            return;
        }

        super.chavear();
        
    }

    @Override
    public void corrida(double distancia){
        if(distancia > 0){
            double distanciaComTanque = super.getLitragemTanque() / super.getConsumo();

            if(distanciaComTanque < distancia){
                super.setVelocidadeAtual(0.00);
                super.setLitragemTanque(0.00);
                voando = false;
                System.out.printf("Avião está fazendo pouso emergencial\n");
                System.out.printf("Falta %.2f Km para completar a corrida\n", distancia - distanciaComTanque);
            }else{
                super.corrida(distancia);
            }
        }
        
    }

    public boolean isVoando() {
        return voando;
    }

    public void setVoando(boolean voando) {
        this.voando = voando;
    }
    

    
    
}
