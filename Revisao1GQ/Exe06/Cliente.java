package Revisao1GQ.Exe06;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private boolean bomCliente;
    private Item[] carrinho;

    private static final int TAM = 100;
    private static final int TAM_COMPRA = 2;

    public Cliente(String nome, int idade, String cpf, String endereco, boolean bomCliente){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bomCliente = bomCliente;
        this.carrinho = new Item[TAM];
    }

    public boolean adicionar(Item item){
        if(item != null){
            if(carrinho[carrinho.length - 1] == null){
                int i;
                for(i = 0; i < carrinho.length; i += 1){
                    if(carrinho[i] == null){
                        carrinho[i] = item;
                        return true;
                    }

                }
            }
        }

        return false;
    }

    public int buscarItem(int cod){
        if(cod > 0){
            int i;

            for(i = 0; i < carrinho.length; i += 1){
                if(carrinho[i] != null){
                    if(carrinho[i].getCodigo() == cod){
                        return i;
                    }

                }

            }
        }

        return -1;
    }

    public boolean cancelar(int cod){
        int indice = buscarItem(cod);

        if(indice != -1){
            int i;
            for(i = indice; i < carrinho.length - 1; i += 1){
                carrinho[i] = carrinho[i + 1];
            }

            carrinho[carrinho.length - 1] = null;
            return true;
        }

        return false;
    }

    public double[] comprar(){
        double[] compra = new double[TAM_COMPRA];
        double media, soma = 0.00;
        int i, qtd = 0;

        for(i = 0; i < carrinho.length; i += 1){
            if(carrinho[i] != null){
                qtd += 1;
                soma += carrinho[i].getValor();
                carrinho[i].setQtdEstoque(carrinho[i].getQtdEstoque() - 1);
            }
        }

        if(qtd > 0){
            media = soma / qtd;
        }else{
            media = 0.00;
        }

        compra[0] = soma;
        compra[1] = media;


        return compra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isBomCliente() {
        return bomCliente;
    }

    public void setBomCliente(boolean bomCliente) {
        this.bomCliente = bomCliente;
    }

    public Item[] getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Item[] carrinho) {
        this.carrinho = carrinho;
    }


    
}
