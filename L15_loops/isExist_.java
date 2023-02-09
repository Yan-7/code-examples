package L15_loops;

public class isExist_ {
    public static void main(String[] args) {

        String[] names = new String[4];
        System.out.println(isExist("Dan",names));
    }

    public static boolean isExist(String toFind,String[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].equals(toFind)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isExist2(String toFind, String[] arr) {  // short version
        for (String string:arr) {
            if (string.equals(toFind)) {
                return true;
            }
        }
        return false;
    }
}
