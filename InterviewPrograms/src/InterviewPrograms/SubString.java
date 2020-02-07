package InterviewPrograms;

public class SubString {

	public static void main(String[] args) {

		String s = "Welcome to Dinesh(1986)";
		System.out.println(s.substring(1));
		String s1 = s.substring(s.indexOf("(")+1, s.indexOf(")"));
		System.out.println(s1);
		
		String[] s2=s.split("o");
		for(String output:s2)
		System.out.println(output);
	}

}

