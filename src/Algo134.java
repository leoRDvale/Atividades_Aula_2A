import java.util.Scanner;

public class Algo134 {
    public static void main(String[] args) {
        //Fazer um algoritmo que receba a idade de um nadador e imprimir a sua categoria segundo a tabela
        //Infantil A - 5 a 7 anos
        //Infantil B - 8 a 10 anos
        //Juvenil A - 11 a 13 anos
        //Juvenil B - 14 a 17 anos
        //Senior - maiores de 18 anos
        Scanner ler = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade do nadador: ");
        idade = ler.nextInt();
        if(idade < 5){
            System.out.println("Não existe categoria para essa idade");
        }else if(idade <= 7){
            System.out.println("Categoria - Infatil A");
        }else if(idade <= 10){
            System.out.println("Categoria - Infantil B");
        }else if(idade <= 13){
            System.out.println("Categoria - Juvenil A");
        }else if(idade <= 17){
            System.out.println("Categoria - Juvenil B");
        }else{
            System.out.println("Categoria - Sênior");
        }
    }
}
