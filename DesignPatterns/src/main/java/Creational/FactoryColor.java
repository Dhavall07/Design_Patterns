package Creational;


public class FactoryColor {
    public Color getColor(String stype) {
        if(stype==null) return null;
        else if(stype.equalsIgnoreCase("RED")) {
            return new Red();
        }
        else if(stype.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }
}