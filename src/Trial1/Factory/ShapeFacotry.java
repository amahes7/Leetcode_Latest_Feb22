package Trial1.Factory;

public class ShapeFacotry {

    public Shape getShape(String type){
        if(type.equals("r")) return new Rectangle();
        else return new Square();
    }
}
