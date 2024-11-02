import java.util.Scanner;

public class Algo55 {
    public static void main(String[] args) {
        //Crie um algoritmo que calcule e imprima area de um losango

        Scanner ler = new Scanner(System.in);

        float diagmaior, diagmenor, area;
        System.out.println("Digite a medida da diagonal maior: ");
        diagmaior = ler.nextFloat();
        System.out.println("\nDigite a medida da diagonal menor: ");
        diagmenor = ler.nextFloat();
        area = (diagmaior * diagmenor) /2;
        System.out.println("\nA área do losango é: "+ area);


    }
}
