public class EqualsIgnoreCase {

    public static void main(String[] args) {

        String nome1 = "Joao";
        String nome2 = new String("JOAO");

        System.out.println(nome1.equals(nome2));
        System.out.println(nome1.equalsIgnoreCase(nome2));

    }
}