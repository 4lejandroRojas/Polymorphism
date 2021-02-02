package polymorphism;

/**
 * This is a parent class.
 * @author 4lejandroRojas
 *
 */
public class Animal {
	private String name;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public Animal() { }
	
	public Animal(String name) { //Constructor overloading is also an static polymorphism type.
		this.name = name;
	}
	
	public void breath() {
		System.out.println("Animal is just breathing...");
	}
	
	public void breath(String element) { //Overloading is an static polymorphism type.
		System.out.printf("Animal is breathing but needs %s to breah\n", element);
	}
	
	public void move() {
		System.out.println("Animal is moving");
	}
}
