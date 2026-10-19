package Aula14;

public class Story extends Publicacao implements Compartilhavel{
    private int visualizacoes;

    public Story(String autor, String conteudo){
        super(autor, conteudo);
        this.visualizacoes = 0;

    }


    @Override
    public void exibir(){
        System.out.printf("Autor: %s\n", super.getAutor());
        System.out.printf("Conteudo: %s\n", super.getConteudo());
        System.out.printf("Curtidas: %d\n", super.getCurtidas());
        System.out.printf("Visualizacoes: %d\n", visualizacoes);

    }

    @Override
    public void compartilhar(){
        System.out.printf("Story compartilhado\n");
    }


    public void visualizar(){
        visualizacoes += 1;

    }


    public int getVisualizacoes() {
        return visualizacoes;
    }


    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    
    
}
