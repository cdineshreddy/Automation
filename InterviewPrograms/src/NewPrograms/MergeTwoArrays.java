package NewPrograms;

public class MergeTwoArrays {

	public static void main(String[] args) throws Exception{
	
		int a[]= {1,2,3};
		int b[]= {1,2,3,5};
		
		int c[]=new int[a.length+b.length];
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			count++;
		}
		for(int j=0;j<b.length;j++) {
			c[count++]=b[j];
		}
		for(int k=0;k<c.length;k++) {
			System.out.print(c[k]+",");
		}
	}

}
