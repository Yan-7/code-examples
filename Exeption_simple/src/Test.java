public class Test {
    public static void main(String[] args) {
        PrintMethod p = new PrintMethod();
        try {
            p.print();
        } catch (EX e) {
            System.out.println(e.getMessage());
        }
    }
}
