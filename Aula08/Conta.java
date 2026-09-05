package Aula08;

public class Conta {
    private String agencia;
    private String numero;
    private double saldo;

    public Conta(String agencia, String numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0.00;

    }

    public boolean saque(double valor){
        if(valor >= 0.00 && valor <= saldo){
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
}
