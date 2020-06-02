package LogialCoding;

class A {
	void method(int i) {
		System.out.println(i);
	}

	void method(Integer i) {
		System.out.println(i);
	}
}

public class Question4 extends A {

	public static void main(String[] args) {
		A a=new A();
		a.method(10);
	}

}
