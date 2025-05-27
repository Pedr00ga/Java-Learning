import java.util.Scanner;

public class calculadoraSimples {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Declara scanner

        //Solicita inputs dos numeros para o usuario e qual tipo de calculo ele deseja fazer
        System.out.println("Bem vindo a calculadora");
        System.out.print("Digite o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.print("Digite qual operação você quer fazer: ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();

        //Declara variavel de resultado para fazer os calculos
        double resultado;

        //Faz as condições para verificar qual a opção de operação escolhida, realiza os calculos e mostra para o usuario
        if (operacao == 1){
            resultado = primeiroNumero + segundoNumero;
            System.out.println("O resultado da soma é: " + resultado);
        }else if (operacao == 2){
            resultado = primeiroNumero - segundoNumero;
            System.out.println("O resultado da subtração é: " + resultado);
        }else if (operacao == 3){
            resultado = primeiroNumero / segundoNumero;
            System.out.println("O resultado da divisão é: " + resultado);
        }else if (operacao == 4){
            resultado = primeiroNumero * segundoNumero;
            System.out.println("O resultado da multiplicação é: " + resultado);
        }else {
            System.out.println("O valor inserido é invalido, tente novamente com digitos de 1 a 4");
        }
    }
}
