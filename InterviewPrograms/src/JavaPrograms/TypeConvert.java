package JavaPrograms;

public class TypeConvert {

	public static void main(String[] args) {
	
		int i=10;		
		String s=Integer.toString(i);
		System.out.println(s);
		String s1=String.valueOf(i);
		System.out.println(s1);
		
		int n=Integer.parseInt(s);
		System.out.println(n);
		
		String str="Dinesh";
		char[] ch=str.toCharArray();
		for(int j=0;j<ch.length;j++) {
			System.out.println(ch[j]);
		}
		
		char c[]= {'D','i','n','e','s','h'};
		for(int k=0;k<c.length;k++) {
		String s2=Character.toString(c[k]);
		System.out.print(s2);
		}
		
	}

}
