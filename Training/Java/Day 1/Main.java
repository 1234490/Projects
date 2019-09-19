package Geometry4;
import java.util.Scanner;

public class Main {

    private static Cylinder create() {
        double r,  h;
        Cylinder cup = new Cylinder();
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter the Radius: ");
        r = scnr.nextDouble();
        System.out.print("Enter the Height: ");
        h = scnr.nextDouble();
        
        cup.setRadius(r);
        cup.setColor("Yellow");
        cup.setHeight(h);
        scnr.close();
        
        return cup;
    }
    
    private static void show(Cylinder cyl) {
        System.out.println("\nCylinder Characteristics");
        System.out.printf("Radius:       %f\n", cyl.getRadius());
        System.out.printf("Color:        %s\n", cyl.getColor());
        System.out.printf("Height:       %f\n", cyl.getHeight());
        System.out.printf("Base Area:    %f\n", cyl.calculateArea());
        System.out.printf("Lateral Area: %f\n",
                cyl.calculateLateralArea());
        System.out.printf("Total Area:   %f\n",
                cyl.calculateTotalArea());
        System.out.printf("Volume:       %f\n", cyl.calculateVolume());  
    }
    
    public static void main(String[] args) {
        Cylinder tube = create();
        show(tube);
    }

}