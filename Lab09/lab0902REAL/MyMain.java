package lab0902REAL;

import java.util.Scanner;
import java.util.ArrayList;

public class MyMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double input = 0;

        Circle circle_first = new Circle();
        Circle circle_second = new Circle();
        Rectangle rectangle_first = new Rectangle();
        Rectangle rectangle_second = new Rectangle();

        System.out.println("Enter the radius for first Circle");
        input =Double.parseDouble(sc.nextLine());
        circle_first.setRadius(input);


        System.out.println("Enter the radius for second Circle");
        input =Double.parseDouble(sc.nextLine());
        circle_second.setRadius(input);



        System.out.println("Enter the lenght for first Rectangle");
        input =Double.parseDouble(sc.nextLine());
        rectangle_first.setA(input);
        System.out.println("Enter the width for first Rectangle");
        input =Double.parseDouble(sc.nextLine());
        rectangle_first.setB(input);

        System.out.println("Enter the lenght for second Rectangle");
        input =Double.parseDouble(sc.nextLine());
        rectangle_second.setA(input);
        System.out.println("Enter the width for second Rectangle");
        input =Double.parseDouble(sc.nextLine());
        rectangle_second.setB(input);

        System.out.println("Enter side a of Triangle");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Enter side b of Triangle");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Enter side c of Triangle");
        double c = Double.parseDouble(sc.nextLine());
        

        Triangle triangle_first = new Triangle(a,b,c);


        ArrayList<GeometricObject> arr = new ArrayList<GeometricObject>();
        /* Add objects to arraylist */
        arr.add(circle_first);
        arr.add(circle_second);
        arr.add(rectangle_first);
        arr.add(rectangle_second);
        arr.add(triangle_first);

        /* OUTPUT */

        System.out.println("Total Area = "+ GeometricObject.sumArea(arr));





    }


}
