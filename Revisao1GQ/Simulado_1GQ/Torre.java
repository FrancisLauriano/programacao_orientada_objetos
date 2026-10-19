package Revisao1GQ.Simulado_1GQ;
import java.util.ArrayList;

public class Torre{
    private int codigo;
    private String nome;
    private double danoBase;
    private ArrayList<Inimigo> inimigosAtacados;
    private boolean ativa;

    public Torre(int codigo, String nome, double danoBase, boolean ativa){
        this.codigo = codigo;
        this.nome = nome;
        this.danoBase = danoBase;
        this.inimigosAtacados = new ArrayList<Inimigo>();
        this.ativa = ativa;
    }

    public void atacar(){
        for(Inimigo inimigo : inimigosAtacados){
            if(inimigo != null){
                inimigo.setVida(inimigo.getVida() - danoBase);

                if(inimigo.getVida() > 50){
                    inimigo.setSituacao("Resistente");
                }else if(inimigo.getVida() > 0){
                    inimigo.setSituacao("Ferido");
                }else{
                    inimigo.setSituacao("Eliminado");
                }
            }

        }
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(double danoBase) {
        this.danoBase = danoBase;
    }

    public ArrayList<Inimigo> getInimigosAtacados() {
        return inimigosAtacados;
    }

    public void setInimigosAtacados(ArrayList<Inimigo> inimigosAtacados) {
        this.inimigosAtacados = inimigosAtacados;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    
}

