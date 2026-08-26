package Exercicios.Escola;

public class Turma{

    private static final int TAM = 10;

    private String nome;
    private Professor professor;
    private Aluno[] alunos;
    private int qtdAlunos;

    public Turma(String nome, Professor professor){
        this.nome = nome;
        this.professor = professor;
        this.alunos = new Aluno[TAM];
        this.qtdAlunos = 0;

    }

    // adicionar aluno
    boolean adicionarAluno(Aluno aluno){

        if(qtdAlunos >= TAM){
            return false;
        }

        alunos[qtdAlunos] = aluno;
        qtdAlunos += 1;

        return true;
    }


    // buscar aluno por matricula
    int buscarAluno(int matricula){
        int i;

        for(i = 0; i < alunos.length; i += 1){
            if(alunos[i] != null){

                if(alunos[i].getMatricula() == matricula){
                    return i;
                }
            }

        }

        return -1;
    }


    // remover aluno por matricula
    boolean removerAluno(int matricula){
        int indice, i;
        indice = buscarAluno(matricula);

        if(indice == -1){
            return false;
        }

        for(i = indice; i < alunos.length - 1; i += 1){
            alunos[i] = alunos[i + 1];
        }

        
        alunos[qtdAlunos - 1] = null;
        qtdAlunos -= 1;

        return true;
    }


    // exibir alunos
    void exibirAlunos(){
        int i;

        for(i = 0; i < alunos.length; i += 1){
            if(alunos[i] != null){
                System.out.println("Nome: " + alunos[i].getNome());
                System.out.println("Matricula: " + alunos[i].getMatricula());
                System.out.println("Idade: " + alunos[i].getIdade());
                System.out.println("--------------");
            }    

        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    


}