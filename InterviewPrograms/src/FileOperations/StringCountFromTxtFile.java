package FileOperations;

import java.io.BufferedReader;
import java.io.FileReader;

public class StringCountFromTxtFile {

	public static void main(String[] args) throws Exception{
		
		FileReader fr=new FileReader("./TestData/file.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		int count=0;
		
		while ((line = br.readLine()) != null) {
			String str=line.replaceAll("[.,?]", "");
			String word[]=str.split(" ");
			count = count+word.length;
		}
		System.out.println(count);
		br.close();
	}

}
