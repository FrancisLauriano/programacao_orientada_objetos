package Aula04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);


        // cad sala
        String nomeSala;
        
        System.out.printf("Nome da sala: ");
        nomeSala = entrada.nextLine();
        
        Sala sala = new Sala(nomeSala);

        // cad alunos
        int i = 0, continuar = 1;
        String nomeAluno;
        int idadeAluno, matAluno;

        do{
            System.out.printf("Aluno %d\n", i + 1);

            System.out.printf("Nome: ");
            nomeAluno = entrada.nextLine();

            System.out.printf("Idade: ");
            idadeAluno = entrada.nextInt();

            System.out.printf("Matricula: ");
            matAluno = entrada.nextInt();

            // entrada.nextLine();

            Aluno aluno = new Aluno(nomeAluno, idadeAluno, matAluno);

            sala.getTurma()[i] = aluno;

            i += 1;

           
            do{
                System.out.printf("Deseja continuar?\n[1] SIM     [0] NAO\nOpcao: ");
                continuar = entrada.nextInt();

                if(continuar != 0 && continuar != 1){
                    System.out.println("Opcao invalida!");
                }


            }while(continuar != 0 && continuar != 1);

            if(i < sala.getTurma().length){
                System.out.println("A turma esta cheia");
                break;
            }
                
            entrada.nextLine();

        }while(continuar == 1 && i < sala.getTurma().length);

        // cad professor
        String nomeProf;
        int idadeProf, matProf;

        System.out.println("Cadastro Professor");

        System.out.print("Nome: ");
        nomeProf = entrada.nextLine();

        System.out.print("Idade: ");
        idadeProf = entrada.nextInt();

        System.out.print("Matricula: ");
        matProf = entrada.nextInt();

        entrada.nextLine();

        Professor professor = new Professor(nomeProf, idadeProf, matProf, sala);

        

        entrada.close();
    }
    
}

//  public Professor(String nome, int idade, int matricula, Sala sala){
//         this.nome = nome;
//         this.idade = idade;
//         this.matricula = matricula;
//         this.sala = sala;
//     }

// public Aluno(String nome, int idade, int matricula){
//         this.nome = nome;
//         this.idade = idade;
//         this.matricula = matricula;
//     }


//  public Sala(String nome){
//         this.nome = nome;
//         this.ocupada = false;
//         this.turma = new Aluno[TAM];
//         this.diaDeAula = 0;
//     }