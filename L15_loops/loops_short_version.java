package L15_loops;

public class loops_short_version {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        //long version
        for (int i = 0; i < args.length ; i++) {
            arr[i] = arr[i]*arr[i];
        }
        //shorter
        int idx = 0;
        while (idx< arr.length) {
            arr[idx] = arr[idx]*arr[idx];
        }
        //shortest
        for (int num:arr) {
            num= num*num;
            System.out.println(num);
        }
    }
}
