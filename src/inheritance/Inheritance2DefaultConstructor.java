package inheritance;

public class Inheritance2DefaultConstructor {
	public static void main(String[] args) {
		Child child = new Child(10);
		// XSystem.out.println(child);
	}

}

class Parent {

	public Parent(int x) {
		System.out.println("Inside Parent Constructor");
	}

//	public Parent(int x) {
//
//	}
}

class Child extends Parent {

	public Child(int x) {
		super(10);
		System.out.println("Inside Child Constructor");
		
	}

}