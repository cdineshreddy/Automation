package InterviewPrograms;

public class ExceptionExample {

	public static void main(String[] args) {
		
		try{
			int x=0;
			int y=5/x;
			System.out.println(y);
		
		}catch(ArithmeticException ae){
			System.out.println("Arthematic Exception");
		}catch(Exception e)
		{
			System.out.println("Arthematic Exception in Main");
		}
		System.out.println("Executed");
	}

}
