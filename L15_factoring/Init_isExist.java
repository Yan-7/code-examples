package L15_factoring;

public class Init_isExist {
    public static void main(String[] args) {
        String[] names = null;
        names = new String[4]; // [null, null, null, null]
        names = init(4);  // ["","","","" ]
        System.out.println(isExist("Daniel", names));

    }


    public static boolean isExist(String toFind, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(toFind)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExist2(String toFind, String[] arr) {
        for (String string : arr) {
            if (string.equals(toFind)) {
                return true;
            }
        }
        return false;
    }

    public static String[] init(int len) {
        String[] arr = new String[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";
        }
        return arr;
    }
}
