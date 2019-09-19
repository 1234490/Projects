class X {
	public String s = "Class A";
	
	public X() {
		System.out.println("3");
	}
}

class Y extends X {
	public String s = "Class B";
	
	public Y() {
		System.out.println("2");
	}
}

class Z extends Y {
	String s = "Class C";
	
	public Z() {
		System.out.println("1");
	}
}

public class Test {
	public static void main(String[] args) {
		//Y y = new Y();
		//System.out.println(y.i);
		Z z = new Z();
	}
}