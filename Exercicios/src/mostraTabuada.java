import java.util.Scanner;

public class mostraTabuada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero que deseja ver a tabuada: ");
        int numero = scanner.nextInt();

        tabuada(numero, 0);

    }
    static void tabuada(int numero, int i){
        int resultado = (numero * i);
        System.out.println(numero + "x" + i + " = " + resultado);
        if (++i < 11){
            tabuada(numero, i);
        }
    }

}
