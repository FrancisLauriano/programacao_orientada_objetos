package Aula07;

public class Coordenador extends Professor {

    private String nucleo;

    public Coordenador(String nome, int matricula, String nucleo){
        super(nome, matricula);

        this.nucleo = nucleo;
    }


    public String somaHorasAtendimento(Atendimento atendimeto){
        String horarioAtendimento = atendimeto.getHorario();

        String[] horarios = horarioAtendimento.split(" as | às ");
        String inicio = horarios[0];
        String fim = horarios[1];

        String[] horarioInicio = inicio.split(":| : ");
        String[] horarioFim = fim.split(":| : ");

        int horaInicio = Integer.parseInt(horarioInicio[0]);
        int horaFim = Integer.parseInt(horarioFim[0]);

        int minInicio = Integer.parseInt(horarioInicio[1]);
        int minFim = Integer.parseInt(horarioFim[1]);

        int totalInicioMin = horaInicio * 60 + minInicio;
        int totalFinalMin = horaFim * 60 + minFim;
        
        int diferenca = totalFinalMin - totalInicioMin;
        int totalHoras = diferenca / 60;
        int totalMin = diferenca % 60;



        return "Tempo de atendimento: " + totalHoras + " horas e " + totalMin + " mminutos.";
    }


    public String getNucleo() {
        return nucleo;
    }

    public void setNucleo(String nucleo) {
        this.nucleo = nucleo;
    }

}
