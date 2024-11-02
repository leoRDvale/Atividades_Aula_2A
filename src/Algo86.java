import java.util.Scanner;

public class Algo86 {
    public static void main(String[] args) {
        //Ler um número e imprimir se é positiv, negativo ou nulo

        Scanner ler = new Scanner(System.in);
        float num;
        System.out.println("Digite um número: ");
        num = ler.nextFloat();
        if (num > 0) {
            System.out.println("O número " + num + " é positivo");
        } else if (num < 0) {
            System.out.println("O número " + num + " é negativo");
        } else{
            System.out.println("O número "+num+" é nulo");
        }
    }
}
