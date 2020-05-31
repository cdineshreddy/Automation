package Strings;

public class RevSentence {

	public static void main(String[] args) {

			String s="What is your Name";
			
			String[] words=s.split(" ");
			String revString=" ";
			
			for(int i=0;i<words.length;i++) {
				String word=words[i];
				String revWord=" ";
				
				for(int j=word.length()-1;j>=0;j--) {
					revWord=revWord+word.charAt(j);
					
				}
				
				revString=revString+revWord+" ";
				
			}
			System.out.println(revString);
	}


}
