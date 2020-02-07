package InterviewPrograms;

class loading extends OverLoading{
	
	public void test(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		OverLoading l=new OverLoading();
		((OverLoading)l).test(10,10);
		l.test(10, 20);
		
	}
	
}
