package arrayExample;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteArray {

	public static void main(String[] args) throws FileNotFoundException {
		int[] numbers = {10, 20, 30, 40, 50};

		PrintWriter outputFile = 
		     new PrintWriter ("Values.txt");

		for (int i = 0; i < numbers.length; i++)
		  outputFile.println(numbers[i]);

		outputFile.close();

	}
}
