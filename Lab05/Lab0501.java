import java.util.Calendar;
public class Lab0501 {
    public static void main(String[] args) {
       
        Account myAccount = new Account(1122,20000);
        Account.setAnnualInterestRate(4.5);

        myAccount.withdraw(2500);
        myAccount.deposit(3000);

        //Print Balance....
        System.out.println("Printing Balance..");
        System.out.println(myAccount.getBalance());

        // Printing Monthly Interest..
        System.out.println("Printing Monthly Interest..");
        System.out.println(myAccount.getMonthlyInterest());

        //Printing Date Created
        System.out.println("Printing Date Created..");
        System.out.println("Account Created "+myAccount.getDateCreated().get(Calendar.DATE) + "/" + myAccount.getDateCreated().get(Calendar.MONTH) + "/" + myAccount.getDateCreated().get(Calendar.YEAR));

    }
}
