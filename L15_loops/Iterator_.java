package L15_loops;

import java.util.Arrays;
import java.util.Iterator;

public class Iterator_ {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,6,6,4,3,2};

        // for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // iterator
        Iterator <Integer> iterator = Arrays.stream(arr).iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // for each
        for (int num: arr) {
            System.out.println(num);
        }
    }

//    ------
}
