package lab0703;

import java.util.GregorianCalendar;

public class Staff extends Employee{

    String title = "";    

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double saraly,
            GregorianCalendar date_hired,String title) {
        super(name, address, phoneNumber, emailAddress, office, saraly);
        this.title = title;
    }

    @Override
    public String toString() {
        return "" + this.getClass() + "\n" + "Name: " + this.name + "\nAddress: " + this.address + "\nPhone: "+ this.phoneNumber + "\nEmail "
        + this.emailAddress + "\n"+super.getClass() + "{name=" + ", address= " + this.address + ", phoneNumber" + this.phoneNumber + ", email=" + 
        this.emailAddress + "}" + this.getClass() + "{title="+this.title+ "}";
    }
    
}
