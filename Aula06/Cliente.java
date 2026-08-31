package Aula06;

    public class Cliente {
    private static final int TAM = 10;

    private String nome;
    private boolean vip;
    private Produto[] carrinho;

    public Cliente(String nome){
        this.nome = nome;
        this.vip = false;
        this.carrinho = new Produto[TAM];
    }

    public boolean adicionarProduto(Produto produto){
        int i;

        for(i = 0; i < carrinho.length; i += 1){
            if(carrinho[i] == null){
                carrinho[i] = produto;
                return true;
            }

        }

        return false;
       
    }

    public boolean removerProduto(int indice){
        int i;

        if(indice >= 0 && indice < TAM && carrinho[indice] != null){
            for(i = indice; i < carrinho.length - 1; i += 1){
                carrinho[i] = carrinho[i + 1];
            }

            carrinho[carrinho.length - 1] = null;
            return true;
        }

        return false;
        
    }

    public void comprar(){
        int i, qtdTotal = 0;
        double valorTotal = 0.00;

        for(i = 0; i < carrinho.length; i += 1){
            if(carrinho[i] != null){
                qtdTotal += 1;
                valorTotal += carrinho[i].getValor();

                System.out.printf("%d - %s ..... R$ %.2f\n", i + 1, carrinho[i].getNome(), carrinho[i].getValor());
            }
        }

        if(vip){
            valorTotal -= valorTotal * 0.1;
        }

        System.out.printf("QTD TOTAL - %d ..... R$ %.2f\n", qtdTotal, valorTotal);
       
        
        for(i = 0; i < carrinho.length; i += 1){
            carrinho[i] = null;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Produto[] getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Produto[] carrinho) {
        this.carrinho = carrinho;
    }

    
}
