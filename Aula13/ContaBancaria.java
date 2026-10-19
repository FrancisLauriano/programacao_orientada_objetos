package Aula13;

public abstract class ContaBancaria {
    private String numConta;
    private double saldo;

    public ContaBancaria(String numConta){
        this.numConta = numConta;
        this.saldo = 0.00;

    }

    public abstract boolean sacar(double valor);

    public abstract boolean depositar(double valor);

    public boolean transferir(double valor, ContaBancaria conta){
        if(valor > 0 && valor <= saldo && conta != null){
            double saldoTemp = saldo;

            if(this.sacar(valor)){
                if(conta.depositar(valor)){
                    return true;
                }

                this.depositar(saldoTemp);
            }
        }
        return false;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
}
