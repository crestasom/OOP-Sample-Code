package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriterExample {
//	public static void main(String[] args) {
//		FileWriter writer = null;
//		try {
//			writer = new FileWriter("demo.txt");
//			writer.write("Hello");
//			writer.write(5 / 0);
//
//		} catch (IOException ex) {
//
//		} finally {
//			try {
//				writer.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}

	//File writing using FileWriter
//	public static void main(String[] args) throws Exception {
//
//		System.out.println("Enter your name:");
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		FileWriter writer = new FileWriter("demo.txt", true);
//		writer.write(name);
//		writer.write("\n");
//		writer.close();
//
//	}
	//File writing using PrintWriter
	public static void main(String[] args) throws Exception {

		System.out.println("Enter your name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		FileWriter writer = new FileWriter("c:/test/demo.txt", true);
		PrintWriter pw=new PrintWriter(writer);
		//writer.write(name);
		//writer.write("\n");
		pw.printf("The name of user is %s",name);
		pw.close();
		writer.close();

	}

	/*
	 * //try with resources example //need not to close the resource public static
	 * void main(String[] args) { try (FileWriter writer = new
	 * FileWriter("demo.txt")) { writer.write("Hello World"); writer.write(5 / 0);
	 * 
	 * } catch (IOException ex) {
	 * 
	 * } }
	 */
}
