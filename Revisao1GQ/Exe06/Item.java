package Revisao1GQ.Exe06;

public class Item {
    private String nome;
    private int codigo;
    private double valor;
    private int QtdEstoque;
    private boolean disponibilidade;

    public Item(String nome, int codigo, double valor, int QtdEstoque, boolean disponibilidade){
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.QtdEstoque = QtdEstoque;
        this.disponibilidade = disponibilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdEstoque() {
        return QtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        QtdEstoque = qtdEstoque;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    
    
}
