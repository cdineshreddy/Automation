package LogialCoding;

public class Question2 {

	public static void show() {
		System.out.println("Static method called");
	}
	
	public static void main(String[] args) {
		Question2 q = null;
		q.show();

	}

}
/* We can call static methods using reference variable which is pointing to null because static 
 * methods are class level so we can either call using class name and reference variable which is 
 * pointing to null.
 */