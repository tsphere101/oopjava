package lab0703;

import java.util.Date;

public class Faculty extends Employee{

    int office_hours = 0;
    int rank = 0;


    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double saraly,
            int office_hours,int rank) {
        super(name, address, phoneNumber, emailAddress, office, saraly);
        this.office_hours = office_hours;
        this.rank = rank;
    }
    
    @Override
    public String toString() {
        return "" + "Faculty" + "\n" + "Name: " + this.name + "\nAddress: " + this.address + "\nPhone: "+ this.phoneNumber + "\nEmail "
        + this.emailAddress + "\n"+ "Person" + "{name=" + ", address= " + this.address + ", phoneNumber" + this.phoneNumber + ", email=" + 
        this.emailAddress + "}" + "Employee" + "{office="+this.office+ ", salary="+ this.salary + ", date_hired= "+ this.date_hired+ "}"
        + "Faculty{" + "office_hours" + this.office_hours + ", rank=" + this.rank + "}"
        ;
    }

}
