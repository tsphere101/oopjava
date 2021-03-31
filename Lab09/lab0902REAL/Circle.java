package lab0902REAL;

import java.util.Math;

public class Circle extends GeometricObject {

    double radius;

    public Circle()
    {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    protected double getPerimeter() {
        double peri = Math.PI*this.radius*2;
        return Math.round(peri*100)/100.0;
    }

    @Override
    protected double getArea() {

        double area = Math.PI*this.radius*this.radius;

        return Math.round(area*100)/100.0;

    }



}
