import java.util.Scanner;

public class Algo126 {
    public static void main(String[] args) {
        //Ler um número e dizer se é igual a 5, 200 ou 400, e se está no intervalo entre 500 e 1000, ou fora do escopo
        Scanner ler = new Scanner(System.in);
        float x;
        System.out.println("Digite o valor de X: ");
        x = ler.nextFloat();
        if (x == 5){
            System.out.println("o número é 5");
        }else if(x == 200){
            System.out.println("No número é 200");
        }else if(x == 400){
            System.out.println("O número é 400");
        }else if(x >= 500 && x<=1000){
            System.out.println("O valor está entre o intervalo de 500 a 1000");
        }else{
            System.out.println("O valor fora do escopo");
        }

    }
}
