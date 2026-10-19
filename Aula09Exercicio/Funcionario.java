package Aula09Exercicio;

public class Funcionario extends ClienteEspecial{

    private String setor;
    private int id;
    private double salario;

    public Funcionario(String nome, int idade, String cpf, String endereco, boolean bomCliente, int pontos, double saldoDeCompras, String setor, int id, double salario){
        super(nome, idade, cpf, endereco, bomCliente, pontos, saldoDeCompras);
        this.setor = setor;
        this.id = id;
        this.salario = salario;
    }

    public boolean renovarEstoque(int qtd, Item item){
        if(item != null && qtd > 0){
            item.setQtdEstoque(item.getQtdEstoque() + qtd);
            return true;
        }

        return false;
    }

    public void bloquerItem(Item item){
        if(item != null){
            item.setDisponibilidade(false);
        }
        
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
   
    
}
