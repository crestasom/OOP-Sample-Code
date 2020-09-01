package exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExceptionHandlingWithFileWriting {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		FileWriter writer = new FileWriter("hello.txt", true);
		// specify the location of the file using absolute path
		// FileWriter writer = new FileWriter("e:/hello.txt", true);

		// print writer added functionality to the file writer class. gives
		// println,printf method which is more handy for developers
//		PrintWriter pr = new PrintWriter(writer);
//		pr.printf("Hello %s\n", name);
//		pr.close();
		writer.write(name + "\n");
		writer.close();
	}
}
