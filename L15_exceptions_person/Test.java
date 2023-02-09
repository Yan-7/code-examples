package L15_exceptions_person;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        try {
            Person p1 = new Person(123, "fdg", -50, LocalDate.now(), Device.ANDROID);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
