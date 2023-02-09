public class EX extends Exception {

    private int a;

    public EX(String message, int a) {

        super(message);
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
