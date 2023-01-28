public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("Teste");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}