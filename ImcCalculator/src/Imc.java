import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

        // Declara o scanner para usuario digitar as variaveis e declara as variaveis
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de peso corportal em Kg: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        //Faz o calculo de IMC e declara a variavel IMC
        double imc = peso / (altura * altura);


        //Entrega o resultado com base em uma tabela de IMC
        System.out.println("O seu IMC é: " + imc);
        if (imc >= 40){
            System.out.print("Obesidade Grau 3 (Mórbida)");
        }else if (imc >= 35){
            System.out.print("Obesidade Grau 2");
        }else if (imc >= 30){
            System.out.print("Obesidade Grau 1");
        }else if (imc >= 25){
            System.out.print("Sobrepeso");
        }else if (imc >= 18.5){
            System.out.print("Peso Normal");
        }else if (imc < 18.5){
            System.out.print("Abaixo do peso");
        }


    }
}