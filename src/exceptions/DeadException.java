package exceptions;

public class DeadException extends RuntimeException {
    public DeadException(String message){
        super(message);
    }
}
