import java.util.Scanner;

public class desconto {
    public static void main(String[] args){
        //Declara scanner
        Scanner scanner = new Scanner(System.in);

        //Declara constantes para os calculos
        final int minParaDesconto = 10;
        final int porcentagemDesconto = 10;

        //Solicita input para o usuario
        System.out.print("Digite o valor do produto: ");
        double valorPorduto = scanner.nextDouble();

        System.out.print("Digite a quantidade de produtos: ");
        int quantidadeProduto = scanner.nextInt();

        //Faz o calculo de sub-total
        double subTotal = valorPorduto * quantidadeProduto;

        //Faz as decisões e calculo de desconto
        if (quantidadeProduto > minParaDesconto){
            double desconto = (subTotal * porcentagemDesconto) /100; //100 é igual a 100%
            double valorFinal = subTotal - desconto;
            System.out.println("O valor da sua compra com desconto é: " + valorFinal);
        }else
            System.out.println("O valor final da sua compra é: " + subTotal);
    }
}
