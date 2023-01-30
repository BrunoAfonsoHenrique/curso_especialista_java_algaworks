import arquivo.CadastroAnuncioException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicoCadastroAnuncio {


    public void cadastrar(String codigo, String descricao) {
        Path arquivo = Path.of("C:\\Users\\Bruno\\Documents\\especialista-java-algaWorks\\" +
                "projetos-java\\especialista-java-algaworks\\16.20. Boas práticas não engula exceções\\" +
                "excecoes\\src\\arquivo\\abc", codigo + ".txt");

        try {
            Files.writeString(arquivo, descricao);
        } catch (IOException e) {
            throw new CadastroAnuncioException("Erro na escrita no arquivo de anuncio", e);

            // Melhor usar alguma biblioteca de log para fazer isso
            //System.out.println("Erro escrevendo arquivo. Ignorando...");
            //e.printStackTrace();
        }
    }
}
