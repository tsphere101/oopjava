package lab0703;

import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /* Creating Student */
        System.out.println("\nCreating Student");
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        System.out.println("Enter Phone Number : ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter Email address : ");
        String emailAddress = sc.nextLine();
        System.out.println("Enter year : ");
        int status = Integer.parseInt(sc.nextLine());
        Student std = new Student(name, address, phoneNumber,emailAddress,status);

        System.out.println(std.toString());

        /* Creating Employee */
        System.out.println("\nCreating Employee");
        System.out.println("Enter name : ");
        name = sc.nextLine();
        System.out.println("Enter address: ");
        address = sc.nextLine();
        System.out.println("Enter Phone Number : ");
        phoneNumber = sc.nextLine();
        System.out.println("Enter Email address : ");
        emailAddress = sc.nextLine();
        System.out.println("Enter office");
        String office = sc.nextLine();
        System.out.println("Enter saraly");
        double saraly = Double.parseDouble(sc.nextLine());
        Employee emp = new Employee(name, address, phoneNumber, emailAddress, office, saraly);

        System.out.println(emp.toString());

        /* Creating Faculty */
        System.out.println("\nCreating Faculty");
        System.out.println("Enter name : ");
        name = sc.nextLine();
        System.out.println("Enter address: ");
        address = sc.nextLine();
        System.out.println("Enter Phone Number : ");
        phoneNumber = sc.nextLine();
        System.out.println("Enter Email address : ");
        emailAddress = sc.nextLine();
        System.out.println("Enter office");
        office = sc.nextLine();
        System.out.println("Enter saraly");
        saraly = Double.parseDouble(sc.nextLine());
        System.out.println("Enter OfficeHour");
        int office_hours = Integer.parseInt(sc.nextLine());
        System.out.println("Enter rank");
        int rank = Integer.parseInt(sc.nextLine());

        Faculty fac = new Faculty(name, address, phoneNumber, emailAddress, office, saraly, office_hours, rank);
        
        System.out.println(fac.toString());

    }

}
