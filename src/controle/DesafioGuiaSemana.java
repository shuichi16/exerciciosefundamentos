package controle;

import java.util.Scanner;

public class DesafioGuiaSemana {

    public static void main(String[] args) {

        //Domingo -> 1
        //Quarta -> 4
        //Terça -> 3

// Lembrando que para fazer comparação entre Strings, deve-se usar EQUALS e neste caso foi usado o equalsIgnoreCase para ignorar se vai ser entrada com letra M ou m

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um dia da semana: ");
        String dia = entrada.nextLine();

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println("1");
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println("2");
        } else if (dia.equalsIgnoreCase("terca")) {
            System.out.println("3");
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("4");
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("5");
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("6");
        } else if (dia.equalsIgnoreCase("sabado")){
            System.out.println("7");
        } else {
            System.out.println("Dia invalido !!!");
        }

        System.out.println("\nFim !!!");
        entrada.close();
    }
}
