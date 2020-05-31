package Polymorphism;

class Bank {

	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {

	int getRateOfInterest() {
		return 10;
	}
}

class ICICI extends Bank {

	int getRateOfInterest() {
		return 11;
	}
}

class Axis extends Bank {

	int getRateOfInterest() {
		return 12;
	}
}

public class Overriding {

	public static void main(String[] args) {

		Bank s = new SBI();
		System.out.println(s.getRateOfInterest());

		Bank i = new ICICI();
		System.out.println(i.getRateOfInterest());

		Bank a = new Axis();
		System.out.println(a.getRateOfInterest());

	}

}
