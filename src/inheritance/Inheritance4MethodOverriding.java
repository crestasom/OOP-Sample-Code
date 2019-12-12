package inheritance;

public class Inheritance4MethodOverriding {
	public static void main(String args[]) {
		Bike2 obj = new Bike2();// creating object
		obj.run();// calling method
	}
}

//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
class Vehicle {
//defining a method  
	void run() {
		System.out.println("Vehicle is running");
	}
}

//Creating a child class  
class Bike2 extends Vehicle {
//defining the same method as in the parent class  
	// must have same signature
	
	
	void run(int n) {
		/*
		 * super.run(); //uncomment this to observe Output
		 */	
		System.out.println("Bike is running safely");
		super.run();
	}
	
	void test() {
		super.run();
	}

}