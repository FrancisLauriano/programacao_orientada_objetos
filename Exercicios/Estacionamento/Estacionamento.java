package Exercicios.Estacionamento;

public class Estacionamento {

    private static final int TAM = 10;

    private String nome;
    private boolean aberto;
    private Carro[] carros;
    private int qtdCarros;


    public Estacionamento (String nome){
        this.nome = nome;
        this.aberto = false;
        this.carros = new Carro[TAM];
        this.qtdCarros = 0;
    }

    public void alternar(){
        aberto = !aberto;
    }

    public int buscarCarro(String placa){
        int i;

        for(i = 0; i < carros.length; i += 1){
            if(carros[i] != null){
                if(carros[i].getPlaca().equals(placa)){
                    return i;
                }
            }
        }


        return -1;
    }

    public boolean adicionarCarro(Carro carro){
        if(qtdCarros >= TAM){
            return false;
        }

        int indice;
        indice = buscarCarro(carro.getPlaca());

        if(indice != -1){
            return false;
        }

        carros[qtdCarros] = carro;
        qtdCarros += 1;

        return true;
    }


    public boolean removerCarro(String placa){
        int indice, i;
        indice = buscarCarro(placa);

        if(indice == -1){
            return false;
        }

        for(i = indice; i < carros.length - 1; i += 1){
            carros[i] = carros[i + 1];
        }

        carros[qtdCarros - 1] = null;
        qtdCarros -= 1;

        return true;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public boolean isAberto() {
        return aberto;
    }


    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }


    public Carro[] getCarros() {
        return carros;
    }


    public void setCarros(Carro[] carros) {
        this.carros = carros;
    }


    public int getQtdCarros() {
        return qtdCarros;
    }


    public void setQtdCarros(int qtdCarros) {
        this.qtdCarros = qtdCarros;
    }


    
    
}
