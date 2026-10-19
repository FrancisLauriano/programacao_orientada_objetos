package Aula13;
// import java.util.ArrayList;

public class Banco implements Imprimivel{
    // private ArrayList<ContaBancaria> contas;
    private ContaBancaria[] contas;
    private static final int TAM = 10;


    public Banco(){
        // this.contas = new ArrayList<ContaBancaria>();
        this.contas = new ContaBancaria[TAM];
        
    }


    // procurarConta - recebe número da conta e returna objeto conta
    public ContaBancaria procurarConta(String numConta){
        if(numConta != null){
            int i;
        
            for(i = 0; i < contas.length; i += 1){
                if(contas[i] != null){
                    if(contas[i].getNumConta().equals(numConta)){
                        return contas[i];
                    }
                }
            }

        }


    return null;
    }

    // inserir - recebem um objeto conta
    public boolean inserir(ContaBancaria conta){
        if(conta != null && contas[contas.length - 1] == null){
            ContaBancaria existeConta = procurarConta(conta.getNumConta());
            
            if(existeConta == null){
                int i;

                for(i = 0 ; i < contas.length; i += 1){
                    if(contas[i] == null){
                        contas[i] = conta;
                        return true;
                    }
                }
            
            }

        }
        
        return false;
    }
    
    // remover - recebem um objeto conta
    public boolean remover(ContaBancaria conta){
       if(conta != null){
        int i, j;

            for(i = 0; i < contas.length; i += 1){
                if(contas[i] != null){
                    if(contas[i].getNumConta().equals(conta.getNumConta())){

                        for(j = i; j < contas.length - 1; j += 1){
                            contas[j] = contas[j + 1];
                        }

                        contas[contas.length - 1] = null;
                        return true;
                    }

                }
            }

       }

        return false;
    }
    


    @Override
    public void mostrarDados(){
        int i;

        for(i = 0; i < contas.length; i += 1){
            if(contas[i] != null){
                if(contas[i] instanceof Imprimivel){
                    Imprimivel imprimivel = (Imprimivel) contas[i];
                    imprimivel.mostrarDados();
                }

            }

        }
        

    }

    public ContaBancaria[] getContas() {
        return contas;
    }

    public void setContas(ContaBancaria[] contas) {
        this.contas = contas;
    }

    public static int getTam() {
        return TAM;
    }

    



    // public ArrayList<ContaBancaria> getContas() {
    //     return contas;
    // }


    // public void setContas(ArrayList<ContaBancaria> contas) {
    //     this.contas = contas;
    // }
    
}
