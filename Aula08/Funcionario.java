package Aula08;
import java.util.Random;

public class Funcionario extends Cliente{
    private Cargo cargo;
    
    public Funcionario(String nome, int idade, Conta conta, Cargo cargo){
        super(nome, idade, conta);
        this.cargo = cargo;
        
    }

    public void investir(){
        Random gerador = new Random();
        int valorGerado = gerador.nextInt(100);

        if(valorGerado > 60){
            super.getConta().setSaldo(super.getConta().getSaldo() + super.getConta().getSaldo() * 0.5);

        }else{
            super.getConta().setSaldo(0.00);
        }
            
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    
}
