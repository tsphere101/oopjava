package lab0601;

import java.lang.Math;

/**
 * The class contains BMI calculation and data accumulation
 * 
 * @author TSphere
 * @version 1.0
 */


/** Define 1 pound = 0.45359237 kg 
  * Define 1 inches = 0.0254 meters 
  */

public class BMI {

    /**
     * Name of the user
     */
    String name = "None";

    /**
     * Age of the user
     */
    int age = 0;

    /**
     * Weight of the user 
     */
    double weight = 0; /** Stores value in kilograms. */

    /**
     * Height of the user
     */
    double height = 0; /** Store value in meter. */

    /**
     * Construct user without specifying information
     */
    public BMI() {
    }

    /**
     * Construct user with specifying weight and height
     * @param weight weight in pounds
     * @param height height in inches
     */
    public BMI(double weight, double height) {
        if (weight < 0) /** Check if weight or height are negative */
            weight = 0;
        if (height < 0)
            height = 0;

        weight *= 0.45359237; /* Converting pound to kilograms.*/
        weight = Math.round(weight * 100.0) / 100.0; /** Rounding the decimal. */
        this.weight = weight; /** Storing weight in Kilograms. */
        height *= 0.0254; /** Converting inches to meter. */ 
        height = Math.round(height * 100) / 100.0; /** Rounding the decimal. */
        this.height = height; /** Storing height in meter. */
    }

    /**
     * Get the BMI result
     * @return user's BMI value
     */
    public double getBMI() {
        double bmi = weight / ((height) * (height)); /** Calculating the BMI value */
        bmi = Math.round(bmi * 100.0) / 100.0; /** Round the decimal. */
        return bmi;
    }

    /**
     * Get the BMI interpretation
     * @return String that interpretate the BMI result
     */
    public String getBmiInterpretation() {
        String output = "";

        if (this.getBMI() < 18.5) {
            output += "Underweight";
        } else if (this.getBMI() >= 18.5 && this.getBMI() <= 25.0) {
            output += "Normal";
        } else if (this.getBMI() >= 25.0 && this.getBMI() < 30.0) {
            output += "Overweight";
        } else {
            output += "Obese";
        }

        return output;
    }

    /**
     * Get user's height.
     * @return user's height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Get user's weight.
     * @return user's weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Get user's name.
     * @return user's name
     */
    public String getName() {
        return name;
    }

    /**
     * Get user's age.
     * @return user's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set user's height.
     * @param height height in inches 
     */
    public void setHeight(double height) {
        if (height < 0) /** In case of negative height value. */
            return;
        height *= 0.0254; /** Converting inches to meter. */
        height = Math.round(height * 100) / 100.0; /** Rounding the decimal. */
        this.height = height; /** Stores value in meter. */
    }

    /**
     * Set user's weight.
     * @param weight weight in lbs
     */
    public void setWeight(double weight) {
        if (weight < 0) /** In case of negative weight value. */
            return;
        weight *= 0.45359237; /** Converting pounds to kilograms. */
        weight = Math.round(weight * 100.0) / 100.0; /** Rounding the decimal. */
        this.weight = weight; /** Stores data in kiligrams. */
    }

    /**
     * Set user's name.
     * @param name the name of the user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set age of the user.
     * @param age age of user
     */
    public void setAge(int age) {
        if (age < 0)
            System.out.println("Your age is negative, you never born or what?");
            this.age = 0;
        this.age = age;
    }
}