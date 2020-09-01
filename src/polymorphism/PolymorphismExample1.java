package polymorphism;

import java.util.Scanner;

public class PolymorphismExample1 {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(3.4, 5.4);
		Shape s2 = new Square(4.5);
		int x;
		Shape s;
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		if (ch == 1) {
			s = new Rectangle(3.4, 5.4);
		} else {
			s = new Square(4.5);
		}
		s.getArea();
		System.out.println(s1.getArea());
		System.out.println(s2.getArea());
		// System.out.println(s.getShape());
		// System.out.println(s2.getSide());

		TestClass.add(2, 4);
		TestClass.add(1, 2, 3);
	}
}

class TestClass {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}
}

abstract class Shape {
	public abstract double getArea();

	public void printArea() {
		System.out.println(getArea());
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public void test() {

	}

	public double getArea() {
		return length * width;
	}

}

class Square extends Shape {
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square(double side) {
		this.side = side;
	}

	public double getArea() {
		return side * side;
	}
}