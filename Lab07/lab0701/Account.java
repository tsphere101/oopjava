package lab0701;

import java.util.Date;

public class Account {


    /**
     *  Account id
     */
    int id;

    /**
     * balance in account
     */
    double balance;

    /**
     * Annual interest rate for all accounts.
     */
    static double annualInterestRate = 0;

    /**
     * The date and time the account was created
     */
    Date dateCreated;

    String name = "";

    /**
     * Construct the account with initials id , starting_balance, annualInterestRate
     * @param id the id of the account
     * @param starting_balance the starting balance in the account
     */
    public Account(int id,double starting_balance,String name)
    {
        this.id = id;
        this.balance = starting_balance;
        this.dateCreated = new Date();
        this.name = name;
    }

    /**
     * Create the account with specified id.
     * @param id the id specified for the account.
     */
    public Account(int id)
    {
        this(id,0,"");
    }

    /**
     * Create the account with specified name and id.
     * @param name The account name
     * @param id the id of the account
     */
    public Account(String name, int id)
    {
        this(id,0,name);
    }



    /**
     * Create the account without specified argument.
     */
    public Account()
    {
        this(0,0,"");
    }

    public void log()
    {
        System.out.println("AccountID :: " + this.id);
        System.out.println("AccountBalace :: " + this.balance);
        System.out.println("AnnualInterestRate :: "+ annualInterestRate);
        System.out.println("AccountCreatedDate :: " + this.dateCreated);        

    }

    /**
     * Get the balance in the account.
     */
    public double getBalance()
    {
        return this.balance;
    }

    /**
     * Print the account balance.
     */
    public void printBalance()
    {
        System.out.println("Balance is " +this.balance);

    }

    /**
     * Withdraw balance from the account.
     */
    public void withdraw(double value)    
    {
        this.balance -= value;
    }

    /**
     * Deposite money to account.
     */
    public void deposite(double value)
    {
        this.balance+= value;
    }

    /**
     * Print date created.
     */
    public void printDateCreated()
    {
        System.out.println("This account was created at "+ this.dateCreated);
    }

    /**
     * Set Annual Interest Rate
     * 
     */
    public static void setAnnualInterestRate(double value)
    {
        Account.annualInterestRate=value;
    }

}
