package lab0901REAL;

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

}
