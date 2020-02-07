package InterviewPrograms;

public class Vowels {

	public static void main(String[] args) {

		String s = "selenium";		
		System.out.println("Vowel is " + loop(s, 'e'));

		// for (int i = 0; i < s.length(); i++) {
		// if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) ==
		// 'i') || (s.charAt(i) == 'o')
		// || (s.charAt(i) == 'u')) {
		// System.out.println("Vowel is " + loop(s, 's'));
		// }
		// }

	}

	public static int loop(String s, char val) 
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == val)) {
				count++;
			}
		}
		return count;
	}

}

