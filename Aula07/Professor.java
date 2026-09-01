package Aula07;

public class Professor {
    protected static final int TAM = 5;
    protected String nome;
    protected int matricula;
    protected int[] cargaHoraria;


    public Professor(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.cargaHoraria = new int[TAM];
    }

    public int calcularCHTotal(){
        int i, total = 0;

        for(i = 0; i < cargaHoraria.length; i += 1){
            if(cargaHoraria != null){
                total += cargaHoraria[i];
            }
        }

        return total;
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


    public int[] getCargaHoraria() {
        return cargaHoraria;
    }


    public void setCargaHoraria(int[] cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

   

}
