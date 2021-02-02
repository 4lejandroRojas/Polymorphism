package polymorphism;

/**
 * Dog is child class of {@link Animal}
 * @author 4lejandroRojas
 *
 */
public class Dog extends Animal{
	@Override //It is not mandatory, but it is a good practice.
	public void move() {
		System.out.println("Dog is moving and running");
	}
}
