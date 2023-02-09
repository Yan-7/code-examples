package Collections;


import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        Set<String> myList = new HashSet<>();

        myList.add("aaa");
        myList.add("bbbbbb");
        myList.add("ccc");
        myList.add("eeeeee");
        myList.add("ccc");


        for (int i = 0; i <myList.size() ; i++) {
            System.out.println(myList.iterator().next());

        }




//        ----
    }

}
