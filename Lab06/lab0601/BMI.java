package lab0601;

import java.lang.Math;
// define 1 pound = 0.45359237 kg

// define 1 inches = 0.0254 meters

public class BMI {
    String name = "None";
    int age = 0;
    double weight = 0; // stores in kg
    double height = 0; // stores in meters

    public BMI() {
    }

    public BMI(double weight, double height) {
        // check if there's negative value
        if (weight < 0)
            weight = 0;
        if (height < 0)
            height = 0;

        // converting
        weight *= 0.45359237; // In pounds
        weight = Math.round(weight * 100.0) / 100.0; // round
        this.weight = weight; // stores in kilogram
        height *= 0.0254; // In inches
        height = Math.round(height * 100) / 100.0; // round
        this.height = height; // stores in meter
    }

    public double getBMI() {
        double bmi = weight / ((height) * (height));
        bmi = Math.round(bmi * 100.0) / 100.0;
        return bmi;
    }

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

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        if (height < 0) // if height is negative value
            return;
        height *= 0.0254; // In inches
        height = Math.round(height * 100) / 100.0; // round
        this.height = height;
    }

    public void setWeight(double weight) {
        if (weight < 0) // if weight is negative value
            return;
        weight *= 0.45359237; // In pounds
        weight = Math.round(weight * 100.0) / 100.0; // round
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0)
            System.out.println("Your age is negative, you never born or what?");
            this.age = 0;
        this.age = age;
    }

}