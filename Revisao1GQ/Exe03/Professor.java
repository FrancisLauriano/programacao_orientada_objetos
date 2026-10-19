package Revisao1GQ.Exe03;

public class Professor {
    private String nome;
    private int idade;
    private int matricula;
    private Sala sala;

    public Professor(String nome, int idade, int matricula, Sala sala){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.sala = sala;
    }

    public void iniciarAula(){
        if(!sala.isOcupada()){
            sala.alternar();
            System.out.printf("Aula esta acontecendo com professor %s - matricula %d\n", nome, matricula);
        }else{
            System.out.printf("Sala ocupada\n");

        }
    }

    public void chamada(boolean[] chamada){
        int i;
        int dia = sala.getDia();
        Aluno[] turma = sala.getTurma();

        for(i = 0; i < turma.length; i += 1){
            if(turma[i] != null){
                turma[i].getPresenca()[dia] = chamada[i];
            }

        }


    }

    public void terminarAula(){
        if(sala.isOcupada()){
            sala.setDia(sala.getDia() + 1);
            System.out.printf("Aula finalizada com professor %s - matricula %d\n", nome, matricula);

        }else{
            System.out.printf("Nao existe aula nessa sala\n");
        }
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    
    
}
