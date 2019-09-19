package Day2;
import java.util.*;
import java.io.*;

//abstract class 
abstract class Shape_1 { 
	// declare fields 
	String objectName = " "; 
   
 	Shape_1(String name) {
 		this.objectName = name; 
 	} 
   
 	// declare non-abstract methods 
 	// it has default implementation 
 	public void moveTo(int x, int y) {
 		System.out.println(this.objectName + " " +
		"has been moved to" + " x = " + x + " and y = " + y); 
 	} 
   
 	// abstract methods which will be 
 	// implemented by its subclass(es) 
 	abstract public double area(); 
 	abstract public void draw(); 
}

interface Shape_2 { 
	// abstract method 
	void draw(); 
	double area(); 
}

class Rectangle extends Shape_1 { 
	int length, width; 
	// constructor 
	Rectangle(int length, int width, String name) { 
		super(name); 
		this.length = length; 
		this.width = width; 
	} 
   
	@Override
	public void draw() { 
		System.out.println("Rectangle has been drawn");  
	} 
   
	@Override
	public double area() { 
		return (double) (length * width); 
	} 
}

class Circ implements Shape_2 { 
	 double pi = 3.14; 
	 int radius; 
	   
	 //constructor 
	 Circ(int radius) {
	     this.radius = radius; 
	 } 
	   
	 @Override
	 public void draw() { 
	     System.out.println("Circle has been drawn ");  
	 } 
	   
	 @Override
	 public double area() { 
		 return (double)((pi*radius*radius)/2); 
	 }
}

public class AbstractVsInterface {
	public static void main(String[] args) {
		// creating the Object of Rectangle class 
	    // and using shape class reference. 
	    Shape_1 rect = new Rectangle(2,3, "Rectangle"); 
	    System.out.println("Area of rectangle: " + rect.area()); 
	    rect.moveTo(1,2); 
	      
	    System.out.println(" "); 
	       
	    // creating the Objects of circle class 
	    Circ circle = new Circ(2); 
	    System.out.println("Area of circle: " + circle.area());
	}  
}