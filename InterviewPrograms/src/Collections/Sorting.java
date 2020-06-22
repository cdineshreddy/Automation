package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		
		if(i1>i2)
			return -1;
		else if(i1<i2)
			return +1;
		else
			return 0;
	}
	
}

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(21);
		list.add(16);
		//By default it will display Ascending order
		Collections.sort(list, new MyComparator());
		System.out.println(list);

	}

}
