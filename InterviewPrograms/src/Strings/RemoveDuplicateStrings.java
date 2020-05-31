package Strings;
import java.util.*;

public class RemoveDuplicateStrings {

	public static void main(String[] args) {
		
		String[] s= {"red","green","yellow","red","GREEN"};
		
		List<String> list=Arrays.asList(s);
		Set<String> colors=new LinkedHashSet<String>(list);		
		System.out.println(colors);


	}

}
