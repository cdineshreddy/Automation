package JavaPrograms;

public class DuplicateElementArray {

	public static void main(String[] args) {

		int count = 0;
		int[] a = { 1, 1, 1, 1, 2, 5, 3, 2, 6, 7, 9 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1)
				System.out.println(a[i]);
			count = 0;
		}
	}

}
