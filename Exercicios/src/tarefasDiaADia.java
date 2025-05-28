import java.util.Arrays;
import java.util.Scanner;

public class tarefasDiaADia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tarefas = new String[6];

        for(int i = 1; i < tarefas.length; i++){
            System.out.print("Digite a " + i +"º tarefa(s) mais importantes do seu dia: ");
            tarefas[i] = scanner.nextLine();
        }

        System.out.println("Sua tarefa é: " + Arrays.toString(tarefas));
    }
}

