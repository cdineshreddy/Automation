package InterviewPrograms;

public class SampleProgram {
	
	public  void m(String str)
	{
		System.out.println("String");
	}
	
	public  void m(int obj)
	{
		System.out.println("Object");
	}

	public static void main(String[] args) {
		
		SampleProgram sp=new SampleProgram();
		sp.m(10);

		
	}

}
