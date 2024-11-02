import javax.swing.*;

public class Algo144 {
    public static void main(String[] args) {
        //fazer um algoritmo que leia o saldo medio de um cliente e calcule
        //o valor do crédito de acordo com a tabela e imprima o saldo e o valor do credito
        /* Saldo medio              Percentutal
        *   de 0 a 500               nenhum credio
        *   de 501 a 1000            30 % do valor do saldo
        *   de 1001 a 3000           40%
        *    acima de 3001           50%                      */

        float saldoMedio, credito;
        String s;
        s = JOptionPane.showInputDialog("Insira o valor do saldo médio: ");
        saldoMedio = Float.parseFloat(s);
        if (saldoMedio < 501){
            credito = 0;
        }else if(saldoMedio < 1001){
            credito = saldoMedio*0.3f;
        }else if(saldoMedio < 3001){
            credito = saldoMedio*0.4f;
        }else{
            credito = saldoMedio*0.5f;
        }
        if(credito != 0){
            JOptionPane.showMessageDialog(null, "Seu saldo é de: R$ "+saldoMedio+", o crédito disponivel para você é de: R$ " +credito);
        }else{
            JOptionPane.showMessageDialog(null, "Seu saldo é de: R$ "+saldoMedio+", por ser inferior a R$501,00, você não possui nenhum crédito disponivel");
        }


    }
}
