import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) {

        Path arquivo = Path.of("C:\\Users\\Bruno\\Documents\\especialista-java-algaWorks\\projetos-java\\especialista-java-algaworks\\16.16. Usando a cláusula finally\\excecoes\\src\\arquivo");

        try {
            BufferedReader reader = Files.newBufferedReader(arquivo);
            System.out.println(reader.readLine());

            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}