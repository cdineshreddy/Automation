package InterviewPrograms;


public class TryCatch {
	
	public static void main(String[] args) {
		int i=0,j=1;
		
		try
		{
			System.out.println("one");
			i=j/i;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(0);//if we use this command system wont execute finally block
		}
		
		finally
		{
			System.out.println("second");
		}
		
	}

	

}
