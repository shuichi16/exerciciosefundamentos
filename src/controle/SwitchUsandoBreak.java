package controle;

import java.util.Scanner;

public class SwitchUsandoBreak {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.println("Informe a nota: ");

        int nota = 10;

        switch (nota) {
            case 10:
                conceito = "A";
                break;
            case 9:
                conceito = "A";
                break;
            case 7:
                conceito = "B";
                break;
            case 6:
                conceito = "B";
                break;
            case 5:
                conceito = "C";
                break;
            case 4:
                conceito = "C";
                break;
            case 3:
                conceito = "D";
                break;
            case 2:
                conceito = "D";
                break;
            case 1:
                conceito = "1";
                break;
            default:
                conceito = "não encontrado!";
        }

        System.out.println("Conceito é: " + conceito);
        entrada.close();
    }
}
