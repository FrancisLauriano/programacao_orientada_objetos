package Estudo.SistemaAcademia;

public class Instrutor extends Pessoa{
    private static final int TAM = 3;

    private String especialidade;
    private Turno[] turnos;
    private int qtdTurnos;

    public Instrutor(String nome, int idade, String matricula, String especialidade){
        super(nome, idade, matricula);
        this.especialidade = especialidade;
        this.turnos = new Turno[TAM];
        this.qtdTurnos = 0;
    }

    // buscarTurno
    public int buscarTurno(Turno turno){
        int i;

        if(turno != null){
            for(i = 0; i < turnos.length; i += 1){
                if(turnos[i] != null && turnos[i] == turno){
                    return i;
                }

            }
        }
        return -1;
    }

    // adicionarTurno
    public boolean adicionarTurno(Turno turno){
        int indiceTurno;

        if(turno != null && qtdTurnos < TAM){
            indiceTurno = buscarTurno(turno);

            if(indiceTurno == -1){
                turnos[qtdTurnos] = turno;
                qtdTurnos += 1;
                return true;
            }
        }
        return false;
    }


    // atualizarTurno
    public boolean atualizarTurno(Turno turno, Turno novoTurno){
        int indiceTurno;

        if(turno != null && novoTurno != null){
            indiceTurno = buscarTurno(turno);

            if(indiceTurno != -1 && buscarTurno(novoTurno) == -1){
                turnos[indiceTurno] = novoTurno;
                return true;
            }
        }
        return false;
    }


    // removerTurno
    public boolean removerTurno(Turno turno){
        int indiceTurno, i;

        if(turno != null){
            indiceTurno = buscarTurno(turno);

            if(indiceTurno != -1){
                for(i = indiceTurno; i < qtdTurnos - 1; i += 1){
                    turnos[i] = turnos[i + 1];
                }
                qtdTurnos -= 1;
                turnos[qtdTurnos] = null;
                return true;
            }

        }

        return false;
    }



    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Turno[] getTurnos() {
        return turnos;
    }

    public void setTurnos(Turno[] turnos) {
        this.turnos = turnos;
    }

    public int getQtdTurnos() {
        return qtdTurnos;
    }

    public void setQtdTurnos(int qtdTurnos) {
        this.qtdTurnos = qtdTurnos;
    }

    
    

}
