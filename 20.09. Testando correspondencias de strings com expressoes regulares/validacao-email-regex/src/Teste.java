import java.util.regex.Pattern;

public class Teste {
    public static void main(String[] args) {

        /*
        https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html
         */
        String email = "a-a@algaworks.com";

        boolean valido = Pattern.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}", email);
        System.out.println("O email é valido? " + valido);
    }
}
