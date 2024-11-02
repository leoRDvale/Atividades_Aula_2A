import java.util.Scanner;

public class Algo84 {
    public static void main(String[] args) {
        //Saber se um número é par ou impar

        Scanner ler = new Scanner(System.in);
        int a;
        System.out.println("Digite um número:");
        a = ler.nextInt();
        if(a % 2 == 0){
            System.out.println("O número é par");}
            else{
                System.out.println("O número é impar");
            }
        }
    }

