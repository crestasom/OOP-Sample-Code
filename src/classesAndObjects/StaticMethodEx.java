package classesAndObjects;

public class StaticMethodEx {

	public static void main(String[] args) {
		display(); //inside same class, no need to write class name
		AnotherClass.hello(); // method from another class, Need to specify the class name
	}
	
	public static void display() {
		System.out.println("Hello world from Main Class");
	}
}

class AnotherClass{
	public static void hello() {
		System.out.println("Hello world from Another Class");
	}
}
