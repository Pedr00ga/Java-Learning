import java.util.Scanner;

public class inputs {
    //Cria uma função para ler os numeros como input
    public static float lerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float numero = scanner.nextInt();
        return numero; //retorna o numero lido
    }
    public static void main(String[] args){
        float num1 = lerNumero(); //Chama a função para o primeiro numero
        float num2 = lerNumero(); //Chama a função para o segundo numero

        float soma = num1 + num2;
        float sub = num1 - num2;
        float multi = num1 * num2;
        float div = num1 / num2;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração dos números é: " + sub);
        System.out.println("A multiplicação dos números é: " + multi);
        System.out.println("A soma divisão números é: " + div);
    }
}