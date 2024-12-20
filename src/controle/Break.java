package controle;

public class Break {
    public static void main(String[] args) {

        // Break só faz sentido usar quando estiver usando um Laço
        for (int i = 0; i < 10; i++){
            if (i == 5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Fim !");
    }
}
