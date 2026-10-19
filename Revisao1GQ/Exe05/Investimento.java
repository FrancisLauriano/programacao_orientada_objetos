package Revisao1GQ.Exe05;
import java.util.Random;

public class Investimento extends Conta{
    private Risco risco;
    
    public Investimento(String agencia, String NumeroConta, Risco risco){
        super(agencia, NumeroConta);
        this.risco = risco;
    }


    public void investir(double valor){

        Random sortear = new Random();
        int valorSorteado = sortear.nextInt(100);

        if(valorSorteado < risco.getChance()){
            valor += (valor * risco.getRendimento());
            super.deposito(valor);
        }
    }


    public Risco getRisco() {
        return risco;
    }


    public void setRisco(Risco risco) {
        this.risco = risco;
    }

    
    
}
