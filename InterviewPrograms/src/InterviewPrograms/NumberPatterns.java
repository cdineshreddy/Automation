package InterviewPrograms;

public class NumberPatterns {

	public static void main(String[] args) {

		/*int n = 5;
		int fact = 1;
		if (n <= 0 || n <= 1) {
			System.out.println("Please enter the number except 0 or 1");
		} else {

			for (int i = 1; i < n; i++) {
				fact = fact * i;
			}
		}
		System.out.println(fact);
*/	
		
		int n=8;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if((j==1||j==n)||(i==1||i==n)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
}

}
