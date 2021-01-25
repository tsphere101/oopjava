import java.util.Scanner;

public class SumTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int limit = 1000;
        System.out.println("Input the number between 0 - 1000");
        double number = 0 ;
        while (true)
        {
            number = sc.nextDouble();
            if(number >= 0 && number <= limit) break;
            System.out.println("Please enter number between 0 - 1000");
        }
        
        number = (int)number;
        
        while(number > 1)
        {
            sum += number%10;
            number /=10;
        }

        //Display
        System.out.println("Sum : " + sum);

    }
}
