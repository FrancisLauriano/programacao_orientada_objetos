package Estudo.Academia;

public class Academia {

    private static final int TAM = 10;

    private String nome;
    private boolean aberta;
    private Aluno[] alunos;
    private int dia;
    private int qtdAlunos;


    public Academia(String nome){
        this.nome = nome;
        this.aberta = false;
        this.alunos = new Aluno[TAM];
        this.dia = 0;
        this.qtdAlunos = 0;
    }

    public void alterar(){
        aberta = !aberta;
    }

    public boolean adicionarAluno(Aluno aluno){
        int indice;

        if(qtdAlunos >= TAM){
            return false;
        }

        indice = buscarAluno(aluno.getMatricula());

        if(indice != -1){
            return false;
        }

        alunos[qtdAlunos] = aluno;
        qtdAlunos += 1;

        return true;
    }

    public int buscarAluno(int matricula){
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


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public boolean isAberta() {
        return aberta;
    }


    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }


    public Aluno[] getAlunos() {
        return alunos;
    }


    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


    public int getDia() {
        return dia;
    }


    public void setDia(int dia) {
        this.dia = dia;
    }


    public int getQtdAlunos() {
        return qtdAlunos;
    }


    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }


    
    
    
}
