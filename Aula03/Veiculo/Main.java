package Aula03.Veiculo;
import java.util.Scanner;


public class Main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int qtdVeiculos, horas, qtdPermaCurta = 0, qtdPermaMedia = 0, qtdPermaLonga = 0, qtdValorElevado = 0, qtdValorNormal = 0,  i;
        double valorPago, totalValorPago = 0.00, mediaValorPago, valorHora;
        String placa, modelo;

        Permanencia permanencia;
        TipoValor tipoValor;

        do{
            System.out.print("\nQtd veiculos: ");
            qtdVeiculos = entrada.nextInt();

            if(qtdVeiculos <= 0){
                System.out.println("\n===============================================================");
                System.out.println("Valor invalido.\nQuantidade veiculo deverá ser maior que zero");
                System.out.println("===============================================================");
            }

        }while(qtdVeiculos <= 0);
        

        for(i = 0; i < qtdVeiculos; i += 1){

            System.out.println("\n========================================");
            System.out.printf("VEICULO %d\n", i + 1);

            entrada.nextLine();

            System.out.printf("Placa: ");
            placa = entrada.nextLine();

            System.out.printf("Modelo: ");
            modelo = entrada.nextLine();

            do{
                System.out.printf("Horas permanencia: ");
                horas = entrada.nextInt();

                if(horas <= 0){
                    System.out.println("\n===============================================================");
                    System.out.println("Valor invalido.\nQuantidade horas deverá ser maior que zero");
                    System.out.println("===============================================================");

                }
            }while(horas <= 0);


            do{
                System.out.printf("Valor por hora: ");
                valorHora = entrada.nextDouble();

                if(valorHora < 0.00){
                    System.out.println("\n===============================================================");
                    System.out.println("Valor invalido.\nO valor não pode ser negativo");
                    System.out.println("===============================================================");
                }
            }while(valorHora < 0.00);

            
            System.out.println("\n...............................................\n");

            Veiculo veiculo = new Veiculo(placa, modelo, horas, valorHora);
            valorPago = veiculo.calcularValor();
            permanencia = veiculo.verificarTipoPermanencia();
            tipoValor = veiculo.verificarTipoValor();
    
            totalValorPago += valorPago;
            System.out.println("Permanencia: " + permanencia);
            System.out.printf("Valor pago R$: %.2f\n", valorPago);
            System.out.println("Tipo Valor: " + tipoValor);
            

            if(permanencia == Permanencia.CURTA){
                qtdPermaCurta += 1;
            }else if(permanencia == Permanencia.MEDIA){
                qtdPermaMedia += 1;
            }else{
                qtdPermaLonga += 1;
            }

            if(tipoValor == TipoValor.ELEVADO){
                qtdValorElevado += 1;
            }else{
                qtdValorNormal += 1;
            }

        }

        mediaValorPago = totalValorPago / qtdVeiculos;

        System.out.println("\n========================================");
        System.out.println("ESTATISTICAS");
        System.out.printf("Veiculos Cadastrados: %d\n", qtdVeiculos);
        System.out.printf("Quantidade Perma longa: %d\n", qtdPermaLonga);
        System.out.printf("Quantidade Perma media: %d\n", qtdPermaMedia);
        System.out.printf("Quantidade Perma curta: %d\n", qtdPermaCurta);
        System.out.printf("Quantidade valor elevado: %d\n", qtdValorElevado);
        System.out.printf("Quantidade valor normal: %d\n", qtdValorNormal);
        System.out.printf("Valor total arrecadado: R$%.2f\n", totalValorPago);
        System.out.printf("Media paga por veiculo: R$%.2f\n", mediaValorPago);

        System.out.println("\n========================================");

        entrada.close();

    }

}