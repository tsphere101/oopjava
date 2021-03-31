package lab1001;

public class Rectangle extends GeometricObject {

    private double a;
    private double b;

    public Rectangle() {

    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;

    }

    @Override
    protected double getPerimeter() {
        double peri = 2 * a + 2 * b;
        return peri;
    }

    @Override
    protected double getArea() {
        double area = this.a * this.b;
        return area;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else
            return 0;
    }

}
