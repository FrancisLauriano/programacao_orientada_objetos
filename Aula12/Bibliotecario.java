package Aula12;

public class Bibliotecario extends LeitorPremium {
    private String setor;
    private int codigoFuncional;
    private double salario;


    public Bibliotecario(String nome, int matricula, int idade, boolean bloqueado, int pontos, int totalEmprestimos, String setor, int codigoFuncional, double salario){
        super(nome, matricula, idade, bloqueado, pontos, totalEmprestimos);
        this.setor = setor;
        this.codigoFuncional = codigoFuncional;
        this.salario = salario;
    }

    public boolean renovarEstoque(Livro livro, int quantidade){
        if(livro != null && quantidade > 0){
            livro.setQtdDisponivel(livro.getQtdDisponivel() + quantidade);
            return true;
        }

        return false;
    }

    public boolean bloquearLivro(Livro livro){
        if(livro != null){
            livro.setDisponivel(false);
            return true;
        }

        return false;
    }

    public boolean liberarLivro(Livro livro){
        if(livro != null){
            if(livro.getQtdDisponivel() > 0){
                livro.setDisponivel(true);
                return true;
            }

        }

        return false;
    }


    public String getSetor() {
        return setor;
    }


    public void setSetor(String setor) {
        this.setor = setor;
    }


    public int getCodigoFuncional() {
        return codigoFuncional;
    }


    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    
    
}
