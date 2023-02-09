package Exceptions_Bank;

public class BankSystem {
    public static void main(String[] args) {
        System.out.println("start");

        Account account1 = new Account("Moshe");
        account1.status();

        account1.deposit(2000);
        account1.status();

        try {
            account1.withdraw(12000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        account1.status();
    }
}
