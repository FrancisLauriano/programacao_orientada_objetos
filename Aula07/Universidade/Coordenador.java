package Aula07.Universidade;

public class Coordenador extends Professor {

    private String nucleo;
    private Atendimento atendimento;

    public Coordenador(String nome, int matricula, String nucleo){
        super(nome, matricula);

        this.nucleo = nucleo;
    }


    public int somaHorasAtendimento(){
        String horarioAtendimento = atendimento.getHorario();

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
        // int totalMin = diferenca % 60;


        return totalHoras;
        // return "Tempo de atendimento: " + totalHoras + " horas e " + totalMin + " mminutos.";
    }

    // public void totalDeHoras(){
    //     int horasTotaisAulas = super.calcularCHTotal();
    //     int hotasTotaisAtendimento = somaHorasAtendimento();
    //     int total = horasTotaisAulas + hotasTotaisAtendimento;
    //     System.out.printf("TOTAL: %d\n", total);
    // }


    public int calcularCHTotal(){
        int i, total = 0;
        
        for(i = 0; i < super.getCargaHoraria().length; i += 1){
            if(super.getCargaHoraria() != null){
                total += super.getCargaHoraria()[i].getCH();
            }
        }
        return total + somaHorasAtendimento();
    }


    public String getNucleo() {
        return nucleo;
    }

    public void setNucleo(String nucleo) {
        this.nucleo = nucleo;
    }

}
