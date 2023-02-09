package Exception;

public class TryCatch {
    public static void main(String[] args) {
        parse("1234a");



    }

    public static void parse(String num) {
        try {
            int numerical = Integer.parseInt(num);
            System.out.println(numerical);
        } catch (Exception e) {
            e.printStackTrace();
            e.printStackTrace(System.out);
        }

    }
}
