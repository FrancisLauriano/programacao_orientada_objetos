package Revisao1GQ.Exe05;

public enum Risco {
    BAIXA(0.85, 0.025),
    MEDIA(0.45, 0.30),
    ALTA(0.30, 1);

    
    private double chance;
    private double rendimento;

    Risco(double chance, double rendimento){
        this.chance = chance;
        this.rendimento = rendimento;
    }

    public double getChance() {
        return chance;
    }

    public double getRendimento() {
        return rendimento;
    }
    
    
}
