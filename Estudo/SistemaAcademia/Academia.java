package Estudo.SistemaAcademia;

public class Academia {
    private static final int TAM = 10;

    private String nome;
    private boolean aberta;
    private Pessoa[] pessoas;
    private int qtdPessoas;

    public Academia(String nome){
        this.nome = nome;
        this.aberta = false;
        this.pessoas = new Pessoa[TAM];
        this.qtdPessoas = 0;
    }

    // alternar
    public void alternar(){
        aberta = !aberta;
    }

    // buscarPessoa
    public int buscarPessoa(String matricula){
        int i;

        if(matricula != null){
            for(i = 0; i < pessoas.length; i += 1){
                if(pessoas[i] != null && pessoas[i].getMatricula().equals(matricula)){
                    return i;
                }
            }
        }
        return -1;
    }

    // adicionarPessoa
    public boolean adicionarPessoa(Pessoa pessoa){
        int indiceMat;

        if(pessoa != null && qtdPessoas < TAM){
            indiceMat = buscarPessoa(pessoa.getMatricula());

            if(indiceMat == -1){
                pessoas[qtdPessoas] = pessoa;
                qtdPessoas += 1;
                return true;
            }
        }
        return false;
    }

    // atualizarPessoa
    public boolean atualizarPessoa(String matricula, Pessoa pessoa){
        int indiceMat, indiceMatNovo;

        if(matricula != null && pessoa != null){
            indiceMat = buscarPessoa(matricula);

            if(indiceMat != -1){
                indiceMatNovo = buscarPessoa(pessoa.getMatricula());

                if(indiceMatNovo == -1 || indiceMatNovo == indiceMat){
                    pessoas[indiceMat] = pessoa;
                    return true;
                }
                
            }
        }
        return false;
    }

    // removerPessoa
    public boolean removerPessoa(String matricula){
        int indiceMat, i;

        if(matricula != null){
            indiceMat = buscarPessoa(matricula);

            if(indiceMat != -1){
                for(i = indiceMat; i < qtdPessoas - 1; i += 1){
                    pessoas[i] = pessoas[i + 1];
                }

                qtdPessoas -= 1;
                pessoas[qtdPessoas] = null;
                return true;
            }
        }
        return false;
    }

    // listarPessoas
    public void listarPessoas(){
        int i;

        System.out.printf("=".repeat(40));
        System.out.println();
        System.out.printf("%-10s |%-10s |%-10s |%-10s\n","Nome", "Idade", "Matricula", "Ativo"
);
        System.out.printf("-".repeat(40));
        System.out.println();

        for(i = 0; i < pessoas.length; i += 1){
            if(pessoas[i] != null){
                System.out.printf("%-10s |%-10d |%-10s |%-10s\n", pessoas[i].getNome(), pessoas[i].getIdade(), pessoas[i].getMatricula(), pessoas[i].isAtivo());
            }
        }
        System.out.printf("=".repeat(40));
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    

    
}
