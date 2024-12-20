package controle;

public class Continue {
    public static void main(String[] args) {

        // O Continue serve para interromper a continuação de onde ele estiver, pulando o valor e continuando a partir daquele ponto
        for (int i = 0; i < 10; i++){
            if (i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }
}
