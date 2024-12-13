package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 3.6;
        String resultadoRecuperacao = media >= 5.0 ? "em recuperação" : "reprovado";

        // O operador ternario que separa as operações é o ? que separa os valores que vao ser atribuidos e o : que separa o valor se a expressao for verdadeira ou falsa

        String resultadoParcial = media >= 7.0 ?
                "aprovado." : "em recuperação";
        String resultadoFinal = media >= 7.0 ?
                "aprovado" : resultadoParcial;

        System.out.println("\nO aluno está " + resultadoFinal);
    }
}
