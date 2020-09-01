package exception;

public class ExceptionHandlingEx5Finally {

	public static void main(String[] args) {
		try {
			int x[] = null;
			System.out.println(x[2]);
		} finally {
			System.out.println("Finally Code ");
		} 
	}
}
