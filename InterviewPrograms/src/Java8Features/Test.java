package Java8Features;

@FunctionalInterface // If we use functional interface then compiler will allow only one Abstract method.	
interface Simple{
	
	public void m1();
}


public class Test {

	public static void main(String[] args) {
	
			//This lambda expression we can use only with Functional interfaces only
			Simple s= ()->System.out.println("Hello Lambda Expression.....");
			s.m1();
	}

}
