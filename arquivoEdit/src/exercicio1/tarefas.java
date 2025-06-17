package arquivoEdit.src.exercicio1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class tarefas {
    public static void main(String[] args) throws IOException {
        Scanner scanner =  new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while(true){
            System.out.print("Digite a tarefa ou digita (x) para sair: ");
            String tarefa = scanner.nextLine();
            String fim = "X";
            if(tarefa.equalsIgnoreCase(fim)){
                break;
            }
            tarefas.add(tarefa);

        }
        Path arquivo = Paths.get("C:\\Users\\plgon\\Documents\\Java Estudos\\Java-Learning\\arquivoEdit\\src\\exercicio1\\tarefas.txt");

        Files.write(arquivo, tarefas);

        scanner.close();
    }

}
