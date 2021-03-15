package lab0702;

public class CheckingAccount extends Account{

    double overdraftLimit = 5000;

    public void setOverDraftLimit(double overdraftLimit)
    {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        String output = "";

        output+="Checkings";
        output+="Overdraft Limit : " + this.overdraftLimit;
        output+="\nBalance is " + this.balance;

        return output;
    }

    @Override
    public void withdraw(double value)
    {
        if(value < 0)
        {
            System.out.println("Cannot enter negative value.");
            return;
        }

        if((balance + overdraftLimit)< value)
        {
            System.out.println("Withdraw value exceed the overdraft limit.");
            return;
        }

        this.balance -= value;
    }
}
