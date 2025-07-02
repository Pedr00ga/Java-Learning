package lojaProdutos;

public class Produto {

    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    //Passar produto como parametro para conseguir acessar a variavel do produto em metodo estatico
    static double calcularCustosTotais(Produto produto) {
        return produto.precoCusto + Produto.custoEmbalagem;
    }

    void alterarPrecoCusto(double precoCusto){
        //THIS faz com que use a variavel fora do void da classe produto
        this.precoCusto = precoCusto;
    }

    static void alterarCustoEmbalagem(double custoEmbalagem){
        //Utilizar a classe antes da varaivel faz com que consiga utilizar uma variavel estatica para o metodo
        Produto.custoEmbalagem = custoEmbalagem;
    }

    static void imprimirCustoEmbalagem(){
        System.out.println("Custo com embalagem " + custoEmbalagem);
    }
}
