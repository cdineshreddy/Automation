package Collections;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateWords {

	public static void main(String[] args) {
		String str = "Welcome to the Java world java the world";
		String[] words = str.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String word:words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		Set<String> wordInString= map.keySet();
		for(String word : wordInString)
			//if(map.get(word)>1) 
				System.out.println(word+" : "+map.get(word));
			
	}

}
