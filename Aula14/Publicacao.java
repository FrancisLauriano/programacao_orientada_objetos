package Aula14;

public abstract class Publicacao {
    private String autor;
    private String conteudo;
    private int curtidas;

    public Publicacao(String autor, String conteudo){
        this.autor = autor;
        this.conteudo = conteudo;
        this.curtidas = 0;

    }

    public void curtir(){
        curtidas += 1;
    }
    

    public abstract void exibir();

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }


    
}
