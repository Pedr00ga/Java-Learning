import java.util.Scanner;

public class gastoFamiliar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double  valorFinal = 0.0;

        //Feito de forma diferente da aula, comentado logica original e refeito conforme aula para ficar salvo a possibilidade

        System.out.print("Digite o valor da conta de luz: ");
        //double contaLuz = scanner.nextDouble();
        valorFinal += scanner.nextDouble();

        System.out.print("Digite o valor da conta de agua: ");
        //double contaAgua = scanner.nextDouble();
        valorFinal += scanner.nextDouble();

        System.out.print("Digite o valor da conta de telefone: ");
        //double contaTel = scanner.nextDouble();
        valorFinal += scanner.nextDouble();

        System.out.print("Digite o valor da escola do filho: ");
        //double escolaFilho = scanner.nextDouble();
        valorFinal += scanner.nextDouble();

        System.out.print("Digite o valor da fatura do cartão: ");
        //double faturaCartao = scanner.nextDouble();
        valorFinal += scanner.nextDouble();

        System.out.print("Digite o valor gasto no supermercado: ");
        //double gastoMercado = scanner.nextDouble();
        valorFinal += scanner.nextDouble();

        //valorFinal += contaLuz += contaAgua += contaTel += escolaFilho += faturaCartao += gastoMercado;

        System.out.println("O valor total das contas é: " + valorFinal);
    }
}
