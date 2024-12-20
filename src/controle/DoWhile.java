package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

// DO While é a unica sequancia de controle que termina com ;

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println(" Voce precisa falar as palavras magicas...");
            System.out.println("Quer sair? ");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Feito, Obrigado !!!");
        entrada.close();

    }
}
