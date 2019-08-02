package interfaceCode;

public class InterfaceExample2 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(3.4, 4.3);
		System.out.println(r.area());
	}
}

interface Shape {
	double area();
}

class Rectangle implements Shape {

	double len, wid;
	double area;

	public Rectangle(double len, double wid) {
		super();
		this.len = len;
		this.wid = wid;
	}

	@Override
	public double area() {
		return len * wid;

	}

}