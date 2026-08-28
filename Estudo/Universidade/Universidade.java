package Estudo.Universidade;

public class Universidade {
    
    private static final int TAM = 10;

    private String nome;
    private Coordenador coordenador;
    private Curso[] cursos; 
    private int qtdCursos;

    public Universidade(String nome, Coordenador coordenador){
        this.nome = nome;
        this.cursos = new Curso[TAM];
        this.coordenador = coordenador;
        this.qtdCursos = 0;
    }

    // adicionarCurso(Curso curso)
    public boolean adicionarCurso(Curso curso){
        int indice;

        if(qtdCursos >= TAM){
            return false;
        }

        indice = buscarCurso(curso.getCodigo());

        if(indice != -1){
            return false;
        }

        cursos[qtdCursos] = curso;
        qtdCursos += 1;

        return true;
    }

    // buscarCurso(int codigo)
    public int buscarCurso(int codigo){
        int i;

        for(i = 0; i < cursos.length; i += 1){
            if(cursos[i] != null){
                if(cursos[i].getCodigo() == codigo){
                    return i;
                }

            }
        }

        return -1;
    }


    // atualizarCargaHoraria(int codigo, int novaCargaHoraria)
    public boolean atualizarCargaHoraria(int codigo, int novaCargaHoraria){
        int indice;

        indice = buscarCurso(codigo);
        
        if(indice == -1){
            return false;

        }

        cursos[indice].setCargaHoraria(novaCargaHoraria);

        return true;
    }


    // removerCurso(int codigo)
    public boolean removerCurso(int codigo){
        int indice, i;
        indice = buscarCurso(codigo);

        if(indice == -1){
            return false;
        }

        for(i = indice; i < cursos.length - 1; i += 1){
            cursos[i] = cursos[i + 1];
        }

        cursos[qtdCursos - 1] = null;
        qtdCursos -= 1;

        return true;
    }
    


    // listarCursos()
    public void listarCursos(){
        int i;

        for(i = 0; i < cursos.length; i += 1){
            if(cursos[i] != null){
                System.out.println("Nome: " + cursos[i].getNome());
                System.out.println("Codigo: " + cursos[i].getCodigo());
                System.out.println("carga Horaria: "+ cursos[i].getCargaHoraria());
                System.out.println("-----------------");

            }

        }

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public int getQtdCursos() {
        return qtdCursos;
    }

    public void setQtdCursos(int qtdCursos) {
        this.qtdCursos = qtdCursos;
    }


    
}
