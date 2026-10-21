public class Aluno{
    private String nome;
    private String matricula;
    private double media;

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void media(double nota1, double nota2) throws NotaInvalidaException{
        if((nota1 < 0.00 || nota1 > 10.00) || (nota2 < 0.00 || nota2 > 10.00)){
            NotaInvalidaException nie = new NotaInvalidaException(nota1, nota2);
            throw nie;
        }else{
            media = (nota1 + nota2) / 2;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }
 
}