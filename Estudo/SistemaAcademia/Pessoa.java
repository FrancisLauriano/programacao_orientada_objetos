package Estudo.SistemaAcademia;

public class Pessoa {
    private String nome;
    private int idade;
    private String matricula;
    private boolean ativo;

    public Pessoa(String nome, int idade, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.ativo = true;
    }

    public void alternarAtivo(){
        ativo = !ativo;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    
}
