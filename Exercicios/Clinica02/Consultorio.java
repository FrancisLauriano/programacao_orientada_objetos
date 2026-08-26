package Exercicios.Clinica02;

public class Consultorio {
    private static final int TAM = 10;
    
    private int num;
    private boolean ocupado;
    private Paciente[] pacientes;
    private int dia;
    

    public Consultorio(int num, boolean ocupado){
        this.num = num;
        this.ocupado = ocupado;
        this.pacientes = new Paciente[TAM];
        this.dia = 0;
    }


    public void alterar(){
        ocupado = !ocupado;
    }


    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public boolean isOcupado() {
        return ocupado;
    }


    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }


    public Paciente[] getPacientes() {
        return pacientes;
    }


    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }


    public int getDia() {
        return dia;
    }


    public void setDia(int dia) {
        this.dia = dia;
    }

    

}
