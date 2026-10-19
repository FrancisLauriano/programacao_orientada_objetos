package Aula13;

public class ContaCorrente extends ContaBancaria implements Imprimivel{
    private double taxaDeOperacao;

    public ContaCorrente(String numConta, double taxaDeOperacao){
        super(numConta);
        this.taxaDeOperacao = taxaDeOperacao;
    }


    @Override
    public void mostrarDados(){
        System.out.printf("Numero conta: %s\n", super.getNumConta());
        System.out.printf("Saldo: %.2f\n", super.getSaldo());
        System.out.printf("Taxa Operacoes: %.2f\n", taxaDeOperacao);
    }

    @Override
    public boolean sacar(double valor){
        if(valor > 0 && (valor + ((taxaDeOperacao / 100) * valor)) >= super.getSaldo()){
            super.setSaldo(super.getSaldo() - (valor + (valor * (taxaDeOperacao/100))));
            return true;
        }

        return false;
    }


    @Override
    public boolean depositar(double valor){
        if(valor > 0){
            super.setSaldo(super.getSaldo() + valor - ((taxaDeOperacao / 100) * valor));
            return true;
        }

        return false;
    }

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
}
