package Trial1.Factory;

public class test {

    public static void main(String[] args){
        ShapeFacotry shapeFactory = new ShapeFacotry();
        Shape r = shapeFactory.getShape("r");
        Shape r1 = shapeFactory.getShape("a");
        r.draw();
        r1.draw();
    }
}
