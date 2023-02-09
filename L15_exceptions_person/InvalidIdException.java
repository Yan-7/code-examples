package L15_exceptions_person;

public class InvalidIdException extends Exception {
    public InvalidIdException(String msg) {
        super(msg);
    }
}
