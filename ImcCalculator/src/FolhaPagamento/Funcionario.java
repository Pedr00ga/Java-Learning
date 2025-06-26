package FolhaPagamento;

import java.util.Scanner;

public class Funcionario {
    Scanner scanner = new Scanner(System.in);
    final static int sim = 1;

    String nome;
    int quantidadeFilhos;

    int getQuantidadeFilhos(){
        System.out.print("Você possui filhos?\n[1] - SIM\n[2] - NÃO\nResposta: ");
        int resposta = scanner.nextInt();

        if(resposta == 1){
            System.out.print("Digite a quantidade de filhos: ");
            quantidadeFilhos = scanner.nextInt();
            return quantidadeFilhos;
        }else{
            quantidadeFilhos = 0;
            return quantidadeFilhos;
        }


    }
}
