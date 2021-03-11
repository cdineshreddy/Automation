package ArrayPrograms;

public class ArraySort {

	public static void main(String[] args) {

		int a[] = { 1, 2, 0, 2, 0, 2, 1 };
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				i = -1;
			}
		}
		for (int k = 0; k < a.length; k++)
			System.out.println(a[k]);
	}

}
