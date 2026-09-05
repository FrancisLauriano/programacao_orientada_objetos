package Aula07.Universidade;

public class Professor {
    private static final int TAM = 5;
    
    private String nome;
    private int matricula;
    private Aula[] cargaHoraria;


    public Professor(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.cargaHoraria = new Aula[TAM];
    }

    public int calcularCHTotal(){
        int i, total = 0;
        
        for(i = 0; i < cargaHoraria.length; i += 1){
            if(cargaHoraria != null){
                total += cargaHoraria[i].getCH();
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


    public Aula[] getCargaHoraria() {
        return cargaHoraria;
    }


    public void setCargaHoraria(Aula[] cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

   

}
