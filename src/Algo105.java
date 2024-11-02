import java.util.Scanner;

public class Algo105 {
    public static void main(String[] args) {
        //Entre com a sigla de um estado e imprima se ela é carioca, paulista, mineiro ou outros
        Scanner ler = new Scanner(System.in);
        String sigla;
        System.out.println("Digite a sigla referente ao seu estado: ");
        sigla = ler.next();
        if(sigla.equals("rj")){
            System.out.println("Você é Carioca");
        } else if (sigla.equals("sp")) {
            System.out.println("Você é Paulista");
        } else if (sigla.equals("mg")) {
            System.out.println("Você é Mineiro");
        }else{
            System.out.println("Você é de outro estado");
        }
    }
}
