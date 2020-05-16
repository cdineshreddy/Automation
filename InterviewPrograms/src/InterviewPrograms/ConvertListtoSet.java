package InterviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListtoSet {

	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(4);
		
		for(int no:list)
		{
			System.out.println(no);//[1,3,5,4,4]
		}
		
		Set<Integer> set=new HashSet<Integer>(list);
		for(int no:set)
		{
			System.out.println(no);//[1,3,5,4]
		}

	}

}
