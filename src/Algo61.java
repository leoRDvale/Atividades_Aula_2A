import java.util.Scanner;

public class Algo61 {
    public static void main(String[] args) {
        //Entrar com a razão de uma PG e o valor do 1º termo, calcular e imprimir o 5º termo da serie
        Scanner ler = new Scanner(System.in);
        int quinto, razao, termo;
        System.out.println("Digite o valor do 1º termo: ");
        termo = ler.nextInt();
        System.out.println("Entre com o alor da Razão: ");
        razao = ler.nextInt();
        quinto = (int)Math.pow((termo * razao),(4));
        System.out.println("O 5º termo dessa P.G é: "+ quinto);

    }
}
