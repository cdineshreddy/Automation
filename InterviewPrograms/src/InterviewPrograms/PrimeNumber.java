package InterviewPrograms;

public class PrimeNumber {

	static void prime1() {

		int n = 5;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a prime number");
		}
	}

	static void prime2() {
		
		boolean flag = false;
		int n=10;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("Given number is not prime");
		}else {
			System.out.println("Given numbe is prime");
		}
		
	}
	public static void main(String args[]) {

		PrimeNumber.prime2();

	}

}
