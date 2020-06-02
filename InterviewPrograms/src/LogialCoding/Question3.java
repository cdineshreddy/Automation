package LogialCoding;

public class Question3 {
	
	static int a=11;
	static {
		a=a-- - --a;
	}
	{
		a=a++ + ++a;
		//This block is not executing
	}
	public static void main(String[] args) {
		System.out.println(a);

	}

}
