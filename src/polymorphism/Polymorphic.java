package polymorphism;

public class Polymorphic {
	public static void main(String[] args) {
		Animal a=new Dog();
		a.move();
	}

}

class Animal{
	public void move() {
		System.out.println("Animal have different move");
	}
}

class Dog extends Animal{
	public void move() {
		System.out.println("Dog Moves Very fast..");
	}
}