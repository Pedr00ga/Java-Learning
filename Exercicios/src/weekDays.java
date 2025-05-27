import java.util.Scanner;

public class weekDays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //declara scanner

        System.out.print("Digite o dia da semana de 1 a 7: "); //Solicita input de 1 a 8
        int dia = scanner.nextInt();


        //Declara o switch para cada numero
        switch(dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: //Expressa um erro caso o input não seja o desejavel
                System.err.println("Digite um numero valido");
                break;

        }
    }
}
