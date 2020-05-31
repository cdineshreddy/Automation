package FileOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTxtFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("./TestData/filewrite.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hello, Welcome to Selenium");
		bw.newLine();
		bw.write("How are you");
		System.out.println("Finished.....");
		bw.close();
	}

}
