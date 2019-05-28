package inheritance;

public class Inheriatnce6toStringMethodExample2 {
public static void main(String[] args) {
	Rectangle r=new Rectangle(4, 5);
	System.out.println(r);
}
}

class Rectangle{
	private int x;
	private int y;
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Rectange [x=" + x + ", y=" + y + "]";
	}
}