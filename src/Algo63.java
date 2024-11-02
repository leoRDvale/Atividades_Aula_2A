import java.util.Scanner;

public class Algo63 {
    public static void main(String[] args) {
        //Calcular o salário liquido de um professor, usando os dados valor da hora, numero de aulas, desconto inss

        Scanner ler = new Scanner(System.in);
        int nAulas;
        float valorHoraAula, percentualDesconto, totalDesconto, salarioBase, salarioLiquido;
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        nAulas = ler.nextInt();
        System.out.println("Digite o valor da hora-aula: ");
        valorHoraAula = ler.nextFloat();
        System.out.println("Digite o valor referente ao percentual de desconto: ");
        percentualDesconto = ler.nextFloat();
        salarioBase = nAulas*valorHoraAula;
        totalDesconto = (percentualDesconto / 100)* salarioBase;
        salarioLiquido = salarioBase - totalDesconto;
        System.out.println("O valor do salário líquido é: R$" + salarioLiquido);


    }
}
