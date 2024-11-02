import java.sql.SQLOutput;
import java.util.Scanner;

public class Algo85 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float a, b, c, max;
        System.out.println("Digite o 1º número: ");
        a = ler.nextFloat();
        System.out.println("Digite 2º número: ");
        b = ler.nextFloat();
        System.out.println("Digite 3º número: ");
        c = ler.nextFloat();

        if(a>b && a>c){
            max = a;
        }else if(b>a && b>c){
            max = b;
        }else{
            max = c;
        }
        System.out.println("O maior valor é: "+max);

    }
}
