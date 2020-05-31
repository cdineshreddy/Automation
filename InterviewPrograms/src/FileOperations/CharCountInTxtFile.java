package FileOperations;

import java.io.BufferedReader;
import java.io.FileReader;

public class CharCountInTxtFile {

	public static void main(String[] args) throws Exception{
		
		FileReader fr=new FileReader("./TestData/file.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		int charCount=0;
		while ((line = br.readLine()) != null) {
			String c=line.replaceAll("[^A-Za-z0-9]", "");
			charCount = charCount + c.length();
		}
		System.out.println(charCount);
		br.close();
	}

}
