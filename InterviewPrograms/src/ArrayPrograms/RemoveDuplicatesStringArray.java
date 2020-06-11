package ArrayPrograms;

import java.util.ArrayList;


public class RemoveDuplicatesStringArray {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		String str[] = {"Yellow","RED","red","Yellow","Green"};
		for(int i=0;i<str.length;i++) {
			if(!al.contains(str[i])) {
				al.add(str[i]);
			}
		}
		System.out.println(al.toString());
	}

}
