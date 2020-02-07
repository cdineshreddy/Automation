package InterviewPrograms;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OopsConcept1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw=new PrintWriter("G:\\Selenium\\test.txt");
		pw.write("hello h r u");
		pw.close();
	}
}
