import java.util.Arrays;
import java.util.Comparator;

public class Principal {

    public static void main(String[] args) {

        Integer[] notas = {8, 5, 4, 9, 10};
        System.out.println(Arrays.toString(notas));

        Arrays.sort(notas);
        System.out.println(Arrays.toString(notas));

        Arrays.sort(notas, Comparator.reverseOrder()); // O Comparator só funciona em arrays do tipo Wrapper
        System.out.println(Arrays.toString(notas));

    }
}
