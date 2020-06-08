package Creational;

public class SingletonClass {
    static SingletonClass object = new SingletonClass();

    SingletonClass() {}

    public static SingletonClass getInstance() {
        return object;
    }

    public void print() {
        System.out.println("Single instance of class");
    }
}