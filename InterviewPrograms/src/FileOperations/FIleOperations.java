package FileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FIleOperations {

	static String line;
	static int charCount = 0;
	static int paragraph=0;
	static int wordCount=0;
	static int sentenceCount=0;

	public static void main(String[] args) throws IOException {

		File file = new File("./TestData/file.txt");
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fis);
		BufferedReader reader = new BufferedReader(input);

		// Reading line by line from the file until null is returned
		while ((line = reader.readLine()) != null) {

			// Counting the characters in a file
			if (!(line.equals(""))) {
				charCount = charCount + line.length();
				
				String[] wordList=line.split("\\s+");
				wordCount=wordCount+wordList.length;
				for(String wordName:wordList) {
					System.out.println(wordName.replaceAll("[,.?]", ""));
				}
				
				String[] sentenceList=line.split("[!.]");
				sentenceCount+=sentenceList.length;
			}
			if(line.equals("")) {
				paragraph++;
			}

		}
		System.out.println("Available Characters in a file are :" + charCount);
		System.out.println("Available Words in a file are :"+wordCount);
		System.out.println("Available Sentences in a file are :"+sentenceCount);
		System.out.println("Available Paragraph in a file are :"+paragraph);
		reader.close();
	}

}
