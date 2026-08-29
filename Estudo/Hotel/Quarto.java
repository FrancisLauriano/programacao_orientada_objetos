package Estudo.Hotel;

public class Quarto {

    private int numero;
    private boolean ocupado;
    private Hospede hospede;


    public Quarto(int numero){
        this.numero = numero;
        this.ocupado = false;
        this.hospede = null;
    }

   
    public void alternar(){
        ocupado = !ocupado;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public boolean isOcupado() {
        return ocupado;
    }


    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }


    public Hospede getHospede() {
        return hospede;
    }


    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    
    
}
