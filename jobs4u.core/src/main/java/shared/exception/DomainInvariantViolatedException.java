package shared.exception;


public class DomainInvariantViolatedException extends Exception{

    public DomainInvariantViolatedException(String message) {
        super(message);
    }

    public DomainInvariantViolatedException(String message, Throwable throwable){
        super(message,throwable);
    }
}
