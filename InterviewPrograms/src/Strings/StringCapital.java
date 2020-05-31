package Strings;

public class StringCapital {

	public static void main(String[] args) {
		
		String s="dinesh reddy";
		String s1=" ";
		String[] str=s.split(" ");
		for(String word:str) {
			 s1=s1+Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
		}
		System.out.println(s1.trim());
	}
}
