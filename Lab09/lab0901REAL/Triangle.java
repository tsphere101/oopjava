package lab0901REAL;

import java.lang.Math;

public class Triangle extends GeometricObject {

    double length_side1;
    double length_side2;
    double length_side3;

    public Triangle() {
    }

    public Triangle(double length_side1, double length_side2, double length_side3) {
        this.length_side1 = length_side1;
        this.length_side2 = length_side2;
        this.length_side3 = length_side3;
    }

    public void setLength_side1(double length_side1) {
        this.length_side1 = length_side1;
    }

    public void setLength_side2(double length_side2) {
        this.length_side2 = length_side2;
    }

    public void setLength_side3(double length_side3) {
        this.length_side3 = length_side3;
    }

    @Override
    protected double getPerimeter() {
        return this.length_side1 + this.length_side2 + this.length_side3;
    }

    @Override
    protected double getArea() {
        double a = this.length_side1;
        double b = this.length_side2;
        double c = this.length_side3;
        double p = this.getPerimeter()/2;

        double result_new = Math.sqrt((p-c)*(p-b)*(p-a)*p);

        // double result = (Math.round(Math.sqrt((p*(p-a)*(p-b)*(p-c))))*100.0)/100.0;
        return Math.round(result_new*100.0)/100.0;
    }

}
