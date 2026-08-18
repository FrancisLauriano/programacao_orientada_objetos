package Aula02.Retangulo;

public class Retangulo{
    public float base;
    public float altura;

    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    } 


    public float calcularArea(){
        return base * altura;

    }

    public float calcularPerimetro(){
        return 2 * (base + altura);
    }
    
}