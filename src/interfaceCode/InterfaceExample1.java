package interfaceCode;

public class InterfaceExample1 {
	public static void main(String[] args) {
		int [] a =new int[4];
		Pig[] pArray=new Pig[4];
		pArray[0]=new Pig();
		pArray[0].animalSound();
		
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		myPig.eat();
		Dog myDog = new Dog(); // Create a Pig object
		myDog.animalSound();
		myDog.sleep();
		myDog.eat();
	}
}

interface Animal {
	void animalSound(); // interface method (does not have a body)

	void sleep(); // interface method (does not have a body)

	void eat();
}

//Pig "implements" the Animal interface
class Pig implements Animal {

	public void animalSound() { // The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}

	public void sleep() { // The body of sleep() is provided here
		System.out.println("Zzz");
	}

	public void eat() {
		System.out.println("Pig eats grass");
	}

}

class Dog implements Animal {
	public void animalSound() {
		System.out.println("Vaw Vaw");
	}

	public void sleep() {
		System.out.println("zzzzzzz");
	}

	public void eat() {
		System.out.println("dog eats meat");
	}

}

interface A {
	void a();
}

interface B extends A {
	void a();
}

interface C extends A {
	void a();

}

class D implements B,C{
	public void a() {
		
	}
	
}




