package Collections.drills;

import java.util.*;

public class A {
    public static void main(String[] args) {


        //2
        Set<Integer> set1 = new HashSet<>();
        while (set1.size() != 100) {
            int num = (int) (Math.random() * 1000);
            set1.add(num);
        }
//        System.out.println(mySet);

        //2
        List<Integer> myList2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 100);
            myList2.add(num);
        }
        Set<Integer> set2 = new HashSet<>(myList2); //duplicates disappear

        //3
        Set<Person> set3 = Person.factory8(); //factory method
        set3.add(new Person("bob1", 1));
        set3.add(new Person("bob2", 2));
//        System.out.println(set3);
        Iterator<Person> iterator = set3.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().contains("haman")) {
                iterator.remove();
            }
        }
//        System.out.println();

//
        //4
        String sentence = "I am nice you are nice they are nice";
        System.out.println(sentence);
        String[] arr;
        String splitter = " ";
        arr = sentence.split(splitter);
        Map<String, Integer> stringMap1 = new HashMap<>();
          // key     value
        for (int i = 0; i < arr.length; i++) {
            if (stringMap1.containsKey(arr[i])) {
                stringMap1.replace(arr[i], stringMap1.get(arr[i]) + 1);
            } else {
                stringMap1.put(arr[i], 1);
            }
        }
        System.out.println(stringMap1);
    }
}

//        ----
//    }
//}
//
