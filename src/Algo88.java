import java.util.Scanner;

public class Algo88 {
    public static void main(String[] args) {
        //Construir uma calculadora
        Scanner ler = new Scanner(System.in);
        String comando;
        float a, b;
        System.out.println("\t\t\t\t**********************");
        System.out.println("\t\t\t\t*****Calculadora******");
        System.out.println("\t\t\t\t**********************");
        System.out.println("\t\t\t\t***** + para somar ***");
        System.out.println("\t\t\t\t** - para Subtrair ***");
        System.out.println("\t\t\t\t* * para Multiplicar *");
        System.out.println("\t\t\t\t*** / para Dividir ***");
        System.out.println("\nQual a operação desejada?\n");
        comando = (String)ler.next();
        if(comando.equals("+")) {
            System.out.println("Digite o primeiro valor:");
            a = ler.nextFloat();
            System.out.println("Digite o segundo valor:");
            b = ler.nextFloat();
            System.out.println("Soma = " + (a + b));
        }else if(comando.equals("-")){
                System.out.println("Digite o primeiro valor:");
                a = ler.nextFloat();
                System.out.println("Digite o segundo valor:");
                b = ler.nextFloat();
                System.out.println("Subtração = "+ (a-b));
        }else if(comando.equals("*")){
            System.out.println("Digite o primeiro valor:");
            a = ler.nextFloat();
            System.out.println("Digite o segundo valor:");
            b = ler.nextFloat();
            System.out.println("Multiplicação = "+ (a*b));
        }else if(comando.equals("/")) {
            System.out.println("Digite o primeiro valor:");
            a = ler.nextFloat();
            System.out.println("Digite o segundo valor:");
            b = ler.nextFloat();
            System.out.println("Divisão = " + (a / b));
        }

    }
}
