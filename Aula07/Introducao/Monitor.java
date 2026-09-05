package Aula07.Introducao;

public class Monitor extends Estudante{
    private String horario;

    public Monitor(String nome, int idade, double mensalidade, String horario){
        super(nome, idade, mensalidade);
        this.horario = horario;
    }

    public void imprimirHorario(){
        System.out.printf("Meu horario de monitoria %s\n", horario);
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
