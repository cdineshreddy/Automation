package JavaPrograms;

import java.util.Scanner;

public class Fibbonanci {

	public static void main(String args[])
	{
		int a=0, b=1;
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		for(int i=1;i<=number;i++)
		{
			System.out.println(a);
			a=a+b;
			b=a-b;
			}
		s.close();
	}
	
}
