package Collections.drills;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Set<Person> factory8() {
        Set<Person> people= new HashSet<>();
        for (int i = 0; i <8 ; i++) {
            int age = (int) (Math.random()*100);
            String name = "haman";
            Person person = new Person(name,age);
            people.add(person);
        }
        return people;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
