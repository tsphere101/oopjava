package lab0702;

import java.util.Date;

public class Transaction {

    private Date date;
    private char type;

    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;

        this.date = new Date();

    }

    public void printTranscation() {
        System.out.print(this.date + " \t");
        System.out.print(this.type + "\t");
        System.out.print(this.amount + "\t");
        System.out.print(this.balance + "\n");
    }

}
