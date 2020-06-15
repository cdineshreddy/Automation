package JavaPrograms;

class Account {

	private int balance=100;

	public int getBalance() {
		return balance;
	}

	public int setBalance(int amount) {
		return this.balance = this.balance + amount;
	}

}

public class Encapsulation extends Account{

	public static void main(String[] args) {
		
		Encapsulation en=new Encapsulation();
		en.setBalance(10);
		System.out.println(en.getBalance());
		

	}

}
