package InterviewPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class DupChar_String {

	public static void main(String[] args) {
		String str="Bangalore";
	
		Set<Character> s=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(!s.contains(c)){
				s.add(c);
				
			}
		}
		System.out.println(s.toString());
	}

}
