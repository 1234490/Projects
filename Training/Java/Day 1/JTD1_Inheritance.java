public class JTD1_Inheritance {
  public static int total(int x, int y) {
    return x + y;
  }
  
  public static double total(double x, double y) {
    return x + y;
  }
  
   public static void main(String[ ] args) {
    System.out.println(total(2, 3));
    System.out.println(total(2.1, 3.2));
    
    // Inheritance.
    Parent p = new Parent();
    p.output();
    Child c = new Child();
    c.output();
  }
}