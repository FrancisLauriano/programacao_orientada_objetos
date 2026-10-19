package Aula12;

public class LeitorPremium extends Leitor{
    private int pontos;
    private int totalEmprestimos;

    public LeitorPremium(String nome, int matricula, int idade, boolean bloqueado, int pontos, int totalEmprestimos){
        super(nome, matricula, idade, bloqueado);
        this.pontos = pontos;
        this.totalEmprestimos = totalEmprestimos;

    }

    @Override
    public boolean emprestar(Livro livro){
        if(livro != null){
            if(super.emprestar(livro)){
                totalEmprestimos += 1;
                if(totalEmprestimos > 0 && totalEmprestimos % 5 == 0){
                    pontos += 10;
                    return true;
                }

            }
        }

        return false;
    }

    public boolean emprestar(Livro livro, int pontosNecessarios){
        if(pontos >= pontosNecessarios){
            super.emprestar(livro);
            pontos -= pontosNecessarios;
            return true;
        }
        return false;
    }


	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getTotalEmprestimos() {
		return totalEmprestimos;
	}

	public void setTotalEmprestimos(int totalEmprestimos) {
		this.totalEmprestimos = totalEmprestimos;
	}


    
}
