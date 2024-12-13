package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o primeiro valor: ");
    double num1 = entrada.nextDouble();

    System.out.println("Digite o segundo valor: ");
    double num2 = entrada.nextDouble();

    System.out.println("Informe a operação: ");
    String op = entrada.next();

    double resultado = "+".equals(op) ? num1 + num2 : 0;
    resultado = "-".equals(op) ? num1 - num2 : resultado;
    resultado = "*".equals(op) ? num1 * num2 : resultado;
    resultado = "/".equals(op) ? num1 / num2 : resultado;
    resultado = "%".equals(op) ? num1 % num2 : resultado;

    System.out.println(resultado);
    entrada.close();

    }
}
