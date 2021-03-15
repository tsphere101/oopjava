package lab0702;
public class SavingsAccount extends Account {


    @Override
    public String toString() {
        String output = "";

        output+="Savings";
        output+="\nBalance is " + this.balance;

        return output;
    }

    @Override
    public void withdraw(double value)
    {
        if(value < 0) 
        {
            System.out.println("Cannot enter negative value");
            return;
        }
        if(this.balance >= value)
        this.balance -= value;
        else
        {
            System.out.println("Insufficient fund.");
        }
    }

    @Override
    public void deposite(double value)
    {
        if(value < 0)
        {
            System.out.println("Cannot enter negative value");
            return;
        }
        this.balance+= value;
    }

}