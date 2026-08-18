package Aula02.Banco;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        boolean ehValido;
        String nome;
        double saldo, valor;
        int opcao;
        Banco banco = null;

        Scanner entrada = new Scanner(System.in);

        do{

            System.out.println("\n\n==================== MENU ====================");
            System.out.println("1. Criar conta.");
            System.out.println("2. Mostre o saldo.");
            System.out.println("3. Faça um saque.");
            System.out.println("4. Faça um deposito");
            System.out.println("0. Encerrar o programa.");
            System.out.println("==============================================");

            System.out.print("Opcao: ");
            opcao = entrada.nextInt();


            if(opcao == 1){
                entrada.nextLine();

                System.out.print("Nome: ");
                nome = entrada.nextLine();

                System.out.print("Saldo R$: ");
                saldo = entrada.nextDouble();

                banco = new Banco(nome, saldo);

            }else if(opcao == 2){
                if(banco == null){
                    System.out.println("\n\n==============================================");
                    System.out.println("Cadastre uma conta primeiro.");
                    System.out.println("==============================================");
                }else{
                    System.out.println("\n\n==============================================");
                    System.out.printf("Saldo atual R$ %.2f\n", banco.saldo);
                    System.out.println("==============================================");
                }

            }else if(opcao == 3){
                if(banco == null){
                    System.out.println("\n\n==============================================");
                    System.out.println("Cadastre uma conta primeiro.");
                    System.out.println("==============================================");
                }else{
                    System.out.printf("\n\nValor Saque R$: ");
                    valor = entrada.nextDouble();

                    ehValido = banco.sacar(valor);

                    if(!ehValido){
                        System.out.println("\n\n==============================================");
                        System.out.println("Saldo insuficiente.");
                        System.out.println("==============================================");
                    }else{
                        System.out.println("\n\n==============================================");
                        System.out.printf("Saque realizado com sucesso.\nSeu saldo atualizado é R$: %.2f\n", banco.saldo);
                        System.out.println("==============================================");
                    }
                }
                
            }else if(opcao == 4){
                if(banco == null){
                    System.out.println("\n\n==============================================");
                    System.out.println("Cadastre uma conta primeiro.");
                    System.out.println("==============================================");
                }else{
                    System.out.printf("\n\nValor Deposito R$: ");
                    valor = entrada.nextDouble();

                    ehValido = banco.depositar(valor);

                    if(!ehValido){
                        System.out.println("\n\n==============================================");
                        System.out.println("Valor invalido.");
                        System.out.println("==============================================");
                    }else{
                        System.out.println("\n\n==============================================");
                        System.out.printf("Deposito realizado com sucesso.\nSeu saldo atualizado é R$: %.2f\n", banco.saldo);
                        System.out.println("==============================================");
                    }                    
                }            
            }else if(opcao == 0){
                System.out.println("");
                System.out.println("Encerrando o programa...");
                break;
            }else{
                System.out.println("\n==============================================");
                System.out.println("Opção invalida.\nTente novamente.");
                System.out.println("==============================================");
            }

        }while(opcao != 0);

        entrada.close();
    }

    
}