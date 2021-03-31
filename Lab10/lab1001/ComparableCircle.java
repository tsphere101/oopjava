package lab1001;

public class ComparableCircle extends Circle {

    public ComparableCircle() {
        super();
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        }

        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

}
