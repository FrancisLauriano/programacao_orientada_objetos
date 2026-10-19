package Revisao1GQ.Exe06;

public class ClienteEspecial extends Cliente {
    private int pontos;
    private double saldoCompras;

    public ClienteEspecial(String nome, int idade, String cpf, String endereco, boolean bomCliente, int pontos, double saldoCompras){
        super(nome, idade, cpf, endereco, bomCliente);
        this.pontos = pontos;
        this.saldoCompras = saldoCompras;
    }

    @Override
    public double[] comprar(){
        double[] compras = super.comprar();
        double soma = compras[0];
        double qtdItens;
        

        if(soma > 0.00){
            soma -= (soma * 0.05); 
            saldoCompras += soma;

            qtdItens = compras[0] / compras[1];
            
            compras[0] = soma;
            compras[1] = soma / (int)qtdItens;
        }

        if(saldoCompras > 0){
            pontos += 5;
            saldoCompras -= 100;

        }
        return compras;
    }

    public double[] comprar(int pontos){
        double[] compras = {0.00, 0.00};

        if(pontos <= this.pontos){
            this.pontos -= pontos;
        }

        return compras;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getSaldoCompras() {
        return saldoCompras;
    }

    public void setSaldoCompras(double saldoCompras) {
        this.saldoCompras = saldoCompras;
    }

    
    
}
