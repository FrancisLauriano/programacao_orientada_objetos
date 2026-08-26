package Exercicios.Academia;

public class Instrutor {


    private String nome;
    private int matricula;
    private Academia academia;

    public Instrutor(String nome, int matricula, Academia academia){
        this.nome = nome;
        this.matricula = matricula;
        this.academia = academia;
    }


    public String inciarTreino(){
        if(academia.isAberta()){
            return "Treino ja esta acontecendo";
        }

        academia.alterar();

        return "Terino iniciado pelo instrutor  " + nome +" - matricula " + matricula;
    }


    public void realizarChamada(boolean[] chamada){
        Aluno[] alunos = academia.getAlunos();
        int i, dia = academia.getDia();

        for(i = 0; i < alunos.length; i += 1){
            if(alunos[i] != null){
                alunos[i].getPresencas()[dia] = chamada[i];
            }

        }

    }

    public String finalizarTreino(){
        if(!academia.isAberta()){
            return "Nao esta acorrendo treino no momento";
        }

        academia.alterar();

        academia.setDia(academia.getDia() + 1);

        return "Treino finalizado";
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


    public Academia getAcademia() {
        return academia;
    }


    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
    

    
}
