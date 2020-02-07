package InterviewPrograms;

public class OverLoading extends testClass {

	public static void mian(String[] args) {

		OverLoading t = new OverLoading();
		t.test("Dinesh");

	}

}

class testClass {

	public void test(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
		
	public void test(String s) {

		System.out.println(s);
	}

}
