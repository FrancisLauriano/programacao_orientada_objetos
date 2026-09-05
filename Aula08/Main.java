package Aula08;

public class Main {

    public static void main(String[] arg){
        double valorDeposito, valorSaque;

        Conta contaNormal = new Conta("agencia 1", "12345");
        System.out.printf("Saldo incial -> agencia: %s | conta: %s | saldo R$: %.2f\n", contaNormal.getAgencia(), contaNormal.getNumero(), contaNormal.getSaldo());

        valorDeposito = 1500.00;
        contaNormal.deposito(valorDeposito);
        System.out.printf("Saldo apos deposito -> agencia: %s | conta: %s | saldo R$: %.2f\n", contaNormal.getAgencia(), contaNormal.getNumero(), contaNormal.getSaldo());

        valorSaque = 500.00;
        contaNormal.saque(valorSaque);
        System.out.printf("Saldo apos saque -> agencia: %s | conta: %s | saldo R$: %.2f\n", contaNormal.getAgencia(), contaNormal.getNumero(), contaNormal.getSaldo());

        Investimento contaInvestimento1 = new Investimento("agencia 1", "54321", Risco.BAIXO);
        System.out.printf("Saldo incial conta investimento-> agencia: %s | conta: %s | saldo R$: %.2f\n", contaInvestimento1.getAgencia(), contaInvestimento1.getNumero(), contaInvestimento1.getSaldo());

        boolean depositoInvetimento = contaInvestimento1.deposito(valorSaque);
        System.out.printf("Saldo apos deposito conta investimento-> agencia: %s | conta: %s | saldo R$: %.2f\n", contaInvestimento1.getAgencia(), contaInvestimento1.getNumero(), contaInvestimento1.getSaldo());


        if(depositoInvetimento){
            contaInvestimento1.investir();
            System.out.printf("Saldo conta investimento apos investimento risco %s -> agencia: %s | conta: %s | saldo R$: %.2f\n", contaInvestimento1.getRisco(), contaInvestimento1.getAgencia(), contaInvestimento1.getNumero(), contaInvestimento1.getSaldo());


        }else{
            System.out.println("erro investimeto");
        }



    }
    
}
