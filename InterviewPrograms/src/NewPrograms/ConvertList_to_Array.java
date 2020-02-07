package NewPrograms;

import java.util.ArrayList;
import java.util.List;

public class ConvertList_to_Array {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Dinesh");
		list.add("Reddy");

		Object[] array = list.toArray();
		for (Object obj : array) {
			System.out.println(obj);
		}

	}

}
