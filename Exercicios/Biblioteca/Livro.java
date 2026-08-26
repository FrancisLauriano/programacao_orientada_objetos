package Exercicios.Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int codigo;
    private boolean disponivel;

    public Livro(String titulo, String autor, int codigo){
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponivel = true;;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    
}
