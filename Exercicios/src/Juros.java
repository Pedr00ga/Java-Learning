package Exercicios.src;

import java.util.Scanner;

public class Juros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Declara scanner

        //Solicita inputs para o usuario
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite o tipo de pagamento [1 - à vista | 2 - a prazo]: ");
        Integer tipoPagamento = scanner.nextInt();

        //Verifica se o 2 input é = a 1
        boolean pagamentoAvista = tipoPagamento.equals(1);

        //Declara variaveis para calculo
        double juros;
        double acrescimo;
        double valorFinal;

        //Faz as condições para valor a vista
        if (pagamentoAvista){
            System.out.println("O valor final da compra é: " + valorProduto);
        }else { //Se o valor for a prazo executa os calculos e mostra qual o valor final da compra
            juros = 10.0;
            acrescimo = valorProduto * juros / 100;
            valorFinal = valorProduto + acrescimo;
            System.out.println("O valor final do seu produto é: " + valorFinal);
        }
    }
}
