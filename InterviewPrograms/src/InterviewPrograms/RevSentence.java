package InterviewPrograms;

public class RevSentence {

	public static void main(String[] args) {

			String s="What is your Name";
			String rev=" ";
			int count=0;
			String[] s1=s.split(" ");
			int len=s1.length;
			for(int i=len-1;i>=0;i--)
			{
				rev=rev+s1[i]+" ";
				count=rev.length();
			}
			System.out.println(rev);
			System.out.println(count);
	}

}
