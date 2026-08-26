package Exercicios.Clinica;

public class Paciente {

    private String nome;
    private int idade;
    private int codigo;
    

    public Paciente(String nome, int idade, int codigo){
        this.nome = nome;
        this.idade = idade;
        this.codigo = codigo;
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


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
}
