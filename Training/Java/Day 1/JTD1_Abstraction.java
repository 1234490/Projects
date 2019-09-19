abstract class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Dog extends Animal {
	String species;
	
	public Dog(String name) {
		super(name);
		this.species = "Dog";
	}
}

public class JTD1_Abstraction {
	public static void main(String[] args) {
		// Abstraction.
		Animal a1 = new Dog("Doggy");
		System.out.println(a1.getName());
	}
}