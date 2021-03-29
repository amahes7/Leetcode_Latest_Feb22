package DesignPattern.FactoryDesignPattern;

public class Point {
    double x,y;
    private Point(double x, double y){
        this.x =x;
        this.y =y;
    }

    public static Point cartesianCoordinates(double x,double y){
        return new Point(x,y);
    }

    public static Point polarCoordinates(double a,double b){
        return new Point(a*Math.cos(b),a*Math.sin(b));
    }

    public static void main(String[] args){
        Point point= Point.cartesianCoordinates(1,2);
    }

}




