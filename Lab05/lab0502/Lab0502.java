package lab0502;

public class Lab0502 {
    public static void main(String[] args) {
        
        RegularPolygon first = new RegularPolygon();
        RegularPolygon second = new RegularPolygon(6,4);
        RegularPolygon third = new RegularPolygon(10,4,5.6,7.8);


        // Printing First Polygon's Perimeter and Area
        System.out.println("Perimeter = " + first.getPerimeter());
        System.out.println("Area = " + first.getArea());

        // Printing Second Polygon's Perimeter and Area
        System.out.println("Perimeter = " + second.getPerimeter());
        System.out.println("Area = " + second.getArea());

        // Printing Third Polygon's Perimeter and Area
        System.out.println("Perimeter = " + third.getPerimeter());
        System.out.println("Area = " + third.getArea());
    }
    
}
