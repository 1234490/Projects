class Parent {
  public void output() {
    System.out.println("This is the parent class.");
  }
}

class Child extends Parent {
  @Override
  public void output() {
    System.out.println("This is the child class.");
  }
}

public class JTD1_Polymorphism {
  public static int total(int x, int y) {
	  return x + y;
  }
  
  public static double total(double x, double y) {
	  return x + y;
  }
  
  public static void main(String[ ] args) {
	  // Overloading.
	  System.out.println(total(2, 3));
	  System.out.println(total(2.1, 3.2));
    
	  // Overriding
      Parent p = new Parent();
      p.output();
      Child c = new Child();
      c.output();
  }
} 