package lab0702;

public class MyMain {

    public static void main(String[] args) {

        Account myaccount = new Account();

        myaccount.deposite(1000);
        myaccount.deposite(30);
        myaccount.deposite(40);
        myaccount.deposite(50);

        myaccount.withdraw(5);
        myaccount.withdraw(4);
        myaccount.withdraw(2);

        myaccount.printTransaction();

    }

}
