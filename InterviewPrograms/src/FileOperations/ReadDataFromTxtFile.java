package FileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadDataFromTxtFile {

	public static void main(String[] args) throws Exception {

		// Approach 1
		FileReader fr = new FileReader("./TestData/file.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();

		// Approach 2
		File file = new File("./TestData/file.txt");
		Scanner sc = new Scanner(file);
		/*
		 * while (sc.hasNextLine()) { System.out.println(sc.nextLine()); }
		 */
		
	
		//Approach 3
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		sc.close();
	}
		
		
}
