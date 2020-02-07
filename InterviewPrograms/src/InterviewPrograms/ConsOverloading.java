package InterviewPrograms;

public class ConsOverloading {
	
	public ConsOverloading() {
		
		System.out.println("Default Constructor");
	}
	
	ConsOverloading(int a, int b)
	{
		this();//this command will use to call the constructor.
		System.out.println(a+b);
	}

	
	public static void main(String[] args) throws Throwable {
		
		ConsOverloading cl=new ConsOverloading(10, 20);
		cl.finalize();
	}
}
