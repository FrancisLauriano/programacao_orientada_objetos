package Aula02.Banco;

public class Banco{
    public String titular;
    public double saldo;


    public Banco(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        if(valor > this.saldo){
            return false;
        }else{
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    public boolean depositar(double valor){
        if(valor <= 0.00){
            return false;
        }else{
            this.saldo = this.saldo + valor;
            return true;
        }
    }
}