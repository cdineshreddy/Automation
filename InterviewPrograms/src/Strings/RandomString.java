package Strings;

import java.util.Random;

public class RandomString {

	public static void main(String[] args) {
		
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
		//StringBuilder sb=new StringBuilder();
		String sb="";
		int length=10;
		Random r=new Random();
		for(int i=0;i<length;i++){
			//sb.append(str.charAt(r.nextInt(str.length())));
			 sb=sb+str.charAt(r.nextInt(str.length()));
			
		}
		System.out.println(sb);

	}

}
