package JavaPrograms;


//We cannot create an object in interface as interface should have abstract methods
interface Bank {
	
	public abstract void bankName();
	public abstract void depositMoney();
	public abstract void withDrawMoney();
	public static final int i=10;//By default variables in interface should be public/default static final
}

class SBI implements Bank
{

	@Override
	public void bankName() {
		System.out.println("SBI Bank");
		
	}

	@Override
	public void depositMoney() {
		System.out.println("Daily deposit limit : 50000");
		
	}

	@Override
	public void withDrawMoney() {
		System.out.println("Daily withdraw amount limit is : 40000");
	}
	
}

class HDFC implements Bank
{

	@Override
	public void bankName() {
		System.out.println("HDFC Bank");
		
	}

	@Override
	public void depositMoney() {
		System.out.println("Daily deposit limit : 100000");
		
	}

	@Override
	public void withDrawMoney() {
		System.out.println("Daily withdraw amount limit is : 100000");
	}
	
}

public class InterfaceExample
{
	public static void main(String[] args) {
		Bank bank=new SBI();
		bank.bankName();
		bank.depositMoney();
		bank.withDrawMoney();
		
		Bank bank1=new HDFC();
		bank1.bankName();
		bank1.depositMoney();
		bank1.withDrawMoney();
	}
}