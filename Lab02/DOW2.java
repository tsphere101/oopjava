import java.util.Scanner;
public class DOW2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int h = 0; // h is the day of the week 0 Sat -> 6 Fri
        int q = 0 ; // q is the day of the month
        int m = 0;  // m is the month  13 Jan 14 | 3 March 4 April 5 6 7...
        int j = 0 ; // j is the century (Year / 100)
        int k = 0; // k is the year of the country
        int year = 0; // Year

        System.out.println("Enter year:");
        year = sc.nextInt();

        System.out.println("Enter month : 1-12 :");
        int temp = sc.nextInt();
        if(temp == 1)
        {
            m = 13; year--;
        }
        else if (temp == 2)
        {
            m = 14; year--;
        }
        else m = temp;

        j = year/ 100;
        k = year%100;

        System.out.println("Enter the day of the month : 1 - 31 : ");
        temp = sc.nextInt();
        q = temp;


        //Compute
        h = ( q + (26*(m + 1) / 10) + k + (k/4) + (j/4) + 5*j) % 7;
        
        String day = toDayofWeek(h);
        System.out.println(day);

        sc.close();
    }
    public static String toDayofWeek(int h)
    {
        switch (h) {
            case 0:
                {
                return "Saturday";
                }
            case 1:
                {
                    return "Sunday";
                }
            case 2:
                {
                    return "Monday";
                }
            case 3:
                {
                    return "Tuesday";
                }
            case 4:
                {
                    return "Wednesday";
                }
            case 5:
                {
                    return "Thursday";
                }
            case 6:
                {
                    return "Friday";
                }
            default:
                return "";
        }
    }
    
}
