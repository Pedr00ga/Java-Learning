package OrientacaoObjetos;

public class Estoque {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Notebook";
        produto.valor = 2000.00;
        produto.quantidade = 9;
        produto.estoqueMinimo = 10;

        mostrarProduto(produto);
        verificaEstqoue(produto);
    }
    public static void mostrarProduto(Produto produto){
        System.out.println("O produto: " + produto.nome + " tem o valor de: " + produto.valor +
                " Existe em estoque: " + produto.quantidade + " unidade(s).");
    }
    public static void verificaEstqoue(Produto produto){
        boolean verificaEstoqueMinimo = produto.quantidade < produto.estoqueMinimo;
        if(verificaEstoqueMinimo){
            System.out.println("O estoque do: " + produto.nome +
                    "está abaixo de: " + produto.estoqueMinimo + " Necessario reposição");
        }
    }
}
