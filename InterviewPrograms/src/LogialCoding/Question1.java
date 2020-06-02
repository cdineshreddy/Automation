package LogialCoding;

public class Question1 {
	
	Question1 q = new Question1();
	
	public int show() {
		return 1;
	}
	
	public static void main(String[] args) {
		
		Question1 q = new Question1();
		System.out.println(q.show());
	}

}
/*Whenever we create the object of any class constructor will be called first and memory allocated
	for all the non static variables. Here  Question1 q= new Question1(); variable is object and 
	assigned to new object of same class. Question1 q= new Question1(); statement leads to recursive 
	execution of constructor will create infinite objects so at run time an exception will be raised.
Exception in thread "main" java.lang.StackOverflowError*/