package exception;

public class ExceptionHandlingEx4 {

	public static void main(String[] args) {
		try {
			method2();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("End of Method Main");
	}

	private static void method1() {
		// TODO Auto-generated method stub
		int[] x = null;
		x[5] = 10;
		System.out.println("End of Method 1");
	}

	public static void method2() {
		method1();
		System.out.println("End of Method 2");
	}
}
