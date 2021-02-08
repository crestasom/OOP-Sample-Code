package polymorphism;

import java.util.Scanner;

public class Polymorphic {
	public static void main(String[] args) {
		Animal a = new Dog();
		Animal a2 = new Cat();
		Animal a1 = new Animal();
		a1.eat();
		a1.eat("Grass");
		// System.out.println(a.getClass());
		// System.out.println(a1.getClass());
		Animal a22;
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x == 1) {
			a22 = new Animal();
		} else if (x == 2) {
			a22 = new Dog();
		} else {
			a22 = new Cat();
		}
		a22.move();
		a.move();
		a.eat();
		a2.move();
		a2.eat();
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

	public void eat(String food) {
		System.out.println("Animal is eating " + food);
	}

}

class Dog extends Animal {

	public void move() {
		System.out.println("Dog Moves Very fast..");
	}
}

class Cat extends Animal {

}