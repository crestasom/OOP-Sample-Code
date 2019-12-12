package inheritance;

public class ProtectedMemberExample extends SuperClass {

	int y;
	public static void main(String[] args) {
		SubClass c = new SubClass();
		c.test();
		System.out.println(c.getX());
		System.out.println(c.x);
	}
}

class SuperClass {
	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}

class SubClass extends SuperClass {
	public void test() {
		setX(10);
		x = 20;
	}
}