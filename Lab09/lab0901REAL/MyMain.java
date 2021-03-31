package lab0901REAL;

import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a,b,c;
        String color = "";
        boolean isFilled= false;


        System.out.println("Enter 3 sides of traigle : ");
        a = Double.parseDouble(sc.nextLine());
        b = Double.parseDouble(sc.nextLine());
        c = Double.parseDouble(sc.nextLine());

        System.out.println("Enter the color : ");
        color = sc.nextLine();

        System.out.println("Enter 0 for FLASE, 1 for TRUE : ");
        if(Integer.parseInt(sc.nextLine() ) == 1)
        {
            isFilled = true;
        }
        else isFilled = false;

        Triangle myTriangle = new Triangle(a,b,c);
        myTriangle.setColor(color);
        myTriangle.setFilled(isFilled);

        System.out.println("Area::" + myTriangle.getArea());
        System.out.println("Perimeter::" + myTriangle.getPerimeter());
        System.out.println("Color::"+myTriangle.getColor());
        System.out.println("isFilled::"+myTriangle.isFilled());


    }

}
