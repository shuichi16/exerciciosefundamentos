package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei todos os Kata");
            case "marrom":
                System.out.println("Sei alguns Kata superiores");
            case "roxa":
                System.out.println("Estou aprendendo os Kata superiores");
            case "verde":
                System.out.println("Sei todos os Kata basicos");
            case "laranja":
                System.out.println("Sei quase todos os Kata basicos");
            case "amarela":
                System.out.println("Estou aprendendo agora");
                break;
        }
        System.out.println("Fim !");
    }
}
