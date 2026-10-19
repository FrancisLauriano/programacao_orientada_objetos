package Aula09Exercicio;

public class ClienteEspecial extends Cliente{
    private int pontos;
    private double saldoDeCompras;

    public ClienteEspecial(String nome, int idade, String cpf, String endereco, boolean bomCliente, int pontos, double saldoDeCompras){
        super(nome, idade, cpf, endereco, bomCliente);
        this.pontos = pontos;
        this.saldoDeCompras = saldoDeCompras;
    }

    // sobreescrita
    @Override
    public double[] comprar(){
        double[] dadosCompra = super.comprar();
        double somaValoresItens = dadosCompra[0];

        somaValoresItens -= somaValoresItens * 0.05;
        saldoDeCompras += somaValoresItens;

        if(saldoDeCompras >= 100){
            pontos += 5;
            saldoDeCompras -= 100;
        }

        dadosCompra[0] = saldoDeCompras;

        int i, qtd = 0;
        for(i = 0; i < super.getCarrinho().length; i += 1){
            if(super.getCarrinho()[i] != null){
                qtd += 1;
            }
        }

        if(saldoDeCompras > 0){
            dadosCompra[1] = saldoDeCompras / qtd;
        }else{
            dadosCompra[1] = 0.00;
        }

        return dadosCompra;
    }    

    // sobrecarga
    public double[] comprar(int pontos, Item item){

        if(pontos > 0 && this.pontos >= pontos && item != null){
            this.pontos -= pontos;
            item.setQtdEstoque(item.getQtdEstoque() - 1);
            double[] dadosCompra = {0.00, 0.00};

            return dadosCompra;
        }

        return null;

    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getSaldoDeCompras() {
        return saldoDeCompras;
    }

    public void setSaldoDeCompras(double saldoDeCompras) {
        this.saldoDeCompras = saldoDeCompras;
    }


    
}
