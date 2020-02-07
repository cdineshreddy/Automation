package NewPrograms;

public class RemoveVowels {

	public static void main(String[] args) {

		String s = "Hello Java World";
		String s1 = s.replaceAll("[AEIOUaeiou]", "");
		System.out.println(s1);
	}

}
