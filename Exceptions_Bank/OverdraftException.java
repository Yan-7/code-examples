package Exceptions_Bank;

public class OverdraftException extends Exception{
    public OverdraftException (String msg) {
        super(msg);
    }
}
