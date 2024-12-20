package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        // Aqui foi passado como parametro diretamente o nome do produto
        Produto p1 = new Produto("Laptop",4356.89, 0.25);

        // Esses 3 objetos estao comentados pq não tem necessidade deles estarem sendo declarados pq já foram passados como parametro diretamente no construtor
//      p1.nome = "Laptop";
//      p1.preco = 4356.89;
//        p1.desconto = 0.25;

        // Aqui esta se utilizando do construtor padrao sem nenhum parametro passado ainda
        var p2 = new Produto();
        p2.nome = "Caneta PReta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrionho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Media do carrinho = R$%.2f.", mediaCarrionho);
    }
}
