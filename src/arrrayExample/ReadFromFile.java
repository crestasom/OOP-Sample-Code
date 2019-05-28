package arrrayExample;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		final int SIZE = 5; // Assuming we know the size.
		int[] numbers = new int[SIZE]; 
		int i = 0;
		File file = new File ("Values.txt");
		Scanner inputFile = new Scanner(file);
		while (inputFile.hasNext() && i < numbers.length)
		{
		  numbers[i] = inputFile.nextInt();
		  i++;
		}
		inputFile.close();
		
		for(int num:numbers)
		{
			System.out.println(num);
		}
	}
}
