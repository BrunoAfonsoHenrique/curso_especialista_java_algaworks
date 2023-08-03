import java.util.Scanner;

public class ProgramaAnaBissexto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ano: ");
        int ano = entrada.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("Ano Bissexto");
        } else {
            System.out.println("Não é ano bissexto");
        }
        entrada.close();
    }
}
