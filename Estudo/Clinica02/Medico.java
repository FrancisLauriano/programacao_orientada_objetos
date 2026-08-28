package Estudo.Clinica02;

public class Medico {

    private String nome;
    private String crm;
    private String especialidade;
    private Consultorio consultorio;

    public Medico(String nome, String crm, String especialidade, Consultorio consultorio){
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.consultorio = consultorio;
    }

    public String iniciarAtendimento(){
        if(consultorio.isOcupado()){
            return "já existe atendimento nesse consultorio";

        }

        consultorio.alterar();
        return "Atendimento iniciado com o medico " + nome + " - CRM " + crm;
    }
    
    public void realizarConsultas(boolean[] consultas){
        int i,  dia = consultorio.getDia();
        Paciente[] pacientes = consultorio.getPacientes();

        for(i = 0; i < pacientes.length; i += 1){
            if(pacientes[i] != null){
                pacientes[i].getConsultas()[dia] = consultas[i];
            }
        }

    }

    public String finalizarAtendimento(){
        
        if(consultorio.isOcupado()){
            consultorio.alterar();
            consultorio.setDia(consultorio.getDia() + 1);

            return "Consulta finalizada";
        }
       
        return "Consutorio desocupado";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }



    
    
}
