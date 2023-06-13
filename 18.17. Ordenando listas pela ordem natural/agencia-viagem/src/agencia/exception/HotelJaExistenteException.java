package agencia.exception;

public class HotelJaExistenteException extends  RuntimeException {

    public HotelJaExistenteException(String message) {
        super(message);
    }
}
