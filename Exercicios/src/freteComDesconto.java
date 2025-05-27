import java.util.Scanner;

public class freteComDesconto {
    public static void main(String[] args){
        //Abre o scanner
        Scanner scanner = new Scanner(System.in);

        //Define frete por padrão em R$15,00
        final int frete = 15;

        //Solicita o valor para o usuario
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        //Estrutura para definir frete gratis em compras a partir de R$100,00
        if (valorProduto >= 100){

            System.out.println("Parabén você ganhou frete gratis, valor final é de: " + valorProduto);
        }else {
            double valorFinal = valorProduto + frete;
            System.out.println("Com acrescimo do frete de R$15,00 o valor final é de: " + valorFinal);
        }

    }
}
