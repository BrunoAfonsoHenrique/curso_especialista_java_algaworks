public class OperadorDecremento {

    public static void main(String[] args) {
        int limiteTentativasLogin = 10;

        // limiteTentativasLogin--;

        // int novoLimiteTentativasLogin = limiteTentativasLogin--;
        int novoLimiteTentativasLogin = --limiteTentativasLogin;

        System.out.println("Limite de tentativas de login: " + limiteTentativasLogin);
        System.out.println("novo limite de tentativas de login: " + novoLimiteTentativasLogin);
        
    }
}
