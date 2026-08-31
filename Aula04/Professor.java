package Aula04;

public class Professor{

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
            System.out.printf("Aula iniciado na sala %d com o professor %s - matricula %s\n", sala.getNome(), nome, matricula);
            sala.alternar();
        }else{
            System.out.printf("Sala %s está ocupada\n", sala.getNome());
        }
    }

    public void chamada(boolean[] v){
        int dia = sala.getDiaDeAula();
        Aluno[] turma = sala.getTurma();

        int i;

        for(i = 0; i < turma.length; i += 1){
            if(turma[i] != null){
                turma[i].getPresenca()[dia] = v[i];
            }
        }
    }

    public void terminarAula(){
        if(sala.isOcupada()){
            System.out.printf("Aula finalizada com o professor %s - matricula %d\n", nome, matricula);
            sala.setDiaDeAula(sala.getDiaDeAula() + 1);
        }else{
            System.out.printf("Sem aula no momento\n");
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