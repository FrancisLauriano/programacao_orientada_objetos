package Revisao1GQ.Exe05;

public class Conta {
    private String agencia;
    private String NumeroConta;
    private double saldo;

    public Conta(String agencia, String NumeroConta){
        this.agencia = agencia;
        this.NumeroConta = NumeroConta;
        this.saldo = 0.00;
    }

    public boolean saque(double valor){
        if(valor > 0.00 && valor <= saldo){
            saldo -= valor;
            return true;

        }

        return false;
    }

    public boolean deposito(double valor){
        if(valor > 0.00){
            saldo += valor;
            return true;
        }

        return false;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        NumeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
