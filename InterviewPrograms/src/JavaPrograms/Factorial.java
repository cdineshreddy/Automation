
package JavaPrograms;

import java.io.PrintStream;

public class Factorial {

	public static void main(String[] args) {

		int n = 5;
		int f = 1;
		if (n == 0 || n == 1) {
			System.out.println("Please enter the number other than 0 & 1");
		} else {
			for (int i = 1; i <= n; i++) {
				f = f * i;
			}
			PrintStream stream = new PrintStream(System.out);
					stream.println(f);
					stream.flush();
		}
			
	}

}
