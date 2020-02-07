package InterviewPrograms;

public class Min_Max_Value {

	public static int[] minValue(int[] n) {
		int len = n.length;
		int min = n[0];
		for (int i = 1; i < len; i++) {
			if (n[i] < min) {
				min = n[i];
			}
		}
		return n;
	}

	public static int[] maxValue(int[] n) {
		int len = n.length;
		int max = n[0];
		for (int i = 1; i < len; i++) {
			if (n[i] > max) {
				max = n[i];
			}
		}
		return n;
	}

	public static void main(String[] args) {

		int a[]={1,5,4,3,3};
		System.out.println("Minimum Value of the given array is : "+ minValue(a));
		
	}

}
