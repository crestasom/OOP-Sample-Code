package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
//using file reader
//	public static void main(String[] args) throws IOException {
//		FileReader fr = new FileReader("c:\\test\\demo.txt");
//
//		// fr.read method reads char by char and returns ascii value of the read
//		// character
//		// it also automatically points to next character when current character is read
//		// it returns -1 when End of File(EOF) is reached
//		int n; // Hello World
//		while ((n = fr.read()) != -1) {
//			System.out.print((char) n);
//			// n = fr.read();
//		}
//		fr.close();
//	}

//	// using buffered reader class
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("c:\\test\\numbers.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		// buffered reader is handy when we need more sophisticated method to read data
		s = br.readLine();
		String[] nums = s.split(" ");
		for (String num : nums) {
			int n = Integer.parseInt(num);
			// names[i++]=s;
			System.out.println(n);
		}
		

		br.close();
		fr.close();
	}
// using Scanner class
//	public static void main(String[] args) throws IOException {
//		FileReader fr = new FileReader("C:\\test\\numbers.txt");
//		Scanner sc = new Scanner(fr);
//		String s;
//		while (sc.hasNextInt()) {
//			int n = sc.nextInt();
//			System.out.println(n);
//		}
//		sc.close();
//	}
}
