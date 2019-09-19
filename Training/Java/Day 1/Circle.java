public class Circle {
    protected double radius = 1.00;
    protected String color = "red";
    
    public Circle() {}
    
    public Circle(double radius) {
    	this.radius = radius;
    }
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius() {
    	return radius;
    }

    public void setRadius(double value)  {
        if( radius < 0 ) {
        	radius = 0.00;
        } else {
        	radius = value;
        }
    }
    
    public String getColor() {
    	return color;
    }
    
    public void setColor(String color) {
    	this.color = color;
    }
    
    public double getArea() {
    	return Math.pow(Math.PI * radius, 2);
    }
    
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
}