package arquivoEdit.src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class arquivoEdit {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<String>();

        for(int i = 0 ; i < 5; i++ ) {

            System.out.printf("Digite um texto: ");
            String texto = scanner.nextLine();

            linhas.add(texto);
        }
            Path arquivo = Paths.get("C:\\Users\\plgon\\Documents\\Java Estudos\\Java-Learning\\arquivoEdit\\src\\arquivo.txt");

            Files.write(arquivo, linhas);

    }
}
