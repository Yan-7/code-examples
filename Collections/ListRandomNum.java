package Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ListRandomNum {

    public static void main(String[] args) {
//        List<Integer> mainList = addingNums(10);
        System.out.println(addToSet(10));

    }
    //    ----
    public static Set<Integer> addToSet(int size) { //in set
        Set<Integer> mySet = new HashSet<>();
        while (mySet.size()<size) {
            int x = (int) (Math.random()*10);
            mySet.add(x);
        }
        return mySet;
    }

    public static List<Integer> addingNums(int size) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int rand = (int) (Math.random() * 10);
            myList.add(rand);
        }
        return myList;
    }
//-----------------
}


