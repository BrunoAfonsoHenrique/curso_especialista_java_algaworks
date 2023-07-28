public class PromocaoAritmetica3 {

    public static void main(String[] args) {

        int x = 3;
        float y = 2;
        // float z = x / y;
        // float z = x / (float) y; // 1.5

        float z = (float)(x / y); // 1.5

        // resultado int / int = 1.0
        // resultado int / double = 1.5
        System.out.println(z);
    }
}
