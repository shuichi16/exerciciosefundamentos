package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {

        //trabalho na terca (V or F)
        //trabalho na quinta (V or F)

        // > Se os 2 trabalhos derem certo, vou comprar uma TV 55", toda a familia vai ao shopping tomar sorvete
        // > Se apenas 1 dos trabalhos derem certo, vou comprar TV 32", toda a familia vai ao shopping tomar sorvete
        // > Se nenhum trabalho der certo, a familia toda vai ficar em casa

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;
        System.out.println("\nComprou TV 50\"? " + comprouTV50);

        boolean comprouTV32 = trabalho1 ^ trabalho2;
        System.out.println("Comprou TV 32\"? " + comprouTV32);

        boolean comprouSoverte = trabalho1 || trabalho2;
        System.out.println("Comprou TV 32\"Sorvete? " + comprouSoverte);

        // Operador Unario!
        boolean maisSaudavel = !comprouSoverte;
        System.out.println("Mais saudavel? " + maisSaudavel);
    }
}
