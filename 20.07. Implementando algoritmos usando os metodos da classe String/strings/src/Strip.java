public class Strip {

    public static void main(String[] args) {

        String nome = "\n      Amanda    \n";

        System.out.println(nome);
        System.out.println(nome.strip());

        System.out.println(nome.trim());
        System.out.println(nome.stripLeading());
    }
}
