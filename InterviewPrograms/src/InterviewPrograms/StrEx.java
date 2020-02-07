package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StrEx {

	public static String str = new String("dahhuidd");
	public static String output = new String();

	public static void main(String[] args) {
		// strReverese();
		strDuplicate();
		
	}

	public static void strReverese() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a name to reverse");
		String name = s.nextLine();
		String rev = " ";
		int length = name.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println("Reverse of a string is " + rev);
		s.close();
	}

	public static void strDuplicate() {

		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (!m.containsKey(c)) {

				m.put(c, 1);

			} else {
				m.put(c, m.get(c)+1);
				
			}
				
		}

		// System.out.println(m);
		for (Entry<Character, Integer> map : m.entrySet()) {
			System.out.println(map.getKey() + " :" + map.getValue());
			
		}
		
	}
}
