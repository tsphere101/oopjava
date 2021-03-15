package lab0703;

public class Status {

    int status;
    public Status(int num)
    {
        this.status= num;
    }
    
    public String getStatus()
    {
        if(status == 1) return "FRESHMAN";
        else if (status == 2) return "SOPHOMORE";
        else if (status == 3) return "JUNIOR";
        else return "SENIOR";
    }


    
}
