package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			try {
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
					System.out.println(num1 / num2);

					break;
				case 4:
					flag = false;
					break;
				default:
					System.out.println("Invalid Input");
				}
			} catch (ArithmeticException ex) {
				System.out.println("Cannot divide by zero");
			} catch (InputMismatchException ex) {
				System.out.println("Please input intger");
				sc.nextLine();
			}
		}
		sc.close();
	}

}
