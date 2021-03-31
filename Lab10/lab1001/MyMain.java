package lab1001;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * MyMain
 */
public class MyMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input;

        System.out.println("Menu (1=Circle, 2=Rectangle, 3=Triangle, 4=Exit");
        input = Integer.parseInt(sc.nextLine());

        if (input == 1) {
            circleMenu();
        } else if (input == 2) {
            rectangleMenu();
        } else if (input == 3) {
            triangleMenu();
        } else {
            System.out.println("End of the program.");

        }

    }

    public static void circleMenu() {

        double temp_rad;
        String temp_color;
        double temp_weight;
        Scanner sc = new Scanner(System.in);
        System.out.println("C1 :");
        System.out.print("enter radius : ");
        temp_rad = Double.parseDouble(sc.nextLine());
        System.out.print("enter color : ");
        temp_color = sc.nextLine();
        System.out.print("enter weight : ");
        temp_weight = Double.parseDouble(sc.nextLine());

        Circle c1 = new Circle();
        c1.setColor(temp_color);
        c1.setRadius(temp_rad);
        c1.setWeight(temp_weight);

        System.out.println("C2 : ");
        System.out.println("enter radius : ");
        temp_rad = Double.parseDouble(sc.nextLine());
        System.out.println("enter color : ");
        temp_color = sc.nextLine();
        System.out.println("enter weight : ");
        temp_weight = Double.parseDouble(sc.nextLine());

        Circle c2 = new Circle();
        c2.setColor(temp_color);
        c2.setRadius(temp_rad);
        c2.setWeight(temp_weight);

        System.out.println("3.1 Find the larger object using max method:c1c2");
        String var_name = "";
        if (c1.compareTo(c2) == 1)
            var_name += "c1";
        else if (c1.compareTo(c2) == -1)
            var_name += "c2";
        else
            var_name += "EQUAL";
        System.out.println("Answer : " + var_name);

        System.out.println("Cloning circle c3 by using : ");
        Circle c3 = new Circle();
        while (true) {
            var_name = sc.nextLine();
            if (var_name.equals("c1")) {
                try {
                    System.out.println("c1 is cloned");
                    c3 = (Circle) c1.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                break;
            } else {
                var_name = "c2";
                try {
                    c3 = (Circle) c2.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

        if (var_name.equals("c1")) {
            System.out.println(var_name + " ==" + "c3 is : " + (c1 == c3));
            System.out.println(var_name + ".equals(c3) is : " + c1.equals(c3));
        } else {
            System.out.println(var_name + " == " + "c3 is : " + (c1 == c2));
            System.out.println(var_name + ".equals(c3) is : " + c2.equals(c3));
        }

        System.out.println("Find the larger of 2 instances of comparable objects : ");
        String com1 = "", com2 = "";
        com1 = sc.nextLine();
        com2 = sc.nextLine();
        System.out.print("ANSWER ");
        System.out.print("\nAnswer : ");
                // System.out.println(com1=="c1");
                if (com1.equals("c1") & com2.equals("c2")) {
                    if (GeometricObject.max(c1, c2).equals(c1)) {

                        System.out.print("C1");
                    } else {
                        System.out.print("C2");

                    }
                } else if (com1.equals("c1") && com2.equals("c3")) {
                    if (GeometricObject.max(c1, c3).equals(c1)) {
                        System.out.print("C1");
                    } else {
                        System.out.print("C3");

                    }
                } else if (com1.equals("c2") && com2.equals("c3")) {
                    if (GeometricObject.max(c2, c3).equals(c2)) {
                        System.out.print("C2");
                    } else {
                        System.out.print("C3");

                    }
                } else {
                    System.out.println("error");
                }
            }

        // if (var1.equals("c1")) {
        //     if (var2.equals("c1")) {
        //         if (GeometricObject.max(c1, c1).equals(c1))
        //             System.out.println("c1");
        //         else
        //             System.out.println("c1");
        //     } else if (var2.equals("c2")) {
        //         if (GeometricObject.max(c1, c2).equals(c1))
        //             System.out.println("c1");
        //         else
        //             System.out.println("c2");
        //     } else {
        //         if (GeometricObject.max(c1, c3).equals(c1))
        //             System.out.println("c1");
        //         else
        //             System.out.println("c3");
        //     }
        // }

        // else if (var1.equals("c2")) {

        //     if (GeometricObject.max(c2, c1).equals(c2))
        //         System.out.println("c2");
        //     else
        //         System.out.println("c1");
        // } else if (var2.equals("c2")) {
        //     if (GeometricObject.max(c2, c2).equals(c2))
        //         System.out.println("c2");
        //     else
        //         System.out.println("c2");
        // } 

        // else{
        // if (var2.equals("c1")) {
        //     System.out.println(GeometricObject.max(c3, c1));
        // } else if (var2.equals("c2")) {
        //     System.out.println(GeometricObject.max(c3, c2));
        // } else {
        //     System.out.println(GeometricObject.max(c3, c3));

        // }

    public static void rectangleMenu() {

    }

    public static void triangleMenu() {

    }

}
