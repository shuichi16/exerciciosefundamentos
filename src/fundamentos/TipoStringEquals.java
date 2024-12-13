package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args) {

        System.out.println("2" == "2");

        // Para fazer comparação a melhor opção é usar o EQUALS e não o == pq muitas vezes pode ocorrer erros durante a execução
        // Exemplos de comparação

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner entrada  = new Scanner(System.in);
        System.out.println("Digite um o valor de comparacao: ");

        // TRIM serve para eliminar espaços em brancos
        String s2 = entrada.nextLine();
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));

        entrada.close();
    }
}
