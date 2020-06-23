package Java8Features;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
		
		/*Predicate<Integer>p1= i->i%2==0;
		System.out.println(p1.test(4));*/
		String[] str = {"Dinesh","Suresh","Ram","GopiChand","Suman"};
		Predicate<String> p = s->(str.length>5);
		for(String s : str){
			if(p.test(s)){
				System.out.println(s);
			}
		}
	}

}
