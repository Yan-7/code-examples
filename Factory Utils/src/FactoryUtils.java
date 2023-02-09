public class FactoryUtils {

    public static int init(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static int[] init(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = init(0, 100);
        }

        return arr;
    }
}

