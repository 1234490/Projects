package Geometry4;

public class Cylinder extends Circle {
    private double height;
    
    public Cylinder() {
        
    }

    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateLateralArea() {
        return 2 * 3.14159 * radius * height;    
    }

    public double calculateTotalArea() {
        return 2 * 3.14159 * radius * (height + radius);
    }

    public double calculateVolume() {
        return 3.14159 * radius * radius * height;
    }
}