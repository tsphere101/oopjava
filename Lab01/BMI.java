import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        
        /*
        1 KG = 2.20462262 lbs
        1 Meter = 39.37 inches

        BMI = (kg) / (meter)^2

        */

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Weight(lbs)"); double weightP = sc.nextDouble();
        System.out.println("Enter Height(inches)"); double heightI = sc.nextDouble();

        double height = heightI/39.37;
        double weight = weightP/2.20462262;

        double bmi = weight / (height*height);

        System.out.println(bmi);

    }
}
