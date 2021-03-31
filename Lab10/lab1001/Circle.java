package lab1001;

import java.lang.Math;

public class Circle extends GeometricObject implements Cloneable<Circle>{

    double radius;
    String color;
    double weight;


    public Circle() {

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
        double peri = Math.PI * this.radius * 2;
        return Math.round(peri * 100) / 100.0;
    }

    @Override
    protected double getArea() {

        double area = Math.PI * this.radius * this.radius;

        return Math.round(area * 100) / 100.0;

    }

    @Override
    public int compareTo(GeometricObject o) {

        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        }
        else
            return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // Circle result = new Circle();

        // result = this.clone();

        // result.setColor(this.getColor());
        // result.setFilled(this.isFilled());
        // result.setRadius(this.getRadius());



        return super.clone();
    }

    public boolean equals(Circle obj) {
        if(obj.getArea() == this.getArea())
        return true;
        else return false;
    }

}
