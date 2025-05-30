package OrientacaoObjetos;

public class Produto {

    String nome;
    double valor;
    int quantidade;
    int estoqueMinimo;

    public void mostrarProduto(){
        System.out.println("O produto: " + nome + " tem o valor de: " + valor +
                " Existe em estoque: " + quantidade + " unidade(s).");
    }
    public void verificaEstqoue(){
        boolean verificaEstoqueMinimo = quantidade < estoqueMinimo;
        if(verificaEstoqueMinimo){
            System.out.println("O estoque de " + nome +
                    " está abaixo de " + estoqueMinimo + " Necessario reposição");
        }else{
            System.out.println("O estoque de " + nome + " não precisa de respoição");
        }
    }
}