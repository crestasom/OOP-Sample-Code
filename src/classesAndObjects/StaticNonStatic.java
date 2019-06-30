package classesAndObjects;

public class StaticNonStatic {

	public static void main(String[] args) {
		/*
		 * display();// invalid!! cannot call non static method from static one.
		 */		
		StaticNonStatic sns=new StaticNonStatic();
		sns.display();
	}
	
	public void display() {
		System.out.println("Hello From Display method");
	}
}
