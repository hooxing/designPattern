package Designpattern.Singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.useSingleton();
    }
}