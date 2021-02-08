package lab0501;

import java.util.Date;

public class Account {

    private int id = 0;
    private double balance = 0;
    private Date dateCreated;

    static private double annualInterestRate = 0;

    // Constructor
    public Account() {
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    // Accessor
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public double getMonthlyInterest() {
        return this.balance * ((annualInterestRate / 12.0) / 100.0);
    }

    // Modifiers

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void deposit(double value) {
        if (value < 0) {
            System.out.println("Cannot deposite value");
            return;
        } else
            this.balance += value;
            System.out.println("You've deposit " + value);
        return;
    }

    public void withdraw(double value) {
        if (value < 0) {
            System.out.println("Cannot withdraw negative amount");
            return;
        } else if (this.balance < value) {
            System.out.println("Withdraw failed :: Insufficient Balance");
            return;
        } else
            this.balance -= value;
        System.out.println("" + value + " has been withdrawn from your account.");
    }

    public void logBalance() {
        System.out.println("Current Balance : " + this.balance);
    }

}
