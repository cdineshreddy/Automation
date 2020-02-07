package InterviewPrograms;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String reverse="";
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			 reverse=reverse+s.charAt(i);
		}
		if(s.equals(reverse))
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not a pallindrome");
		}
		scan.close();
	}

}
