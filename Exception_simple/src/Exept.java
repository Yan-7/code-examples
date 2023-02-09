public class Exept extends Exception {

   public int a;

    public Exept(String message, int a) {
        super(message);
        this.a = a;
    }

    public int getA() {
        return a;
    }
}
