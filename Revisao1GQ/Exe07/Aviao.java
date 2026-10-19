package Revisao1GQ.Exe07;

public class Aviao extends Veiculo{
    private boolean voando;

    public Aviao(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual, double litragemTanque, double velocidadeMax, boolean voando){
        super(marca, estado, tanque, consumo, velocidadeAtual, litragemTanque, velocidadeMax);
        this.voando = voando;
    }

    public void voar(){
        if(!voando && super.getVelocidadeAtual() <= super.getVelocidadeMax()){
            if(super.getVelocidadeAtual() >= 200){
                voando = true;
            }
        }
    }

    @Override
    public boolean acelerar(){
        if(voando){
            super.setVelocidadeAtual(super.getVelocidadeAtual() + 20);
            return true;
        }else{
            super.acelerar();
            if(super.getVelocidadeAtual() >= 200){
                voar();
                System.out.printf("Aviao esta voando\n");
            }
            return true;
        }
    }


    @Override
    public void chavear(){
        if(super.getVelocidadeAtual() == 0.00 && !super.isEstado()){
            super.chavear();

        }
    }

    @Override
    public boolean frear(){
        if(voando){
            super.setVelocidadeAtual(super.getVelocidadeAtual() - 10);

            if(super.getVelocidadeAtual() < 200){
                voando = false;
                System.out.printf("Aviao ira pousar\n");
            }
            
            return true;
        }else{
            super.frear();
        }

        return false;
    }

    
    @Override
    public void corrida(double distancia){
        double distanciaMax = super.getLitragemTanque() / super.getConsumo();

        super.corrida(distancia);

        if(distanciaMax < distancia){
            voando = false;
            System.out.printf("Aviao irá pousar emergencialmente\n");
        }
        
    }

    

    public boolean isVoando() {
        return voando;
    }

    public void setVoando(boolean voando) {
        this.voando = voando;
    }

    
    
}
