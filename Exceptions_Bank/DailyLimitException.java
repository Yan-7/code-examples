package Exceptions_Bank;

public class DailyLimitException extends Exception{
    public DailyLimitException (String msg) {
        super(msg);
    }
}
