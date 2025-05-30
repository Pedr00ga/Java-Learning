package OrientacaoObjetos;

public class Estoque {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Notebook";
        produto.valor = 2000.00;
        produto.quantidade = 9;
        produto.estoqueMinimo = 10;

        Produto produto2 = new Produto();
        produto2.nome = "Garrafa 1L";
        produto2.valor = 69.90;
        produto2.quantidade = 35;
        produto2.estoqueMinimo = 25;


        produto.mostrarProduto();
        produto.verificaEstqoue();

        produto2.mostrarProduto();
        produto2.verificaEstqoue();
    }

}
