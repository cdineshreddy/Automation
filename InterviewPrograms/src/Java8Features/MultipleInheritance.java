package Java8Features;

interface left {
	default void test() {
		System.out.println("Left interface implemented");
	}
}

interface right {
	default void test() {
		System.out.println("Right interface implemented");
	}
}

public class MultipleInheritance implements left, right {

	public void test() {
		left.super.test();
		right.super.test();
	}

	public static void main(String[] args) {
		MultipleInheritance m = new MultipleInheritance();
		m.test();
		
	}

}
