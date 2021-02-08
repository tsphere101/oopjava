package lab0501;

import java.util.Scanner;

public class Lab0501 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        int my_id = (int)sc.nextDouble();
        Account myAccount = new Account(my_id,20000);
        Account.setAnnualInterestRate(4.5);

        while(true)
        {
            // Prompt user
            System.out.println();
            System.out.println("===MENU===");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Balance");
            System.out.println("4.Monthly Interest");
            System.out.println("5.Account date created");
            System.out.println("0.Exit");

            double input = sc.nextDouble();
            input = (int)input;
            if(input <0 || input > 5)
            {
                System.out.println("Please enter 0-5");
            }
            else if(input == 0)
            {
                break;
            }
            else if(input == 1)
            {
                System.out.println("Enter amount to deposit: ");
                double temp = sc.nextDouble();
                myAccount.deposit(temp);
            }
            else if(input == 2)
            {
                System.out.println("Enter amount to withdraw: ");
                double temp = sc.nextDouble();
                myAccount.withdraw(temp);
            }
            else if(input == 3)
            {
                myAccount.logBalance();
            }
            else if (input == 4)
            {
                //Monthly Intereset
                System.out.println("Your monthly interest is : " + myAccount.getMonthlyInterest());
                
            }
            else if (input == 5)
            {
                //Date created
                System.out.println("Account Created " + myAccount.getDateCreated());
                
            }
        }
    }
}
