package InterviewPrograms;

public abstract class _abstract {

 abstract void test();

	public void test1() {
		System.out.println("This is not abstract method");
	}

}

class TestAbstract extends _abstract {
	public void test() {
		throw new UnsupportedOperationException();
	}

}

class testRunner extends TestAbstract
{
	public static void main(String[] args) {
		
		testRunner tr=new testRunner();
		tr.test();
	}
}