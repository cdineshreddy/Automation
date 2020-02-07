package InterviewPrograms;

class Sample{
	
	public int test(int num){
		System.out.println("This is int type");
		return  num;
		
	}
	
	public Object test(Object name){
		System.out.println("This is Object type "+ name);
		return name;
		
	}
}

class Sample1 extends Sample{
	
	public Object test(Object name){
		System.out.println("This is Object type : "+ name);
		return name;
		
	}

}
public class PolymorphismExample {

	public static void main(String[] args) {
		
		Sample1 s=new Sample1();
		s.test("Dinesh");

	}

}
