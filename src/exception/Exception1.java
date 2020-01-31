package exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("1. Add\n2. Multiply\n3.Divide\n4.Exit");
			int ch = sc.nextInt();
			System.out.println("Enter two number:");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println(num1 + num2);
				break;
			case 2:
				System.out.println(num1 * num2);
				break;
			case 3:
				try {
					System.out.println(num1 / num2);
				} catch (InputMismatchException ex) {
					System.out.println(ex.getMessage());
				}
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
		sc.close();
	}

}
