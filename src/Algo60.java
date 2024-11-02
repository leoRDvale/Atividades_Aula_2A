import java.util.Scanner;

public class Algo60 {
    public static void main(String[] args) {
        // Entre com a razao de uma PA e o valor do 1º termo, calcule e imprima o 10º termo

        Scanner ler = new Scanner(System.in);
        int dec, razao, termo;
        System.out.println("Entre com o primeiro termo: ");
        termo = ler.nextInt();
        System.out.println("Entre com a razão: ");
        razao = ler.nextInt();
        dec = (termo + (9* razao));
        System.out.println("O 10º termo desta P.A. é: "+ dec);
    }
}
