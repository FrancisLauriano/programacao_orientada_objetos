package Estudo.Hotel;

public class Hotel {

    private static final int TAM = 10;

    private String nome;
    private Quarto[] quartos;
    private int qtdQuartos;

    public Hotel(String nome){
        this.nome = nome;
        this.quartos = new Quarto[TAM];
        this.qtdQuartos = 0;

    }

    public boolean adicionar(Quarto quarto){
    
        if(qtdQuartos < TAM){
            quartos[qtdQuartos] = quarto;
            qtdQuartos += 1;
            return true;
        }

        return false;
    }

    public int buscar(int numero){
        int i;

        for(i = 0; i < quartos.length; i += 1){
            if(quartos[i] != null){
                if(quartos[i].getNumero() == numero){
                    return i;
                }
            }

        }

        return -1;
    }



    public boolean hospedar(int numero, Hospede hospede){
        int indice;

        indice = buscar(numero);

        if(indice != -1){
            if(!quartos[indice].isOcupado()){
                quartos[indice].alternar();
                quartos[indice].setHospede(hospede);
                return true;
            }

        }
        return false;
    }



    public boolean liberarQuarto(int num){
        int indice;
        indice = buscar(num);

        if(indice != -1){
            if(quartos[indice].isOcupado()){
                quartos[indice].setHospede(null);
                quartos[indice].alternar();
                return true;
            }

        }



        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Quarto[] getQuartos() {
        return quartos;
    }

    public void setQuartos(Quarto[] quartos) {
        this.quartos = quartos;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

    
    
}
