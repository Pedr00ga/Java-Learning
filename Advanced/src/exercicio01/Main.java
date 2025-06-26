package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cachorro cachorro = new cachorro();
        cachorro.proprietario = new pessoa();

        cachorro.valorConsulta = 200;

        System.out.print("Digite o nome do cachorro: ");
        cachorro.nome = scanner.nextLine();
        System.out.print("Digite o idade do cachorro: ");
        cachorro.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o seu nome: ");
        cachorro.proprietario.nome = scanner.nextLine();

        boolean encaminhamento = cachorro.idade < 10;

        System.out.println("Exibindo lista nome do cliente: \n" + "* Nome do cachorro: " + cachorro.nome + "\n"
                + "* Idade: " + cachorro.idade + "\n" + "* Nome da dona: " + cachorro.proprietario.nome);

        if (encaminhamento) {
            System.out.println(cachorro.proprietario.nome + " Favor se encaminhar para a sala do pediatra com o "
                    + cachorro.nome);
            System.out.println("O valor da sua consulta é de: " + cachorro.calculaValorConsulta());
        }else{
            System.out.println(cachorro.proprietario.nome + " Favor se encaminhar para a sala 5 com o "
                    + cachorro.nome);
            System.out.println("O valor da sua consulta é de: " + cachorro.calculaValorConsulta());
        }
    }
}
