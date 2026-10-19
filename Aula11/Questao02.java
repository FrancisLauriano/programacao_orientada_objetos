package Aula11;
import java.util.ArrayList;

public class Questao02 {
    private static final int TAM = 5;
    public void main(String[] args){
        
        ArrayList<Double> notas = new ArrayList<Double>(TAM);
        double media, soma = 0.00;
        int qtd = 0, notasAcimaMedia = 0;
        notas.add(5.8);
        notas.add(8.0);
        notas.add(10.0);

        for(double nota : notas){
            soma += nota;
            qtd += 1;

        }

        if(soma > 0){
            media = soma / qtd;

        }else{
            media = 0.00;
        }

        for(double nota: notas){
            if(nota > media){
                notasAcimaMedia += 1;
            }

        }

        System.out.printf("A Media da turma foi: %f\n", media);
        System.out.printf("Quantidade de alunos com nota acima da media: %d\n", notasAcimaMedia);
    }
    
}
