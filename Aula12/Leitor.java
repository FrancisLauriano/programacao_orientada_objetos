package Aula12;
import java.util.ArrayList;

public class Leitor {
    private String nome;
    private int matricula;
    private int idade;
    private boolean bloqueado;
    private ArrayList<Livro> livrosEmprestados;


    public Leitor(String nome, int matricula, int idade, boolean bloqueado){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.bloqueado = bloqueado;
        this.livrosEmprestados = new ArrayList<Livro>();
    }

    

    public boolean emprestar(Livro livro){
        if(livro != null && livro.isDisponivel() & !bloqueado){
            livrosEmprestados.add(livro);
            livro.setQtdDisponivel(livro.getQtdDisponivel() - 1);

            if(livro.getQtdDisponivel() == 0){
                livro.setDisponivel(false);
            }

            return true;
            
        }

        return false;

    }


    public boolean devolver(int codigo){
        if(codigo > 0){
            for(Livro livro : livrosEmprestados){
                if(livro.getCodigo() == codigo){
                    livrosEmprestados.remove(livro);
                    livro.setQtdDisponivel(livro.getQtdDisponivel() + 1);
                    livro.setDisponivel(true);
                    return true;
                    
                }

            }
        }


        return false;
    }


    public void consultarEmprestimos(){
        int qtd = 0;
        for(Livro livro : livrosEmprestados){
            System.out.printf("=== Livro %d ===\n", qtd + 1);
            System.out.printf("Codigo: %d\n", livro.getCodigo());
            System.out.printf("Autor: %s\n", livro.getAutor());
            System.out.printf("Quantidade Disponivel: %d\n", livro.getQtdDisponivel());
            System.out.printf("Valor multa R$: %.2f\n", livro.getValorMulta());
            System.out.printf("Disponibilidade: %s\n", livro.isDisponivel());
            System.out.printf("==============\n");

        }
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


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public boolean isBloqueado() {
		return bloqueado;
	}


	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}


	public ArrayList<Livro> getLivrosEmprestados() {
		return livrosEmprestados;
	}


	public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}


    
}
