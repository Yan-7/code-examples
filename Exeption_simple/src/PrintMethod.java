public class PrintMethod {


    public void print() throws EX {
        int i = 1;
        if (i == 1) {
            throw new EX("bla", i);
        }
    }
}
