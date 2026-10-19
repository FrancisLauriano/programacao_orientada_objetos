package Revisao1GQ.Exe05;

public enum Cargo {
    ANALISTA(0.40, 0.50),
    GERENTE(0.40, 0.50);
    
    private double chance;
    private double rendimento;

    Cargo(double chance, double rendimento){
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
