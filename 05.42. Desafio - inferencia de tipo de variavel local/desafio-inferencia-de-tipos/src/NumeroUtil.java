public class NumeroUtil {
    int maiorNumero = 0;

    int verificarMaiorDeDoisNumeros(int numeroUm, int numeroDois) {
//        if (numeroUm < numeroDois) {
//            return maiorNumero = numeroDois;
//        }
//        return maiorNumero = numeroUm;

//        return maiorNumero = numeroUm < numeroDois ? numeroDois : numeroUm;

        return maiorNumero = Math.max(numeroUm, numeroDois);

    }

    int verificarMaiorDeTresNumeros(int numeroUm, int numeroDois, int numeroTres) {
        var maiorNumero = verificarMaiorDeDoisNumeros(numeroUm, numeroDois);
//        if (maiorNumero < numeroTres) {
//            return maiorNumero = numeroTres;
//        }
//        return maiorNumero;

        return maiorNumero = Math.max(maiorNumero, numeroTres);
    }
}
