package Revisao1GQ.Exe04;

public class Cliente {
    private String nome;
    private boolean vip;
    private Produto[] carrinho;

    private static final int TAM = 10;

    public Cliente(String nome, boolean vip){
        this.nome = nome;
        this.vip = vip;
        this.carrinho = new Produto[TAM];
    }

    public void adicionarProduto(Produto produto){
        int i;

        if(produto != null && produto.isDisponibilidade()){
            if(carrinho[carrinho.length - 1] == null){
                for(i = 0; i < carrinho.length; i += 1){
                    if(carrinho[i] == null){
                        carrinho[i] = produto;
                        System.out.printf("Produto adicionado com sucesso\n");
                        return;
                    }

                }

            }
        }

        System.out.printf("Nao e possivel adicionar produto\n");
    }

    

    public void removerProduto(int pos){
        if(pos >= 0 && pos < carrinho.length){
            if(carrinho[pos] != null){
                int i;

                for(i = pos; i < carrinho.length - 1; i += 1){
                    carrinho[i] = carrinho[i + 1];
                }

                carrinho[carrinho.length - 1] = null;
                System.out.printf("Produto removido com sucesso.\n");
                return;
            }

        }

        System.out.printf("Nao e possivel remover produto\n");
    }

    public void comprar(){
        int i;
        double soma = 0.00;

        System.out.printf("===== COMPRA =====\n");
        for(i = 0;  i < carrinho.length; i += 1){
            if(carrinho[i] != null){
                soma += carrinho[i].getValor();
                System.out.printf("%s ..... R$%.2f\n", carrinho[i].getNome(), carrinho[i].getValor());
            }
        }

        if(soma > 0.00 && vip){
            soma -= (soma * 0.1);
        }

        System.out.printf("TOTAL ..... R$.2f\n", soma);

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
