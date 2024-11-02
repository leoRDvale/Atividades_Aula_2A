import java.util.Scanner;

public class Algo57 {
    public static void main(String[] args) {
        //impirmir o valor das notas e media final truncada e arredondada

        Scanner ler = new Scanner(System.in);
        float pr1, pr2, mf;
        System.out.println("Digite a nota da primeira avaliação: ");
        pr1 = ler.nextFloat();
        System.out.println("Digite a nota da segunda avaliação: ");
        pr2 = ler.nextFloat();
        mf = (pr1 + pr2)/2;
        System.out.println("\nMedia truncada: " + (int)((mf - 0.5)+0.001));
        System.out.println("\nMedia arredondada: " + (int)((mf + 0.001)));






    }
}
