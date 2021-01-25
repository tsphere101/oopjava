import java.util.Scanner;
public class Algebra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ax+by = e");
        System.out.println("cx+dy = f");

        System.out.print("Enter a : "); double a = sc.nextDouble();
        System.out.print("Enter b : "); double b = sc.nextDouble();
        System.out.print("Enter c : "); double c = sc.nextDouble();
        System.out.print("Enter d : "); double d = sc.nextDouble();
        System.out.print("Enter e : "); double e = sc.nextDouble();
        System.out.print("Enter f : "); double f = sc.nextDouble();
        double x = 0, y = 0 ;
        x = ((e*d) - (b*f) ) / ((a*d) - (b*c));
        y = ((a*f) - (e*c) ) / ((a*d) - (b*c));
        
        System.out.println(" X = " + x);
        System.out.println(" Y = " + y);

    }
}
