package Revisao1GQ.Exe05;
import java.util.Random;


public class Funcionario extends Cliente{
    private Cargo cargo;

    public Funcionario(String nome, int idade, Conta conta, Cargo cargo){
        super(nome, idade, conta);
        this.cargo = cargo;
    }

    public void InvestimentoEspecial(double valor){
        Random sortear = new Random();
        int valorSorteado = sortear.nextInt(100);

        if(valorSorteado < cargo.getChance()){
            valor += (valor * cargo.getRendimento());
            super.getConta().deposito(valor);
        }

    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
}
