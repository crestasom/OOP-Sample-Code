package inheritance;

public class Inheritance2DefaultConstructor {
	public static void main(String[] args) {
		Child child=new Child();
	}

}

class Parent{
	public Parent() {
		System.out.println("Inside Parent Constructor");
	}
}

class Child extends Parent{
	public Child() {
		System.out.println("Inside Child Constructor");
	}
	
}