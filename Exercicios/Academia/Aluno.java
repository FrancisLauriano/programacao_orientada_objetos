package Exercicios.Academia;;

public class Aluno{

    private static final int TAM = 10;

    private String nome;
    private int matricula;
    private int idade;
    private boolean[] presencas = new boolean[TAM];


    public Aluno(String nome, int matricula, int idade){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getMatricula() {
        return matricula;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public boolean[] getPresencas() {
        return presencas;
    }


    public void setPresencas(boolean[] presencas) {
        this.presencas = presencas;
    }


    
}