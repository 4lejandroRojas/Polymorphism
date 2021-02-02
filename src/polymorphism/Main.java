package polymorphism;

public class Main {
	public static void main(String []args) {
		
		//Static polymorphism. Erros are resolved at compile-time. --> Overloading.
		Animal animal = new Animal();
		animal.breath(); 
		animal.breath("air");
		
		//Dynamic polymorphism. Errors can only determined at run-time. --> Overriding
		Animal dog = new Dog();
		dog.move();
	}
	
	/*
		Output:
		Animal is just breathing...
		Animal is breathing but needs air to breah
		Dog is moving and running
	 */
}
