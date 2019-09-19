class Anima {
	String name;
	
	public Anima(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

class Do extends Anima {
	String species;
	
	public Do(String name) {
		super(name);
		this.species = "Dog";
	}
}

public class JTD1_Encapsulation {
	public static void main(String[] args) {
		// Encapsulation.
		Do a1 = new Do("Doggy");
		a1.setName("New Doggy");
		System.out.println(a1.getName());
	}
}