package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("demo.txt");
			writer.write("Hello");
			writer.write(5 / 0);

		} catch (IOException ex) {

		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
