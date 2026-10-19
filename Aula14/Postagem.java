package Aula14;

public class Postagem extends Publicacao implements Compartilhavel{
    private int qtdCompartilhamentos;

    public Postagem(String autor, String conteudo){
        super(autor, conteudo);
        this.qtdCompartilhamentos = 0;

    }

    @Override
    public void exibir(){
        System.out.printf("Autor: %s\n", super.getAutor());
        System.out.printf("Conteudo: %s\n", super.getConteudo());
        System.out.printf("Curtidas: %d\n", super.getCurtidas());
        System.out.printf("Compartilhamentos: %d\n", qtdCompartilhamentos);

    }

    
    @Override
    public void compartilhar(){
        qtdCompartilhamentos += 1;
    }


    public int getQtdCompartilhamentos() {
        return qtdCompartilhamentos;
    }


    public void setQtdCompartilhamentos(int qtdCompartilhamentos) {
        this.qtdCompartilhamentos = qtdCompartilhamentos;
    }

}
