package inheritance;

public class Inheritance4MethodOverridingSuperKeyword {
	public static void main(String[] args) {
		Bike3 b3=new Bike3();
		b3.run();
	}

}
//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
class Vehicle1 {
//defining a method  
	void run() {
		System.out.println("Vehicle is running");
	}
}

//Creating a child class  
class Bike3 extends Vehicle1 {
//defining the same method as in the parent class  
	// must have same signature
	void run() {
		//super.run();
		System.out.println("Bike is running safely");
	}

}
