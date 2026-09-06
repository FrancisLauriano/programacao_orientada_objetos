package Estudo.SistemaAcademia;

public class Aluno extends Pessoa{
    private Plano plano;
    private FichaTreino ficha;
    private boolean vip;
    // private int codigo = 1;


    public Aluno(String nome, int idade, String matricula, Plano plano, int codigoFicha){
        super(nome, idade, matricula);
        this.plano = plano;
        this.ficha = new FichaTreino(codigoFicha);
        this.vip = false;

        // this.ficha = new FichaTreino(codigo);
        // codigo += 1;
    }


    // alterarPlano(Plano novoPlano)
    public boolean alterarPlano(Plano novoPlano){
        if(novoPlano != null){
            plano = novoPlano;
            return true;
        } 

        return false;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public FichaTreino getFicha() {
        return ficha;
    }

    public void setFicha(FichaTreino ficha) {
        this.ficha = ficha;
    }  

    
    public boolean isVip() {
        return vip;
    }


    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
