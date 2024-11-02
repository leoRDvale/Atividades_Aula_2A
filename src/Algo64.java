import java.util.Scanner;

public class Algo64 {
    public static void main(String[] args) {
        //ler um temperatura em Celsius e apresenta-la em Fahrenheit
        Scanner ler = new Scanner(System.in);
        float cel, fah;
        System.out.println("Digite o valor da temperatura em Celsius Cº");
        cel = ler.nextFloat();
        fah = ((((9 * cel) + 160))/5);
        System.out.println("O valor da temperatura em graus Fahrenheit é: "+fah+"Fº");
    }
}
