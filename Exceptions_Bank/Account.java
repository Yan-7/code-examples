package Exceptions_Bank;

import java.util.UUID;

public class Account {
    private UUID acountID = UUID.randomUUID();
    private String accountHolder;
    private double balance;

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws DailyLimitException, OverdraftException {
        if (amount > 6000) {
            throw new DailyLimitException("limit is 6000");
        }
        if (amount > balance) {
            throw new OverdraftException("not enough money");
        }
        balance -= amount;
    }

    public UUID getAcountID() {
        return acountID;
    }

    public void setAcountID(UUID acountID) {
        this.acountID = acountID;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "acountID=" + acountID +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
    public void status() {
        System.out.println("balance is" + this.balance);
    }
}
