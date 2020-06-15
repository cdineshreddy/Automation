package JavaPrograms;

public class Vowels {

	public static void findVowel(String str) {

		char ch;
		
		for (int j = 0; j < str.length(); j++) {
			ch = str.charAt(j);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.println("Vowels present in the String: "+ch);
			
			}
		}
		System.out.println();
	}

	public static void countVowel(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("Total available vowels count is :" + count);
	}

	public static void removeVowel(String s) {
		String str = s.replaceAll("[AEIOUaeiou]", "");
		System.out.println("After removing the vowels :" + str);
	}

	public static void main(String[] args) {

		findVowel("Dinesh Reddy");
		countVowel("Selenium", 'e');
		removeVowel("Bangalore");
	}

}
