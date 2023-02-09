package Compare;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Person> mylist = new ArrayList<>();

        mylist.add(0,new Person("Bob",53));
        mylist.add(1,new Person("May",52));
        System.out.println(mylist);
        System.out.println(mylist.get(0).compareTo(mylist.get(1)));
    }
}
