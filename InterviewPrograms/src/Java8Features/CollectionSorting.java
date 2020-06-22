package Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(15);
		System.out.println("Before sorting the elements: "+list);
		Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?+1:0;//Ternary operator
		Collections.sort(list, c);
		System.out.println("After sorting the elements: "+list);
	}

}
