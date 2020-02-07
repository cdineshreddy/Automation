package InterviewPrograms;

public class TypeConversions {

	public static void main(String[] args) {

		String s = "10";
		String f = "10.5";
		String c = "d";
		int i = Integer.parseInt(s);
		System.out.println(i);
		float ff = Float.parseFloat(f);
		System.out.println(ff);
		char cc = c.charAt(0);
		System.out.println(cc);
		String ss = Integer.toString(i);
		String sc = Character.toString(cc);
		System.out.println(ss);
		System.out.println(sc);
	}

}
