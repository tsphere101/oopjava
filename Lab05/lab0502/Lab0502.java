package lab0502;

import java.util.Scanner;

public class Lab0502 {
    public static void main(String[] args) {
        while(true)
        run();
    }

    public static void run() {
        System.out.println("1.Create without constructor argument");
        System.out.println("2.Create with defined sides and sides length");
        System.out.println("3.Create with defined sides, sides length, X-Position, Y-Position");

        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        input = (int) input;
        if (input < 1 || input > 3) {
            System.out.println("Exitig...");
        } else if (input == 1) {
            // Create without constru
            RegularPolygon x = new RegularPolygon();
            // Print outk
            x.log();
        } else if (input == 2) {
            // Create with difined sides and length
            System.out.println("Please enter how many sides you want to create: ");
            int many_sides = (int) sc.nextDouble();
            System.out.println("Please enter how length you want to create: ");
            double length = sc.nextDouble();
            RegularPolygon x = new RegularPolygon(many_sides, length);
            x.log();
        } else if (input == 3) {
            // Create with defined all of the argument
            System.out.println("Please enter how many sides you want to create: ");
            int many_sides = (int) sc.nextDouble();
            System.out.println("Please enter how length you want to create: ");
            double length = sc.nextDouble();
            System.out.println("Please enter X-Position");
            double x_pos = sc.nextDouble();
            System.out.println("Please enter Y-Position");
            double y_pos = sc.nextDouble();
            RegularPolygon x = new RegularPolygon(many_sides, length, x_pos, y_pos);
            x.log();
        }
        System.out.println("=========");
    }
}
