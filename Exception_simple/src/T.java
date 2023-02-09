public class T {
    public static void main(String[] args) {
        P mr = new P();
        try {
            mr.print();
        } catch (Exept e) {
            System.out.println(e.getMessage());
        }
    }

}
