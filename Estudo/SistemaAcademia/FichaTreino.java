package Estudo.SistemaAcademia;

public class FichaTreino {
    private static final int TAM_MOD = 5;
    private static final int TAM_FREQ = 10;

    private int codigo;
    private String[] modalidades;
    private boolean[] frequencias;
    private int qtdModalidades;

    public FichaTreino(int codigo){
        this.codigo = codigo;
        this.modalidades = new String[TAM_MOD];
        this.frequencias = new boolean[TAM_FREQ];
        this.qtdModalidades = 0;
    }

    // buscarModalidade
    public int buscarModalidade(String modalidade){
        int i;

        if(modalidade != null){
            for(i = 0; i < modalidades.length; i += 1){
                if(modalidades[i] != null && modalidades[i].equals(modalidade)){
                    return i;
                }
            }
        }
        return -1;
    }

    // adicionarModalidade
    public boolean adicionarModalidade(String modalidade){
        if(modalidade != null && qtdModalidades < TAM_MOD){
            if(buscarModalidade(modalidade) == -1){
                modalidades[qtdModalidades] = modalidade;
                qtdModalidades += 1;
                return true;
            }
        }
        return false;
    }

    // atualizarModalidade
    public boolean atualizarModalidade(String modalidade, String novaModalidade){
        int indiceMod;

        if(modalidade != null && novaModalidade != null){
            indiceMod = buscarModalidade(modalidade);

            if(indiceMod != -1 && buscarModalidade(novaModalidade) == -1){
                modalidades[indiceMod] = novaModalidade;
                return true;
            }
        }

        return false;
    }

    // removerModalidade
    public boolean removerModalidade(String modalidade){
        int indiceMod, i;

        if(modalidade != null){
            indiceMod = buscarModalidade(modalidade);

            if(indiceMod != -1){
                for(i = indiceMod; i < qtdModalidades - 1; i += 1){
                    modalidades[i] = modalidades[i + 1];
                }
                qtdModalidades -= 1;
                modalidades[qtdModalidades] = null;
                return true;
            }
        }
        return false;
    }


    // registrarFrequencia - deverá receber um dia entre 0 e 9 e um valor da frequencia.
    public boolean registrarFrequencia(int dia, boolean frequencia){
        
        if(dia >= 0 && dia < frequencias.length){
            frequencias[dia] = frequencia;
            return true;
        }
        return false;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String[] getModalidades() {
        return modalidades;
    }

    public void setModalidades(String[] modalidades) {
        this.modalidades = modalidades;
    }

    public boolean[] getFrequencias() {
        return frequencias;
    }

    public void setFrequencias(boolean[] frequencias) {
        this.frequencias = frequencias;
    }

    public int getQtdModalidades() {
        return qtdModalidades;
    }

    public void setQtdModalidades(int qtdModalidades) {
        this.qtdModalidades = qtdModalidades;
    }


    
    
}
