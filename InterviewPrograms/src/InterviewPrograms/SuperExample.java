package InterviewPrograms;

class Domestic {
	public void bark() {
		System.out.println("Animal Bark()");
	}
}

class Rat extends Domestic {
	public void bark() {
		super.bark();
		System.out.println("Dog Bark()");
	}
}

class Cat extends Rat {

	public void bark() {
		super.bark();
		System.out.println("Cat Bark()");
	}
}

public class SuperExample {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.bark();

	}

}
