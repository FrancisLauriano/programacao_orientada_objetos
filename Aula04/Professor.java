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

    public void chamada(boolean[] chamada){
        int i;
        Aluno[] turma = this.sala.getTurma();
        int dia = this.sala.getDiaDeAula();

        for(i = 0; i < turma.length; i += 1){
            if(turma[i] != null){
                turma[i].getPresenca()[dia] = chamada[i];
            }

        }
    }

    public String iniciarAula(){
        if(this.sala.isOcupada() == false){
            this.sala.alterar();
            return "A aula esta acontecendo na sala " + this.sala.getNome() +" com professor " + this.nome + " - matricula " + this.matricula;
        }

        return "Sala esta ocupada";
    }

    public String terminarAula(){
        int dia = this.sala.getDiaDeAula();

        if(this.sala.isOcupada() == true){
            this.sala.alterar();
            dia += 1;
            this.sala.setDiaDeAula(dia);

            return "Aula na sala " + this.sala.getNome() + " finalizada com professor "  + this.nome + " - matricula " + this.matricula;
        }

        return "Nao existe aula na sala " + this.sala.getNome();
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