package InterviewPrograms;

public class SplitProgram {
	
	public static void main(String args[])
	{
		
		String s1="GoodMorning";
		//String replace=s1.replace("Morning", " ");
		//String[] s2= replace.split(" ");
		//for(int i=0;i<s2.length;i++)
		//System.out.println(s2[i]);
		
		String s2=s1.substring(0, 4);
		//System.out.println(s2);
		String s3=s2.substring(0, 2);
		//System.out.println(s3);
		StringBuffer sb=new StringBuffer(s3);
		StringBuffer s5= sb.reverse();
		
		String s4=s2.substring(2, 4);
		//System.out.println(s4);
		StringBuffer sb1=new StringBuffer(s4);
		StringBuffer s6= sb1.reverse();
		
		System.out.println(s5+""+s6);
	}

}
