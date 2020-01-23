package polymorphism;

public class PolymorphismExample1 {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(3.4, 5.4);
		Shape s2 = new Square(4.5);

		System.out.println(s1.getArea());
		System.out.println(s2.getArea());
		// System.out.println(s2.getSide());
	}
}

class Shape {
	public double getArea() {
		return 0.0;
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

	/*
	 * public double getArea() { return length*width; }
	 */

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