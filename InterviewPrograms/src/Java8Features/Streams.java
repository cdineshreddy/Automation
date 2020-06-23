package Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(34);
		list.add(25);
		list.add(23);
		List<Integer> l = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even numbers : "+l);
	}

}
