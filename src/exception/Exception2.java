package exception;

public class Exception2 {

	public static void main(String[] args) {
		System.out.println(divide(19, 0));
	}

	public static int divide(int a, int b) {
		try {
			//return a / b;
			throw new NullPointerException("mannualy thown exception");
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
			//ex.printStackTrace();
		} finally {
			System.out.println("in finally block. This block will always execute");
		}
		return -1;
	}
}
