package exception;

import java.util.Scanner;

public class ExceptionHandlingEx2MultipleCatchBlock {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter value of a and b");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a / b);
		}
	}
}
