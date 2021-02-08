package lab0502;

import java.lang.Math;
public class RegularPolygon {
    private int n = 3; // The number of sides in the polygon with default value 3.
    private double side= 1; // The Length of the size with dafault value 3.
    private double x = 0; // X - Coordinate.
    private double y = 0; // Y - Coordinate.


    //Contructors
    public RegularPolygon()
    {
    }
    public RegularPolygon(int n , double side)
    {
        this.side = side;
        this.n = n;
    }
    public RegularPolygon(int n, double side, double x ,double y)
    {   
        if(n < 3)
        {
            n = 3;
        }
        if(side < 0)
        {
            side = Math.abs(side);
        }
        this.n = n;
        this.side= side;
        this.x = x;
        this.y = y;
    }

        // Accessor
    public int getN() {
        return n;
    }public double getSide() {
        return side;
    }public double getX() {
        return x;
    }public double getY() {
        return y;

        // Modifiers 
    }public void setN(int n) {
        this.n = n;
    }public void setSide(double side) {
        this.side = side;
    }public void setX(double x) {
        this.x = x;
    }public void setY(double y) {
        this.y = y;
    }

        //Medthods
    public double getPerimeter()
    {
        return this.n*this.side;
    }
    public double getArea()
    {
        double result = (this.n*this.side*this.side)/(4.0*Math.tan(Math.PI/(double)this.n));
        result = Math.round(result*1000.0)/1000.0;
        return result;
    }
    public void log()
    {
        System.out.println("Perimeter is " + getPerimeter());
        System.out.println("Area is " + getArea());
        System.out.println("X-Position is : " + getX() );
        System.out.println("Y-Position is : " + getY());
    }
    
}
