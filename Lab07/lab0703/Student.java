package lab0703;

public class Student extends Person {
    
    final Status status;
    
    public Student(String name, String address, String phoneNumber,String emailAddress,int status)
    {
        super(name,address,phoneNumber,emailAddress);
        this.status = new Status(status);
    }

    @Override
    public String toString() {
        return "" + "Student" + "\n" + "Name: " + this.name + "\nAddress: " + this.address + "\nPhone: "+ this.phoneNumber + "\nEmail "
        + this.emailAddress + "\n"+ "Person" + "{name=" + ", address= " + this.address + ", phoneNumber=" + this.phoneNumber + ", email=" + 
        this.emailAddress + "}" + "Student" + "{title="+ this.status.getStatus() + "}";
    }

    // public String statusToString()
    // {
    //     if(status == 1) return "FRESHMAN";
    //     else if (status == 2) return "SOPHOMORE";
    //     else if (status == 3) return "JUNIOR";
    //     else return "SENIOR";
    // }


}
