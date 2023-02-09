package Collections.play;

public class Manager extends PPerson{

    Department department;

    int index = (int) (Math.random()*Department.values().length);

    public Manager(int age, String name) {
        super(age, name);
    }
}
