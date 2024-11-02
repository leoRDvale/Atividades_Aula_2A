import java.util.Scanner;

public class Algo59 {
    public static void main(String[] args) {
        //Entre com os valores dos catetos de um triângulo retângulo e imprima a hipotenusa

        float a, b, h;
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o valor do primeiro cateto: ");
        a = ler.nextFloat();
        System.out.println("Insira o valor do segundo cateto: ");
        b = ler.nextFloat();
        h = (float)Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
        System.out.println("A hiptenusa é: "+ h);





    }
}
