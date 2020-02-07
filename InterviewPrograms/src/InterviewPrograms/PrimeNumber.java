package InterviewPrograms;

import java.util.Scanner;

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

		System.out.println("Please enter any number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int temp;
		boolean isPrime = false;

		for (int i = 2; i <= num / 2; i++) {
			{
				temp = num % i;
				if (temp == 0) {
					isPrime = true;
					break;
				}
			}
		}
		if (!isPrime) {
			System.out.println("Given number is a prime");
		} else {
			System.out.println("Given number is not a prime");
		}
	}

	public static void main(String args[]) {

		PrimeNumber.prime2();

	}

}
