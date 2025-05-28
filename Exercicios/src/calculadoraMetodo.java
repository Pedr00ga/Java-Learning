import java.util.Scanner;

public class calculadoraMetodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[2];
        String[] operacoes = new String[]{"Soma", "Subtracao", "Multiplicacao", "Divisao"};

        System.out.println("Bem vindo a calculadora");
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite a " + (i + 1) +"º numero: ");
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("Qual a ooperação desejada?");
        for(int y = 0; y < operacoes.length; y++){
            System.out.println("[" + (y + 1) + "] " + operacoes[y]);
        }
        System.out.print("Digite o numero: ");
        int opcao = scanner.nextInt();
        boolean valida = verificaCondicao(opcao, operacoes);

        switch (opcao){
            case 1:
                soma(numeros);
                    break;
            case 2:
                subtracao(numeros);
                    break;
            case 3:
                multiplicacao(numeros);
                    break;
            case 4:
                divisao(numeros);
                    break;
        }

        if (!valida){
            System.err.println("Opcao invalida!");
            System.exit(1);
        }

    }
    public static boolean verificaCondicao(int opcao, String[] vetor){
        boolean valida = (opcao > 0 && opcao < (vetor.length + 1));
        return valida;
    }

    public static double soma(double[] numeros){
        double soma = 0;
        for(double numero : numeros){
            soma += numero;
        }
        System.out.println("Resultado da sua soma é: " + soma);
        return soma;
    }

    public static double subtracao(double[] numeros){
        double subtracao = numeros[0] -= numeros[1];
        System.out.println("Resultado da sua subtração é: " + subtracao);
        return subtracao;
    }
    public static double multiplicacao(double[] numeros){
        double multiplicacao = numeros[0] *= numeros[1];
        System.out.println("Resultado da sua multiplicação é: "+ multiplicacao);
        return multiplicacao;
    }
    public static double divisao(double[] numeros){
        double divisao = numeros[0] /= numeros[1];
        System.out.println("Resultado da sua divisão é: " + divisao);
        return divisao;
    }
}
