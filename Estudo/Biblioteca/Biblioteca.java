package Estudo.Biblioteca;

public class Biblioteca {
    
    private static final int TAM = 20;

    private String nome;
    private Bibliotecario bibliotecario;
    private Livro[] livros;
    private int qtdLivros;


    public Biblioteca(String nome, Bibliotecario bibliotecario){
        this.nome = nome;
        this.bibliotecario = bibliotecario;
        this.livros = new Livro[TAM];
        this.qtdLivros = 0;

    }

    // adicionarLivro(Livro livro)
    boolean adicionarLivro(Livro livro){
        if(qtdLivros >= TAM){
            return false;
        }

        livros[qtdLivros] = livro;
        qtdLivros += 1;

        return true;
    }
 

    // buscarLivro(int codigo)
    int buscarLivro(int codigo){
        int i;

        for(i = 0; i < livros.length; i += 1){
            if(livros[i] != null){
                if(livros[i].getCodigo() == codigo){
                    return i;
                }
            }
        }
        return -1;
    }


    // emprestarLivro(int codigo)
    boolean emprestarLivro(int codigo){
        int indice;
        indice = buscarLivro(codigo);

        if(indice != -1){
            if(livros[indice].isDisponivel()){
                livros[indice].setDisponivel(false);
                return true;

            }

        }
        return false;
    }

    // devolverLivro(int codigo)
    boolean devolverLivro(int codigo){
        int indice;
        indice = buscarLivro(codigo);

        if(indice != -1){
            if(!livros[indice].isDisponivel()){
                livros[indice].setDisponivel(true);
                return true;

            }
        }

        return false;
    }


    // listarLivros()
    void listarLivros(){
        int i;

        
        for(i = 0; i < livros.length; i += 1){
            if(livros[i] != null){
                System.out.println("Titulo: " + livros[i].getTitulo());
                System.out.println("Autor: " + livros[i].getAutor());
                System.out.println("Codigo: " + livros[i].getCodigo());
                System.out.println("Disponivel: " + livros[i].isDisponivel());
                System.out.println("-----------------------------");
            }
        }

    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }


    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }


    public Livro[] getLivros() {
        return livros;
    }


    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }


    public int getQtdLivros() {
        return qtdLivros;
    }


    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    }


    
}
