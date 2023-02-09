package L15_exceptions_person;

public class InvalidWeightException extends Exception {
    public InvalidWeightException(String msg) {
        super(msg);
    }
}
