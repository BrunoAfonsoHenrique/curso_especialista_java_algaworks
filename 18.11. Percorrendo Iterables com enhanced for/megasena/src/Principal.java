import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        Sorteador sorteador = new Sorteador();
        Iterator<Integer> sorteadorItarator = sorteador.iterator();

        while(sorteadorItarator.hasNext()) {
            System.out.println(sorteadorItarator.next());
        }
//        System.out.println(sorteadorItarator.next());

    }
}
