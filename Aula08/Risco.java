package Aula08;

public enum Risco {
    BAIXO(85, 0.025),
    MEDIO(45, 0.30),
    ALTO(2, 1);

    private int chance;
    private double rendimento;

    Risco(int chance, double rendimento){
        this.chance = chance;
        this.rendimento = rendimento;
    }

    public int getChance() {
        return chance;
    }

    public double getRendimento() {
        return rendimento;
    }
    
}
