package polymorphism;

public class PolymorphismExample2 {

	public static void main(String[] args) {
		Shape1 s1=new Rectangle1(3.4,5.4);
		Shape1 s2=new Square1(4.5);
		System.out.println(s1.getArea());
		System.out.println(s2.getArea());
	}
}

abstract class Shape1 {
	public double getArea() {
		return 0.0;
	}

}

class Rectangle1 extends Shape1{
	private double length;
	private double width;
	public Rectangle1(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		return length*width;
	}
	
}

class Square1 extends Shape1{
	private double side;
	
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square1(double side) {
		this.side=side;
	}
	
	public double getArea() {
		return side*side;
	}
}