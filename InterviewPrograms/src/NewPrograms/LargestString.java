package NewPrograms;

public class LargestString {

	public static void main(String[] args) {
	
		String a[]= {"Dinesh","Reddy","Chinakampalle"};
		int len=0;
		String longest=" ";
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>len) {
				len=a[i].length();
				longest=a[i];
			}
		}
		System.out.println(longest);

	}

}
