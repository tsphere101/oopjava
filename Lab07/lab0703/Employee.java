package lab0703;

import java.util.Date;

public class Employee extends Person{
    
    String office= "";
    double salary = 0;
    Date date_hired ;
    

    public Employee(String name, String address, String phoneNumber,String emailAddress,String office,double saraly)
    {
        super(name,address,phoneNumber,emailAddress);
        this.office = office;
        this.salary = saraly;
        this.date_hired = new Date();
    }
    
    @Override
    public String toString() {
        return "" + "Employee" + "\n" + "Name: " + this.name + "\nAddress: " + this.address + "\nPhone: "+ this.phoneNumber + "\nEmail "
        + this.emailAddress + "\n"+ "Person" + "{name=" + ", address= " + this.address + ", phoneNumber" + this.phoneNumber + ", email=" + 
        this.emailAddress + "}" + "Employee" + "{office="+this.office+ ", salary="+ this.salary + ", date_hired= "+ this.date_hired+ "}";
    }

    

}
