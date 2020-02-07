package InterviewPrograms;

public class TestInheritance {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.eat();
		d.walk();
	}

}

class Dog extends Animal {
	void walk() {
		System.out.println("Walking");
	}
}

class Animal {

	void eat() {
		System.out.println("Eating");
	}
}
