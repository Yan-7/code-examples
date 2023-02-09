package L15_enum;

public class Employee {
    private static int count = 0;
    private int id;
    private String name;
    private PC pc;

    public Employee(int id, String name, PC pc) {
        this.id = id;
        this.name = name;
        this.pc = pc;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PC getPc() {
        return pc;
    }

    public void setPc(PC pc) {
        this.pc = pc;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pc=" + pc +
                '}';
    }
}
