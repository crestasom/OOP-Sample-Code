package polymorphism;

public class Polymorphic {
	public static void main(String[] args) {
		Animal a = new Dog();
		Animal a2 = new Cat();
		Animal a1 = new Animal();
		System.out.println(a.getClass());
		System.out.println(a1.getClass());
		Dog d = new Dog();
		d.move();

		// a.move();
		// a.eat();
		// d.move();
	}

}

class Animal {

	public void move() {
		System.out.println("Animal have different move");
	}

	public void eat() {
		System.out.println("Animal is eating");
	}

}

class Dog extends Animal {

	public void move() {
		System.out.println("Dog Moves Very fast..");
	}
}

class Cat extends Animal {

}