package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListInterface {

	public static void main(String[] args) {
		
		ArrayList<String> l=new ArrayList<String>();
		l.add("Dinesh");
		l.add("Reddy");
		l.add("Chinakampalle");
		
		//Using the Iterator
				Iterator<String> itr = l.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
					
				}
				
				//Using the for each loop
				for(String s:l) {
					System.out.println(s);
				}
		
		//Traversing the list order
		ListIterator<String> itr1= l.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		while(itr1.hasPrevious()){
		System.out.println(itr1.previous());	
		}
	}

}
