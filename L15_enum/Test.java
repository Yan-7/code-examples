package L15_enum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player("Moshe", Level.EASY);
        Player p3 = new Player("bob", LocalDateTime.now().minusDays(2),Level.MEDIUM);

        Employee e1 = new Employee(123,"Yarin",PC.LEVONO);
        Employee e2 = new Employee(123,"Bar",PC.MAC);
        Employee e3 = new Employee(123,"Tomer S",PC.LEVONO);

        Coupon c1 = new Coupon(
                1,
                "Yarin+Elad",
                "they are taking",
                LocalDate.now(),
                LocalDate.now().plusMonths(5),
                100,
                19.99,
                Catagory.Electronics);

        Coupon c2 = new Coupon(
                "6pack cola",
                "taste of life...",
                LocalDate.now(),
                LocalDate.now().plusDays(7),
                100,
                19.99,
                Catagory.Drinks);

        Chair ch1 = new Chair(Color.BROWN,4);
        Chair ch2 = new Chair(Color.BLACK,4);

    }
}
