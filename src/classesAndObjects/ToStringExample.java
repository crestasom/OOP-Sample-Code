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

	/*
	 * Uncomment this method to see output
	 * public String toString() { return "Value are [x=" + x + ", y=" + y + ", z=" +
	 * z + "]"; }
	 */

}