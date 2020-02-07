package InterviewPrograms;

public class MethodEx1 {

	public static void main(String[] args) {
		
		MethodEx1 m=new MethodEx1();
		m.test(10,20,10);
		
	}
	
	public void test(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void test(int x, int y, int z)
	{
		int d=x+y+z;
		System.out.println(d);
	}
	
}
