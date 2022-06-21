package oops.inheritance;

//Parent class
class Animal {
	// overriden method
	public void eat() {
		System.out.println("eating");
	}

	// overriden method
	public void sleep() {
		System.out.println("sleeping");
	}

	// overriden method
	public void fly() {
		System.out.println("Bird is flying in the sky.");
	}

}

//child class
class Bird extends Animal {

	// overriding method
	public void eat() {
		System.out.println("Bird is eating something.");
	}

	// overriding method
	public void sleep() {
		{
			System.out.println("Bird is sleep in their own nest.");
		}
	}

}

public class InheritenceAssignment1 {

	public static void main(String[] args) {
		Bird bird = new Bird();
		// invoking objects
		bird.eat();
		bird.sleep();
		bird.fly();

	}

}
