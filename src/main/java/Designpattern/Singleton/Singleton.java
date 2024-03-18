package Designpattern.Singleton;
public class Singleton {
    private static Singleton instance;
    private Singleton (){}
    public  void useSingleton(){
        System.out.println("get a Singleton.");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}