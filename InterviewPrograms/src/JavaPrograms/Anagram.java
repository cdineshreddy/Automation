package JavaPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "Dinesh Reddy";
		String s2 = "Reddy Dinesh";
		String copys1 = s1.replaceAll("\\s", "").toLowerCase();
		String copys2 = s2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;

		if (copys1.length() != copys2.length()) {
			status = false;
		} else {

			char[] s1array = copys1.toCharArray();
			char[] s2array = copys2.toCharArray();

			Arrays.sort(s1array);
			Arrays.sort(s2array);

			status = Arrays.equals(s1array, s1array);
		}

		if (status) {
			System.out.println(s1 + " and " + s2 + " are equal");
		} else {
			System.out.println(s1 + " and " + s2 + " are not equal");
		}

	}

}
