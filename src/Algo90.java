import java.util.Scanner;

public class Algo90 {
    public static void main(String[] args) {
        //Imprima um número se, e somente se ele for maior que 20
        Scanner ler = new Scanner(System.in);
        float numero;
        System.out.println("Digite um número: ");
        numero = ler.nextFloat();
        if(numero > 20){
            System.out.println("O número digitando foi: "+numero+", sendo assim maior que 20.");
        }
    }
}
