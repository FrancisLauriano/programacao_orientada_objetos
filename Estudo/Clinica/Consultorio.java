package Estudo.Clinica;

public class Consultorio {
    
    public static final int TAM = 10;

    private int numero;
    private Medico medico;
    private Paciente[] pacientes;
    private int qtdPacientes; 

    public Consultorio(int numero, Medico medico){
        this.numero = numero;
        this.medico = medico;
        this.pacientes = new Paciente[TAM];
        this.qtdPacientes = 0;
    }



    // adicionarPaciente(Paciente paciente)
    public boolean adicionarPaciente(Paciente paciente){
        int indice;

        if(qtdPacientes >= TAM){
            return false;
        }

        indice = buscarPaciente(paciente.getCodigo());

        if(indice != -1){
            return false;
        }

        pacientes[qtdPacientes] = paciente;
        qtdPacientes += 1;

        return true;
    }


    // buscarPaciente(int codigo)
    public int buscarPaciente(int codigo){
        int i;

        for(i = 0; i < pacientes.length; i += 1){
            if(pacientes[i] != null){
                if(pacientes[i].getCodigo() == codigo){
                    return i;

                }

            }
        }

        return -1;
    }


    // removerPaciente(int codigo)
    public boolean removerPaciente(int codigo){
        int indice, i;

        indice = buscarPaciente(codigo);

        if(indice == -1){
            return false;
        }

        for(i = indice; i < pacientes.length - 1; i += 1){
            pacientes[i] = pacientes[i + 1];

        }

        pacientes[qtdPacientes - 1] = null;
        qtdPacientes -= 1;

        return true;
    }


    // listarPacientes()
    public void listarPacientes(){
        int i;

        for(i = 0; i < pacientes.length; i += 1){
            if(pacientes[i] != null){
                System.out.println("Nome: " + pacientes[i].getNome());
                System.out.println("Idade: " + pacientes[i].getIdade());
                System.out.println("Codigo: " + pacientes[i].getCodigo());
                System.out.println("---------------");

            }

        }
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

    public int getQtdPacientes() {
        return qtdPacientes;
    }

    public void setQtdPacientes(int qtdPacientes) {
        this.qtdPacientes = qtdPacientes;
    }
}
