package Estudo.SistemaAcademia;

public class Treinador {

    private String nome;
    private String registro;
    private Academia academia;

    public Treinador(String nome, String registro, Academia academia){
        this.nome = nome;
        this.registro = registro;
        this.academia = academia;
    }

    // iniciarExpediente
    public void iniciarExpediente(){
        if(!academia.isAberta()){
            academia.alternar();
            System.out.printf("Expediente iniciado\n");
        }else{
            System.out.printf("Expediente ja foi iniciado\n");
        }
    }

    // registrarTreino
    public boolean registrarTreino(Aluno aluno, int dia, boolean frequencia){

        if(aluno != null){
            if(aluno.getFicha().registrarFrequencia(dia, frequencia)){
                return true;

            }
        }
        return false;
    }

    // alterarPlanoAluno
    public boolean alterarPlanoAluno(Aluno aluno, Plano novoPlano){
        int indiceAlu;

        if(aluno != null && novoPlano != null){
            indiceAlu = academia.buscarPessoa(aluno.getMatricula());

            if(indiceAlu != -1){
                if(aluno.alterarPlano(novoPlano)){
                    return true;
                }
            }
        }
        return false;
    }

    // finalizarExpediente
    public void finalizarExpediente(){
        if(academia.isAberta()){
            academia.alternar();
            System.out.printf("Expediente encerrado\n");
        }else{
            System.out.printf("Expediente ja estava encerrado\n");
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
    
    
}
