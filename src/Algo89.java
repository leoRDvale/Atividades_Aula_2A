import java.util.Scanner;

public class Algo89 {
    public static void main(String[] args) {
        //Calcular o peso de uma pessoa se ela estivesse em outro planeta

        Scanner ler = new Scanner(System.in);
        int opcaoPlaneta;
        float pesoTerra;
        System.out.println("Escolha um planeta para saber qual seria o seu peso: ");
        System.out.println("1- Mercurio\n2- Venus\n3- Marte\n4- Jupiter\n5- Saturno\n6- Urano");
        opcaoPlaneta = ler.nextInt();
        System.out.println("Digite o seu peso na terra (kg): ");
        pesoTerra = ler.nextFloat();

        switch (opcaoPlaneta) {
            case 1:
                System.out.println("Seu peso no planeta Mercurio é: "+ ((pesoTerra/10)*0.37)+"kg");
                break;
            case 2:
                System.out.println("Seu peso no planeta Venus é: "+ ((pesoTerra/10)*0.88)+"kg");
                break;
            case 3:
                System.out.println("Seu peso no planeta Jupiter é: "+ ((pesoTerra/10)*0.38)+ "kg");
                break;
            case 4:
                System.out.println("Seu peso no planeta Jupiter é: "+ ((pesoTerra/10)*2.64)+ "kg");
                break;
            case 5:
                System.out.println("Seu peso no planeta Saturno é: "+ ((pesoTerra/10)*1.15)+ "kg");
                break;
            case 6:
                System.out.println("Seu peso no planeta Urano é: "+ ((pesoTerra/10)*1.17)+ "kg");
                break;
            default:
                System.out.println("Opção Inválida. Tente novamente.");
        }
    }
}
