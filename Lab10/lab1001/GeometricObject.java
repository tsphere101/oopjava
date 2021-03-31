package lab1001;

import java.util.ArrayList;
import java.lang.Comparable;

public abstract class GeometricObject implements Comparable<GeometricObject> {

    protected boolean isFilled = false;
    protected String color = "";
    protected double weight = 0;

    protected abstract double getPerimeter();

    protected abstract double getArea();

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    boolean isFilled() {
        return this.isFilled;
    }

    String getColor() {
        return this.color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static double sumArea(ArrayList<GeometricObject> arr) {
        double result = 0;
        if (arr.size() == 0)
            return 0;

        for (int i = 0; i < arr.size(); i++) {

            result += arr.get(i).getArea();
        }

        return result;
    }

    public static GeometricObject max(GeometricObject a, GeometricObject b)
    {
        if(a.getArea() > b.getArea())
        {
            return a;
        }
        else return b;
    }

}
