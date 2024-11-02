import java.util.Scanner;

public class Algo121 {
    public static void main(String[] args) {
        //Digite 5 numero inteiros diferentes e identifique o maior e menor valor
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3, n4, n5, maior, menor;
        System.out.println("****Digite 5 números inteiros e diferentes para identificar o maior e menor****");
        System.out.println("Digite o primeiro número");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo número");
        n2 = ler.nextInt();
        System.out.println("Digite o terceiro número");
        n3 = ler.nextInt();
        System.out.println("Digite o quarto número");
        n4 = ler.nextInt();
        System.out.println("Digite o quinto número");
        n5 = ler.nextInt();

        //Codigo abaixo feito para testar se os numeros sao diferentes, pois o programa exige isso ao usuario
        if(n1!=n2 && n1!=n3 && n1!=n4 && n1!=n5 && n2!=n3 && n2!=n4 && n2!=n5 && n3!=n5 && n4!=n5){
            if(n1 > n2){
                maior = n1;
                menor = n2;
            }else{
                maior = n2;
                menor = n1;
            }if(n3 > maior){
                maior = n3;
            }else if(n3 < menor){
                menor = n3;
            }if (n4 > maior){
                maior = n4;
            }else if(n4 < menor){
                menor = n4;
            }if(n5 > maior){
                maior = n5;
            } else if (n5 < menor) {
                menor = n5;
            }
            System.out.println("O maior valor é: "+maior+", e o menor valor é: "+ menor);
        }else{
            System.out.println("Os números devem ser diferentes. Tente novamente.");
        }

    }
}
