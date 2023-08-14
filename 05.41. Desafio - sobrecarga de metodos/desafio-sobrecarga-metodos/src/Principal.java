import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        NumeroUtil numeroUtil = new NumeroUtil();
//        int maiorNumero = numeroUtil.verificarMaiorDeDoisNumeros(18, 19);
          int maiorNumero = numeroUtil.verificarMaiorDeTresNumeros(98, 51, 100);

        System.out.printf("Maior numero: %d", maiorNumero);

    }
}
