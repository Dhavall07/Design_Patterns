package Structural;

public class ColorPicker {
    private Color red;
    private Color green;

    public ColorPicker() {
        red = new Red();
        green = new Green();
    }

    public void drawRed() {
        red.printHello();
    }

    public void drawGreen() {
        green.printHello();
    }
}