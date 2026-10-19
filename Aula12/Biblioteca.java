package Aula12;
import java.util.ArrayList;


public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros;
    private ArrayList<Leitor> leitores;

    public Biblioteca(String nome){
        this.nome = nome;
        this.livros = new ArrayList<Livro>();
        this.leitores = new ArrayList<Leitor>();
    }

    public boolean adicionarLivro(Livro livro){
        if(livro != null){
            livros.add(livro);

            return true;
        }

        return false;

    }

    public boolean adicionarLeitor(Leitor leitor){
        if(leitor != null){
            leitores.add(leitor);
            return true;
        }

        return false;
    }

    public Livro buscarLivro(int codigo){
        if(codigo > 0){
            for(Livro livro : livros){
                if(livro != null){
                    if(livro.getCodigo() == codigo){
                        return livro;
                    }
                }
            }
        }

        return null;
    }

    public Leitor buscarLeitor(int matricula){
        if(matricula > 0){
            for(Leitor leitor: leitores){
                if(leitor != null){
                    if(leitor.getMatricula() == matricula){
                        return leitor;
                    }
                }

            }

        }

        return null;
    }

    public ArrayList<Livro> livrosDisponiveis(){
        ArrayList<Livro> livrosDisponiveis = new ArrayList<Livro>();

        for(Livro livro : livros){
            if(livro != null){
                if(livro.isDisponivel()){
                    livrosDisponiveis.add(livro);
                }

            }

        }

        return livrosDisponiveis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Leitor> getLeitores() {
        return leitores;
    }

    public void setLeitores(ArrayList<Leitor> leitores) {
        this.leitores = leitores;
    } 


    
    
}
