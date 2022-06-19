package oops.polymorphism;

//super class/parent class
class Bank {
	public void getLoanInterest() {
		System.out.println("8% interest Rate!");
	}
}// End Bank class

//child 1
class SBI extends Bank {
	public void creatAccount() {// overriden method
		System.out.println("Account created");
	}

	// overriding
	public void getLoanInterest() {// overriden method
		System.out.println("6.75% interest Rate!");
	}

}

//child 2
class HDFC extends Bank {
	// overriding
	public void getLoanInterest() {
		System.out.println("9% interest Rate!");
	}
}

//child 3
class Axis extends Bank {
	// overriding
	public void getLoanInterest() {// overriden method
		System.out.println("12% interest Rate!");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		/*
		 * SBI sbi = new SBI(); sbi.getLoanInterest();
		 * 
		 * HDFC hdfc = new HDFC(); hdfc.getLoanInterest();
		 * 
		 * Axis axis = new Axis(); axis.getLoanInterest();
		 */

		// upcasting
		Bank bank;// Reference variable of parent type
		bank = new SBI();// object is creating child type of Bank
		bank.getLoanInterest();

		bank = new HDFC();
		bank.getLoanInterest();

		bank = new Axis();
		bank.getLoanInterest();

	}
}
