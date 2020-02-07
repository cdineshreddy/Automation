package InterviewPrograms;

public class Test_Encapsulation {
	
	private String name;
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void main(String[] args) {
		
		Test_Encapsulation te=new Test_Encapsulation();
		te.setName("Dinesh");
		System.out.println(te.getName());
	}

}
