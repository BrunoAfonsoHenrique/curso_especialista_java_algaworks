package estoque;

public class BaixaEstoqueException extends Exception {

//    public BaixaEstoqueException(String message) {
//        super(message);
//    }

    public BaixaEstoqueException(String message, Throwable cause) {
        super(message, cause);
    }
}
