package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collec_Sample {

	static void arraylist() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Dinesh");
		al.add("Amar");
		al.add("Dinesh");
		al.add("Reddy");
		
		
		
		/*Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());*/
			Collections.sort(al);
			Collections.reverse(al);
			for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		}
		
	
	

	static void hashset() {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(20);
		hs.add(15);

		Enumeration<Integer> e=Collections.enumeration(hs);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
		
		static void linkedhashset() {
			LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
			lhs.add(10);
			lhs.add(20);
			lhs.add(30);
			lhs.add(20);
			lhs.add(15);

			for (int ls : lhs) {
				System.out.println(ls);
			}
	}

		static void treeset() {
			TreeSet<Integer> ts = new TreeSet<Integer>();
			ts.add(10);
			ts.add(20);
			ts.add(30);
			ts.add(20);
			ts.add(15);

			Iterator<Integer> itr=ts.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
		static void map()
		{
			Map<Integer,String>m=new TreeMap<Integer,String>();
			m.put(101, "Dinesh");
			m.put(102, "Dinesh");
			m.put(101,"Reddy");
			m.put(103, "Dinesh");
			for(Map.Entry<Integer, String> map:m.entrySet())
			{
				System.out.println(map.getKey()+ " "+map.getValue());
			}
			System.gc();
		}
		
	public static void main(String[] args) {
		
		//arraylist();
		//hashset();
		//linkedhashset();
		treeset();
		//map();
	}

}
