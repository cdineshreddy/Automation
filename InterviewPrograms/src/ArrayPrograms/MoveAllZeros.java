package ArrayPrograms;

public class MoveAllZeros {

	public static void main(String[] args) {
		
		int[] a= {1,5,6,0,2,0,5,6};
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				int temp=a[i];
				a[i]=a[k];
				a[k]=temp;
				k++;
			}
		}
		for(int j=0;j<a.length;j++)
		System.out.println(a[j]);
	}

}
