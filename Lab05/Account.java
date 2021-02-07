import java.util.GregorianCalendar;
import java.util.Calendar;

public class Account {

    private int id = 0;
    private double balance = 0;
    private GregorianCalendar dateCreated;

    static private double annualInterestRate = 0;

    // Constructor
    public Account() {
        this.dateCreated = new GregorianCalendar();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new GregorianCalendar();
    }

    // Accessor
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public GregorianCalendar getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public double getMonthlyInterest()
    {
        return this.balance*((annualInterestRate/12.0)/100.0);
    }

    // Modifiers

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDateCreated(GregorianCalendar dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void deposit(double value)
    {
        this.balance += value;
    }
    public void withdraw(double value)
    {
        this.balance -= value;
    }

}
