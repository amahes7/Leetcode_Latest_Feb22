package OlderPackage.Random;

public class Singleton {

    private static Singleton singleton_instance = null;

    public static Singleton getInstance(){
        if(singleton_instance != null) return singleton_instance;
        return  singleton_instance;
    }

}
