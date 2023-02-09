package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratorDemo {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("aaa");
        mySet.add("bbb");
        mySet.add("ccccc");
        Iterator<String> iterator = mySet.iterator();
        iterator.next();
        System.out.println(mySet);
        while (iterator.hasNext()) {
            if (iterator.next().length()>3) {
                iterator.remove();
            }
        }
        System.out.println(mySet);
    }
}
