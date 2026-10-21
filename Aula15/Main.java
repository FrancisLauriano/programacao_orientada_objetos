public class Main {
    
    public static void main(String[] args){

        Aluno aluno1 = new Aluno("Fulano", "123456");

        try{
            aluno1.media(-1, 5);
            System.out.printf("Media: %.2f\n", aluno1.getMedia());
        }catch(NotaInvalidaException nie){
            System.out.println(nie.getMessage());
        }finally{
            System.out.println("Operacao finalizada");
        }
        
    }
    
}
