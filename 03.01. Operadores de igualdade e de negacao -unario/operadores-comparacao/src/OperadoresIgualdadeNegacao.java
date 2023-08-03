public class OperadoresIgualdadeNegacao {

    public static void main(String[] args) {

        // boolean numerosIguais = 10 == 10;
        // boolean numerosIguais = (4 + 6) == (5 *2);

        int numero1 = 10;
        int numero2 = 10;
        //boolean numerosIguais = numero1 == 10;
        boolean numerosIguais = numero1 == numero2;
        //boolean numerosDiferentes = !numerosIguais;
        //boolean numerosDiferentes = !(numero1 == numero2);
        boolean numerosDiferentes = numero1 != numero2;

        System.out.printf("Numeros iguais: %b%n", numerosIguais);
        //System.out.printf("Numeros iguais: %b%n", numero1 == numero2);

        System.out.printf("Numeros iguais: %b%n", numerosDiferentes);

        System.out.println("-----------------------------");

        String nome1 = "Bruno";
        String nome2 = "Bruno";
        boolean nomesIguais = nome1.equals(nome2);
        System.out.printf("Nomes iguais: %s%n", nomesIguais);

    }
}
