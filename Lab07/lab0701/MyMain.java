package lab0701;

import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        SavingsAccount savings_account = new SavingsAccount();
        CheckingAccount checking_account = new CheckingAccount();

        savings_account.deposite(10000);
        Account.setAnnualInterestRate(1.5);

        savings_account.withdraw(5);





        System.out.println(savings_account.toString());

        System.out.println("Withdraw : "); 
        double input = sc.nextDouble();
        savings_account.withdraw(input);

        System.out.println("Balance is " + savings_account.getBalance());
        savings_account.printDateCreated();

        System.out.println("=========");


        checking_account.withdraw(8000000);


    }
}