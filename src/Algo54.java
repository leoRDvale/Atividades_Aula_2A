import java.util.Scanner;

public class Algo54 {
    public static void main(String[] args) {
        //Crie um algoritmo que calcule a área de um triângulo
        //Usando a classe ***Scanner**** para entrada de dados

        float a, b;
        System.out.println("\nInsira o valor da base: ");
        Scanner ler = new Scanner(System.in);
        b = ler.nextFloat();
        System.out.println("\nInsira o valor da altura: ");
        a = ler.nextFloat();
        System.out.println("\nA área do triângulo é: "+ ((a*b)/2));







    }
}
