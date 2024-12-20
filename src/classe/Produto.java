package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    // Construtor fixo com parametro ja definido
    Produto(String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }


    // Construtor padrao recebe o mesmo nome da classe sem nenhum tipo de retorno pré fixado, pois o JAVA ja sabe que vai retornar(objeto) para que possa alterar/passar algum paramentro depois quando necessario
    Produto(){

    }
    double precoComDesconto(){

        return preco * (1 - desconto);
    }
}
