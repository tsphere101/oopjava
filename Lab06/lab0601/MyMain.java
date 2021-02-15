package lab0601;

import java.util.Scanner;

public class MyMain {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Creating User Object
    BMI user = new BMI();

    // Prompt user to enter the name
    System.out.println("Enter your name : ");
    user.setName(sc.nextLine()); 

    // Prompt user to enter the age
    System.out.println("Enter your age : ");
    user.setAge((int)sc.nextDouble());
    
    //Prompt user to enter the weight // in pounds
    System.out.println("Enter your weight (in pounds): ");
    user.setWeight(sc.nextDouble());

    //Prompt user to enter the height // in inches
    System.out.println("Enter your height (in inches): "); 
    user.setHeight(sc.nextDouble());

    // Print out the BMI in METRIC
    System.out.println("Your BMI for weight " + user.getWeight() + " kg and height " + user.getHeight()*100.0 + " cm is " + user.getBMI());

    // Print the interpretation
    System.out.println("You're " + user.getBmiInterpretation());


}


}