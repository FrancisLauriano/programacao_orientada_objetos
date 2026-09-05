package Aula07.Introducao;

public class Estudante {
    private String nome;
    private int idade;
    private double mensalidade;

    public Estudante(String nome, int idade, double mensalidade){
        this.nome = nome;
        this.idade = idade;
        this.mensalidade = mensalidade;

    }

    public void exibirMensalidade(){

        System.out.printf("Ola, meu nome e: %s tenho %d anos e minha mensalidade é R$ %.2f\n", nome, idade, mensalidade);
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

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    

    
}
