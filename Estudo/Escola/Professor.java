package Estudo.Escola;

public class Professor{

    private String nome;
    private String formacao;

    public Professor(String nome, String formacao){
        this.nome = nome;
        this.formacao = formacao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
}