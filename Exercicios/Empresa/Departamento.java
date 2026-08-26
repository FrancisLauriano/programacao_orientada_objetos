package Exercicios.Empresa;

public class Departamento {

    public static final int TAM = 15;

    private String nome;
    private Gerente gerente;
    private Funcionario[] funcionarios;
    private int qtdFuncionarios;


    public Departamento(String nome, Gerente gerente){
        this.nome = nome;
        this.gerente = gerente;
        this.funcionarios = new Funcionario[TAM];
        this.qtdFuncionarios = 0;
    }


    // adicionarFuncionario(Funcionario funcionario)
    public boolean adicionarFuncionario(Funcionario funcionario){

        if(qtdFuncionarios >= TAM){
            return false;
        }

        funcionarios[qtdFuncionarios] = funcionario;
        qtdFuncionarios += 1;


        return true;
    }


    // buscarFuncionario(int matricula)
    public int buscarFuncionario(int matricula){
        int i;

        for(i = 0; i < funcionarios.length; i += 1){
            if(funcionarios[i] != null){
                if(funcionarios[i].getMatricula() == matricula){
                    return i;
                }

            }
        }

        return -1;
    }


    // removerFuncionario(int matricula)
    public boolean removerFuncionario(int matricula){
        int indice, i;

        indice = buscarFuncionario(matricula);

        if(indice == -1){
            return false;
        }

        for(i = indice; i < funcionarios.length - 1; i += 1){
            funcionarios[i] = funcionarios[i + 1];
        }

        funcionarios[qtdFuncionarios - 1] = null;
        qtdFuncionarios -= 1;

        return true;
    }


    public double calcularFolhaSalarial(){
        int i;
        double somaSalario = 0.00;

        for(i = 0; i < funcionarios.length; i += 1){
            if(funcionarios[i] != null){
                somaSalario += funcionarios[i].getSalario();

            }
        }

        return somaSalario;
    }


    // listarFuncionarios()
    public void listarFuncionarios(){
        int i;

        for(i = 0; i < funcionarios.length; i += 1){
            if(funcionarios[i] != null){
                System.out.println("Nome: " + funcionarios[i].getNome());
                System.out.println("Matricula: " + funcionarios[i].getMatricula());
                System.out.println("Salario: " + funcionarios[i].getSalario());
                System.out.println("------------");
            }
        }
    }




    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Gerente getGerente() {
        return gerente;
    }


    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }


    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }


    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }


    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }


    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }


    
    
}
