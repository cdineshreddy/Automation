package JavaPrograms;

public class AlternativeChar {

	public static void main(String[] args) {

		String s1 = "dineshreddy";
		int i=0;
		for(Character ch:s1.toCharArray()) {
			if(i%2==0) {
				System.out.print(Character.toUpperCase(ch));
			}
			else {
				System.out.print(Character.toLowerCase(ch));
			}
			i++;
		}
		System.out.print(" ");
	}
}
