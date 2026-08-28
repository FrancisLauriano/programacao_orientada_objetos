package Estudo.Estacionamento;

public class Funcionario {
    
    private String nome;
    private int matricula;
    private Estacionamento estacionamento;

    public Funcionario(String nome, int matricula, Estacionamento estacionamento ){
        this.nome = nome;
        this.matricula = matricula;
        this.estacionamento = estacionamento;
    }

    public String iniciarExpediente(){
        if(estacionamento.isAberto()){
            return "Estacionamento ja esta aberto";
        }

        estacionamento.alternar();
        return "Expediente iniciado";
    }

    public String encerrarExpediente(){

        if(!estacionamento.isAberto()){
            return "Expediente ja está encerrado";
        }

        estacionamento.alternar();
        return "Expediente encerrado";
    }

    public String registrarEntrada(Carro carro){
        boolean adicionar, isAberto;

        isAberto = estacionamento.isAberto();
        if(!isAberto){
            return "Estacionamento está fechado";
        }

        adicionar = estacionamento.adicionarCarro(carro);
        if(!adicionar){
            return "Nao foi possivel registrar entrada do carro";
        }
        

        return "Carro registrado com sucesso";
    }

    public String registrarSaida(String placa){
        boolean remover, isAberto;

        isAberto = estacionamento.isAberto();
        if(!isAberto){
            return "Estacionamento está fechado";
        }

        remover = estacionamento.removerCarro(placa);
        if(!remover){
            return "Nao foi possivel registrar saída do carro";
        }


        return "Saída registrada com sucesso";
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

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }


    
}
