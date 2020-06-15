package Strings;

public class FindDuplicateString {

	public static void main(String[] args) {
		String str = "Hello Java World and the Selenium World";
		String[] words = str.split(" ");
			for(String word : words) {
				int index = str.indexOf(word);
				int lastIndex = str.lastIndexOf(word);
				if(index!=lastIndex)
					System.out.println(word);
			}

	}

}
