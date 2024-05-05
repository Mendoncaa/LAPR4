package shared.exception;

public class RuleViolationException extends BusinessException{

    public RuleViolationException() {
    }

    public RuleViolationException(String message) {
        super(message);
    }

    public RuleViolationException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuleViolationException(Throwable cause) {
        super(cause);
    }

    protected RuleViolationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
