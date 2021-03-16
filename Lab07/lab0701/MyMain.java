package lab0701;

import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        SavingsAccount savings_account = new SavingsAccount();
        CheckingAccount checking_account = new CheckingAccount();

        savings_account.deposite(5000);
        Account.setAnnualInterestRate(1.5);

        savings_account.withdraw(6000);





        System.out.println(savings_account.toString());

        System.out.println("Withdraw : "); 

        System.out.println("Balance is " + savings_account.getBalance());
        savings_account.printDateCreated();

        System.out.println("=========");


        System.out.println("CHECKINGS ACCOUNT");

        checking_account.deposite(5000);
        checking_account.setOverDraftLimit(1000);
        checking_account.withdraw(7000);

        System.out.println(checking_account.getBalance());



    }
}