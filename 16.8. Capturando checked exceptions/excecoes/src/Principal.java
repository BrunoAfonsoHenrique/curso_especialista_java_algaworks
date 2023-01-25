import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {
    public static void main(String[] args) {
        
        try {
            Path arquivo = Path.of("C:\\Users\\Bruno\\Documents\\especialista-java-algaWorks\\projetos-java" +
                    "\\especialista-java-algaworks\\16.8. Capturando checked exceptions\\excecoes\\src\\arquivo\\teste.txt");
            Files.createFile(arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
            e.printStackTrace();
        }

    }
}