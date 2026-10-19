package Aula13;

public class ContaPoupanca extends ContaBancaria implements Imprimivel{
    private double limite;

    public ContaPoupanca(String numConta, double limite){
        super(numConta);
        this.limite = limite;

    }

    @Override
    public void mostrarDados(){
        System.out.printf("Numero conta: %s\n", super.getNumConta());
        System.out.printf("Saldo: %.2f\n", super.getSaldo());
        System.out.printf("Limite: %.2f\n", limite);
    }


    @Override
    public boolean sacar(double valor){
        if(valor > 0 && valor <= super.getSaldo() + limite){
            super.setSaldo(super.getSaldo() - valor);
            return true;
        }
        

        return false;
    }


    @Override
    public boolean depositar(double valor){
        if(valor > 0){
            super.setSaldo(super.getSaldo() + valor);
            return true;
        }

        return false;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


    


    
}
