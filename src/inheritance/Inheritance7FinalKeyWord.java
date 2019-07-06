package inheritance;

public class Inheritance7FinalKeyWord {

}
class Super1{
	public final void finalMethod() {
		System.out.println("This is final method in Superclass");
	}
}

class Sub1 extends Super1{
	/*
	 * uncommenting this will generate error
	 * public void finalMethod() {
	 * System.out.println("This is final method in Subclass"); }
	 */
}