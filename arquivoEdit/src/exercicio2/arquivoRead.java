package arquivoEdit.src.exercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class arquivoRead {
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:\\Users\\plgon\\Documents\\Java Estudos\\Java-Learning\\arquivoEdit\\src\\exercicio1\\tarefas.txt");

        List<String> linhas = Files.readAllLines(arquivo);

        for(int i = 0; i < linhas.size(); i++){
            System.out.println(linhas.get(i));
        }

    }
    public void leArquivo(){

    }
}
