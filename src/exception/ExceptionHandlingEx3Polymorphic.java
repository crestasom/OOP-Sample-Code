package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingEx3Polymorphic {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Enter value of a and b");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a / b);
			} catch (InputMismatchException ex) {
				System.out.println("Exception occured");
				sc.nextLine();
			} catch (Exception ex) {

			}
		}
	}
}
