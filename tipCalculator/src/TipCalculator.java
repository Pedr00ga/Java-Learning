package tipCalculator.src;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite valor passado pelo cliente: ");
        double valorCliente = scanner.nextDouble();

        double valorTroco = valorCliente - valorProduto;

        if (valorCliente < valorProduto){
            System.out.println("Está faltando dinheiro para completar a compra");
        }else
            System.out.println("O valor do troco é: " + valorTroco);

    }
}