package classesAndObjects;

public class ToStringExample {
	public static void main(String[] args) {
		XYZ x = new XYZ();
		x.setX(3);
		x.setY(4);
		x.setZ(5);
		System.out.println(x);
	}
}

class XYZ {
	private int x, y, z;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	
	public String toString() {
		return "value of x=" + x + ", value of y=" + y + ", value of z=" + z + "]";
	}

	

}