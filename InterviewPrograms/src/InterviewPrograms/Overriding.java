package InterviewPrograms;

public class Overriding {

	public static void main(String[] args) {

		// Animals actions=new Animals();
		// actions.eat();
		// actions.walk();
		Animals action = new Human();//Child can act like a parent
		action.eat();
		action.walk();
		action.sound();

	}

}

class Animals {
	protected void eat() {
		System.out.println("Eating");
	}

	public  void walk() {
		System.out.println("Walking");
	}

	public void sound() {
		System.out.println("Animal can give sound");
	}

}

class Human extends Animals {

	public void eat() {
		System.out.println("Human can eat");
	}

	public void  walk() {
		System.out.println("Human can walk");
	}

	public void talk() {
		System.out.println("Human can speak");
	}
}
