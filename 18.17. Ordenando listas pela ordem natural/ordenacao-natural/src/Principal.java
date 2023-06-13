import java.util.*;

public class Principal {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(8);
        numeros.add(30);
        numeros.add(1);

        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);
        Collections.sort(numeros, Comparator.reverseOrder());
        System.out.println(numeros);


    }
}
