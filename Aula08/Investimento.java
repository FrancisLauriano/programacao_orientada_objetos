package Aula08;
import java.util.Random;


public class Investimento extends Conta{
    private Risco risco;

    public Investimento(String agencia, String numero, Risco risco){
        super(agencia, numero);
        this.risco = risco;
    }

    public void investir(){
        Random gerar = new Random();
        int valorTestar = gerar.nextInt(100);

        if(valorTestar < risco.getChance()){
            super.setSaldo(super.getSaldo() + super.getSaldo() * risco.getRendimento());
        }else{
            super.setSaldo(0.00);
        }

    }

    public Risco getRisco() {
        return risco;
    }

    public void setRisco(Risco risco) {
        this.risco = risco;
    }

    
}



