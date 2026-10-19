package Revisao1GQ.Exe03;

public class Sala {
    private String nome;
    private boolean ocupada;
    private Aluno[] turma;
    private int dia;

    private static final int TAM = 10;

    public Sala(String nome, boolean ocupada){
        this.nome = nome;
        this.ocupada = ocupada;
        this.turma = new Aluno[TAM];
        this.dia = 0;
    }

    public void alternar(){
        ocupada = !ocupada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Aluno[] getTurma() {
        return turma;
    }

    public void setTurma(Aluno[] turma) {
        this.turma = turma;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    
    
}
