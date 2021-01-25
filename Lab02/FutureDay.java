import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
public class FutureDay {
    public static void main(String[] args) {
        int day = 0; // Sunday init
        List<String> dayOfWeek = Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int input = sc.nextInt();
        System.out.println("Enter the nunber of days elapsed since today: ");
        int inputElapsed = sc.nextInt();
        sc.close();
        int dayInit = input;
        day += input;
        for(int i = 0 ; i < inputElapsed ; i ++)
        {
            day++;
            if(day > 6)
            day = 0;
        }
        System.out.println("Today is " + dayOfWeek.get(dayInit) + " and the future day is " + dayOfWeek.get(day) );
    }
    
}
