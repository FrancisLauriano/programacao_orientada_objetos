package Revisao1GQ.Simulado_1GQ;
import java.util.ArrayList;

public class TorreElite extends Torre{
    private double danoCritico;

    public TorreElite(int codigo, String nome, double danoBase, boolean ativa, double danoCritico){
        super(codigo, nome, danoBase, ativa);
        this.danoCritico = danoCritico;
    }

    @Override
    public void atacar(){
        int eliminados = 0;

        for(Inimigo inimigo : super.getInimigosAtacados()){
            if(inimigo != null && !inimigo.getSituacao().equals("Eliminado")){
                if(inimigo.getSituacao().equals("Resistente")){
                    inimigo.setVida(inimigo.getVida() - super.getDanoBase());
                }else if(inimigo.getSituacao().equals("Ferido")){
                    inimigo.setVida(inimigo.getVida() - danoCritico);
                }

                if(inimigo.getVida() > 50){
                    inimigo.setSituacao("Resistente");
                }else if(inimigo.getVida() > 0){
                    inimigo.setSituacao("Ferido");
                }else{
                    inimigo.setSituacao("Eliminado");
                    eliminados += 1;
                }
            }
        }

        System.out.printf("Quantidade de inimigos eliminados: %d\n", eliminados);
    }

    public void atacar(ArrayList<Boolean> buffs){
        int i, eliminados = 0;

        for(i = 0; i < buffs.size(); i += 1){

            if(buffs.get(i) != null){
                Inimigo inimigo = super.getInimigosAtacados().get(i);

                if(inimigo != null && !inimigo.getSituacao().equals("Eliminado")){
                    if(buffs.get(i).equals(true)){
                        
                        if(inimigo.getSituacao().equals("Resistente")){
                            inimigo.setVida(inimigo.getVida() - (super.getDanoBase() + 10));
                        }else if(inimigo.getSituacao().equals("Ferido")){
                            inimigo.setVida(inimigo.getVida() - (danoCritico + 10));
                        }

                    }else{
                        if(inimigo.getSituacao().equals("Resistente")){
                            inimigo.setVida(inimigo.getVida() - super.getDanoBase());
                        }else if(inimigo.getSituacao().equals("Ferido")){
                            inimigo.setVida(inimigo.getVida() - danoCritico);
                        }
                    }


                    if(inimigo.getVida() > 50){
                        inimigo.setSituacao("Resistente");
                    }else if(inimigo.getVida() > 0){
                        inimigo.setSituacao("Ferido");
                    }else{
                        inimigo.setSituacao("Eliminado");
                        eliminados += 1;
                    }
                }
            }
        }
        System.out.printf("Quantidade de inimigos eliminados: %d\n", eliminados);
    }

    public double getDanoCritico() {
        return danoCritico;
    }

    public void setDanoCritico(double danoCritico) {
        this.danoCritico = danoCritico;
    }

    

}