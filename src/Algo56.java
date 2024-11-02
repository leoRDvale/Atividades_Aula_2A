import java.util.Scanner;

public class Algo56 {
    public static void main(String[] args) {
        //impirmir nome e idade

        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Digite seu nome: ");
        nome = ler.next();
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println("Nome: "+ nome + "\nIdade: "+ idade);
    }
}
