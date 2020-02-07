package NewPrograms;

public class RemoveDupChar {

	public static void main(String[] args) {

		String s="Bangalore";
		for(char ch: s.toCharArray()) {
			int index= s.indexOf(ch);
			int lastIndex = s.lastIndexOf(ch);
			if(index==lastIndex) {
				System.out.println(ch);
			}
		}

	}

}
