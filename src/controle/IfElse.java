package controle;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o numero:");

        // o Interger.parseInt() converte um valor int para uma string
        int numero = Integer.parseInt(valor);

        // Esta sendo usado as {} tanto no If quanto no Else para definir e deixar limpo os blocos
        if (numero % 2 == 0) {
            System.out.println("Numero par!");
        } else {
            System.out.println("Numero impar!");
        }
    }
}
