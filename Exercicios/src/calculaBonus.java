import java.util.Scanner;

public class calculaBonus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Declara scanner

        //Solicita inputs para o usuario
        System.out.print("Digite a meta de faturamento anual: ");
        double metaAnual = scanner.nextDouble();
        System.out.print("Digite o faturamento real: ");
        double faturamentoReal = scanner.nextDouble();
        System.out.print("Digite a media salarial do ano anterior: ");
        double mediaSalarialAnterior = scanner.nextDouble();

        //Declara as variaveis e testa as comparações necessarias
        boolean bateuFaturamento = faturamentoReal >= metaAnual;
        boolean bateuOitenta = (faturamentoReal >= ((metaAnual * 80) /100) && faturamentoReal <= metaAnual);

        //Verifica as condições e mostra resultado para o usuario
        if (bateuFaturamento){
            System.out.println("Parabéns, batemos a meta de faturamento anual!");
            System.out.println("Você recebeu um bonus salarial de: " + mediaSalarialAnterior);
        }else if (bateuOitenta){
            System.out.println("Não batemos a meta anual, mas chegamos acima de 80%");
            System.out.println("Você recebeu um bonus salarial de: " + (mediaSalarialAnterior * 80) /100);
        }else {
            System.out.println("Não batemos a meta esse ano");
        }

        Scanner closeScanner;
    }
}
