package lab0902REAL;

import java.util.ArrayList;

public abstract class GeometricObject {

    protected boolean isFilled = false;
    protected String color = "";

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

    public static double sumArea(ArrayList<GeometricObject> arr) {
        double result = 0;
        if (arr.size() == 0)
            return 0;

        for (int i = 0; i < arr.size(); i++) {

            result += arr.get(i).getArea();
        }

        return result;
    }

}
