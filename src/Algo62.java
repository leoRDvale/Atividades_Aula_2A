import java.util.Scanner;

public class Algo62 {
    public static void main(String[] args) {
        //faça um algoritmo que conceda um desconto de 9% em um valor de um produto

        Scanner ler = new Scanner(System.in);
        float preco, npreco;
        System.out.println("Por favor, insira o valor do produto: ");
        preco = ler.nextFloat();
        npreco = (float)(preco* 0.91); //O preço novo será 91% do preço antigo, ou seja 9% menor do valor antigo
        System.out.println("O preço com o desconto aplicado é: R$"+ npreco);

    }
}
