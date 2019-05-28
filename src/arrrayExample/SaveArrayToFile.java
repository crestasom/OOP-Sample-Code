package arrrayExample;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveArrayToFile {

	public static void main(String[] args) throws FileNotFoundException {
		int[] numbers = {10, 20, 30, 40, 50};

		PrintWriter outputFile = 
		     new PrintWriter ("Values.txt");

		for (int i = 0; i < numbers.length; i++)
		  outputFile.println(numbers[i]);

		outputFile.close();
	}
}
