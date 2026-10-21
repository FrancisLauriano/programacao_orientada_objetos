public class NotaInvalidaException extends Exception{

    public NotaInvalidaException(){
        super("Valor invalido. Operacao abortada");
    }


    public NotaInvalidaException(double n1, double n2){
        String msgErro = "Nota invalida: ";

        if(n1 < 0.00 || n1 > 10.00){
            msgErro += n1 + " ";
        }

        if(n2 < 0.00 || n2 > 10.00){
            msgErro += n2 + " ";
        }

        System.err.println(msgErro);
    }
}
