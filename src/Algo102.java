import java.util.Scanner;

public class Algo102 {
    public static void main(String[] args) {
        //Digite um valor pra saber se é maior, igual ou menor que 20
        Scanner ler = new Scanner(System.in);
        float numero;
        System.out.println("Digite um número: ");
        numero = ler.nextFloat();
        if(numero > 20){
            System.out.println("O número digitado é maior que 20");
        } else if (numero < 20) {
            System.out.println("O número digitado é menor que 20");
        }else{
            System.out.println("O número digitado é igual a 20");
        }
    }
}
