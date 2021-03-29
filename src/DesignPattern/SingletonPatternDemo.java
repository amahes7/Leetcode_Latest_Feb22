package DesignPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
//        Singleton object = new Singleton();

        //Get the only object available
        Singleton obj = Singleton.getInstance();
        //show the message
        obj.showMessage();

    }
}

