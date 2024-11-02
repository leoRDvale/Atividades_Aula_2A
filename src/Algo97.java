import java.util.Scanner;

public class Algo97 {
    public static void main(String[] args) {
        //entrar com um número e informar se ee é divisivel por 10, 5, 2 ou se não é divisivel por nenhum
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = ler.nextInt();
        if(numero % 10 == 0){
            System.out.println("O número "+numero+ " é multiplo de 10\n");
        } else if (numero % 2 == 0) {
            System.out.println("O número "+numero+" é múltiplo de 2\n");
        } else if (numero % 5 == 0) {
            System.out.println("O número "+numero+" é múltiplo de 5\n");
        }else{
            System.out.println("O número "+numero+" não é múltiplo de 2 ne de 5");
        }
    }
}
