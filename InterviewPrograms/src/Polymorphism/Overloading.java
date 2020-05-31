package Polymorphism;


//number of parameters
//order of parameters
//data type of parameters
public class Overloading {

	public void add(String s) {
		System.out.println("Hello String");
	}

	public void add(Object k) {
		System.out.println("Hello Object");
	}

	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.add("hello");

	}

}
