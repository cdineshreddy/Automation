package JavaPrograms;

class A {
	public A() {

		this(5);
		System.out.println("Parent Class");

	}

	public A(int i) {
		this(5, 10);
		System.out.println(i);//5
	}

	public A(int i,int j) {

		System.out.println(i*j);//50
	}
}

public class ConstructorConcept extends A {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		ConstructorConcept cc = new ConstructorConcept();
		cc.finalize();

	}

}
