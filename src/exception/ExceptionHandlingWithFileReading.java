package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingWithFileReading {
//using file reader
//	public static void main(String[] args) throws IOException {
//		FileReader fr = new FileReader("hello.txt");
//		int n;
//		// fr.read method reads char by char and returns ascii value of the read
//		// character
//		// it also automatically points to next character when current character is read
//		// it returns -1 when End of File(EOF) is reached
//		while ((n = fr.read()) != -1) {
//			System.out.print((char) n);
//		}
	// fr.close();
//	}
	// using buffered reader class
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("hello.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		// buffered reader is handy when we need more sophisticated method to read data
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		br.close();
		fr.close();
	}
}
