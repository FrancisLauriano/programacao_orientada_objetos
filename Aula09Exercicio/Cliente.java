package Aula09Exercicio;

public class Cliente {
    private static final int TAM = 100;

    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private boolean bomCliente;
    private Item[] carrinho;


    public Cliente(String nome, int idade, String cpf, String endereco, boolean bomCliente){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bomCliente = bomCliente;
        this.carrinho = new Item[TAM];
    }

    public boolean adicionar(Item item){
        if(item != null && item.isDisponibilidade() && carrinho[TAM-1] == null){
            int i;
            for(i = 0; i < TAM; i += 1){
                if(carrinho[i] == null){
                    carrinho[i] = item;
                    return true;
                }
            }
        }

        return false;
    }

    public int buscarItem(int cod){
        if(cod > 0){
            int i;

            for(i = 0; i < TAM; i += 1){
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
        if(cod > 0){
            int indCod = buscarItem(cod);

            if(indCod != -1){
                int i;
                for(i = indCod; i < TAM - 1; i += 1){
                    carrinho[i] = carrinho[i + 1];
                }

                carrinho[TAM - 1] = null;
                return true;
            }
        }
       

        return false;
    }

    public double[] comprar(){
        int i, qtdItens = 0;
        double somaValorItens = 0.00;

        for(i = 0; i < TAM; i += 1){
            if(carrinho[i] != null){
                qtdItens += 1;
                somaValorItens += carrinho[i].getValor();
                carrinho[i].setQtdEstoque(carrinho[i].getQtdEstoque() - 1);
            }
        }

        double[] dadosCompra = new double[2];
        dadosCompra[0] = somaValorItens;

        if(somaValorItens > 0.00){
            dadosCompra[1] = somaValorItens / qtdItens;
        }else{
            dadosCompra[1] = 0.00;
        }

        return dadosCompra;
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
