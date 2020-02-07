package InterviewPrograms;


import org.testng.annotations.Test;

public class TestingTestNG {

	
	@Test(priority=2)
	public void test()
	{
		
		System.out.println("First thing");
	}
	
	@Test( invocationCount=3)
	public void test1()
	{
		
		System.out.println("second thing");
	}
}
