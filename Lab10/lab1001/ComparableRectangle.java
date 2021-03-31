package lab1001;

public class ComparableRectangle extends Rectangle {

    public ComparableRectangle() {
        super();
    }

    @Override
    public int compareTo(GeometricObject o) {

        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }

    }

}
