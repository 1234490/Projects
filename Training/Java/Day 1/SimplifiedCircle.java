public class SimplifiedCircle {
    protected double radius = 1.00;
    
    public SimplifiedCircle() {}
    
    public SimplifiedCircle(double radius) {
    	this.radius = radius;
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
    
    public double getArea() {
    	return Math.pow(Math.PI * radius, 2);
    }
    
    public double getCircumference() {
    	return 2 * radius * Math.PI;
    }
}