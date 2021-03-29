package DesignPattern.FactoryDesignPattern.InnerFactory;

public class Point {

    double x, y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    static class Factory {
        public static Point cartesianCoordinates(double x, double y) {
            return new Point(x, y);
        }

        public static Point polarCoordinates(double x, double y) {
            return new Point(x * Math.cos(y), x * Math.sin(y));
        }
    }

    public static void main(String[] args) {
        Point point = Point.Factory.cartesianCoordinates(1, 2);
    }
}

