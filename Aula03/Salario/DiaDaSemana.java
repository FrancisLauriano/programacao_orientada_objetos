package Aula03.Salario;


public enum DiaDaSemana{
    DOMINGO(2.0),
    SEGUNDA(1.0),
    TERCA(1.0),
    QUARTA(1.0),
    QUINTA(1.0),
    SEXTA(1.0),
    SABADO(1.5);

    private double fatorMultiplicacao;

    DiaDaSemana(double fatorMultiplicacao){
        this.fatorMultiplicacao = fatorMultiplicacao;
    }

    public double getFatorMultiplicacao(){
        return this.fatorMultiplicacao;
    }
}