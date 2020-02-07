package InterviewPrograms;

import java.util.Scanner;

public class IntegerPallindrome {

	public static void main(String args[]) throws Exception
	{
	Scanner s=new Scanner(System.in);
	int num= s.nextInt();
	int n = num; 
	int reverse=0,remainder;
	while(num > 0){
		remainder = num % 10;
		reverse = reverse * 10 + remainder;
		num = num / 10;
		
	}
	if(reverse == n)
		System.out.println(n+" is a Palindrome Number");
	else
		System.out.println(n+" is not a Palindrome Number");
	
	s.close();
}
	
}

