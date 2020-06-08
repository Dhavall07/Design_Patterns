package Creational;
public class Main {
    public static void main(String args[]) {
        FactoryColor factoryColor = new FactoryColor();
        Color c1 = factoryColor.getColor("RED");
        c1.printHello();

        Color c2 = factoryColor.getColor("GREEN");
        c2.printHello();
    }
}