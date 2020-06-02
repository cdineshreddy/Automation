package InterviewPrograms;

public class Min_Max_Value {

	public static void minValue(int[] n) {
		int len = n.length;
		int min = n[0];
		for (int i = 1; i < len; i++) {
			if (n[i] < min) {
				min = n[i];
			}
		}
		System.out.println(min);
	}

	public static void maxValue(int[] n) {
		int len = n.length;
		int max = n[0];
		for (int i = 1; i < len; i++) {
			if (n[i] > max) {
				max = n[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		int a[]={1,5,4,3,3};
		maxValue(a);
		minValue(a);
		
	}

}
