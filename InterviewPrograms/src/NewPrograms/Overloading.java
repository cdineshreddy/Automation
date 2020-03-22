package NewPrograms;

class test{
	
	public void add(String s) {
		System.out.println("Hello String");
	}
	
	public void add(Object k) {
		System.out.println("Hello Object");
	}
}



public class Overloading extends test {

	public static void main(String[] args) {
			Overloading o=new Overloading();
			o.add(true);
			
		
	}

}
