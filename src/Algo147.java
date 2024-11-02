import javax.swing.*;

public class Algo147 {
    public static void main(String[] args) {
//        Crie um algoritmo que informe a quantidade de calorias de uma refeição
//        apartir da escolha de um usuário que deverá informar o parto, a sobremesa e a bebida, segue a tabela

       /*  **Prato**                        **Sobremesa**                       **Bebida**
            Vegetariano 180cal                  Abacaxi 75cal                   Chá 20cal
            Peixe 230cal                        Sorvete diet 110cal             Suco de Laranja 70cal
            Frango 250cal                       Mousse diet 170cal              Suco de melão 100cal
            Carne 350cal                        Mousse Chocolate 200cal         Refrigerante Diet 65cal
        */

        int opcaoPrato, opcaoSobremesa, opcaoBebida, calorias;
        calorias = 0;
        String s;
        s = JOptionPane.showInputDialog("***PRATO PRINCIPAL***\nDigite o número referente a sua escolha:\n1 - Vegetariano\n2 - Peixe\n3 - Frango\n4 - Carne");
        opcaoPrato = Integer.parseInt(s);
        switch(opcaoPrato){
            case 1:
                calorias = calorias + 180;
                break;
            case 2:
                calorias = calorias + 230;
                break;
            case 3:
                calorias = calorias + 250;
                break;
            case 4:
                calorias = calorias + 350;
                break;
                default:
            JOptionPane.showMessageDialog(null, "Opção Inválida");

        }
        s = JOptionPane.showInputDialog("***SOBREMESA***\nDigite o número referente a sua escolha:\n1 - Abacaxi\n2 - Sorvete Diet\n3 - Mousse Diet\n4 - Mousse Chocolate");
        opcaoSobremesa = Integer.parseInt(s);
        switch(opcaoSobremesa){
            case 1:
                calorias = calorias + 75;
                break;
            case 2:
                calorias = calorias + 110;
                break;
            case 3:
                calorias = calorias + 170;
                break;
            case 4:
                calorias = calorias + 200;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");

        }
        s = JOptionPane.showInputDialog("***BEBIDA***\nDigite o número referente a sua escolha:\n1 - Chá\n2 - Suco de Laranja\n3 - Suco de Melão\n4 - Refrigerante Diet");
        opcaoBebida = Integer.parseInt(s);
        switch(opcaoBebida){
            case 1:
                calorias = calorias + 20;
                break;
            case 2:
                calorias = calorias + 70;
                break;
            case 3:
                calorias = calorias + 100;
                break;
            case 4:
                calorias = calorias + 65;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");

        }
        JOptionPane.showMessageDialog(null, "Total de Calorias: "+calorias);




    }
}
