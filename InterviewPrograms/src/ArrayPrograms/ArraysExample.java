package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExample {

	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<Integer>();
		list.add(19);
		list.add(2);
		list.add(5);
		
		Object[]num=list.toArray();
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		List<Object> list1=new ArrayList<>();
		list1=Arrays.asList(num);
		System.out.println(list1);
		
	}

}
