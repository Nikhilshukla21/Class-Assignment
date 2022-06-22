package oops.inheritance;

//Parent class
class Animal {
	// overriden method
	public void eat() {
		System.out.println("eating!");
	}

	// overriden method
	public void sleep() {
		System.out.println("sleeping!");
	}

}

//child class
class Bird extends Animal {

	// overriding method
	public void eat() {
		System.out.println("Bird is eating something!");
	}

	// overriding method
	public void sleep() {
		{
			System.out.println("Bird is sleep in their own nest!");
		}
	}

	// new method
	public void fly() {
		System.out.println("Bird is flying in the sky!");
	}

}

public class InheritenceAssignment1 {

	public static void main(String[] args) {
		// invoking parent class
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();

		// invoking child class
		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();

	}

}
