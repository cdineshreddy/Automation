package InterviewPrograms;

public class SortingNumbers {

	public static void main(String[] args) {
		sortArray();
//		int a[]={1,2,5,2,7};
//		int temp;
//		int size=a.length;
//		for(int i=0;i<size;i++)
//		{
//			for(int j=i+1;j<size;j++)
//			{
//				if(a[i]==a[j])
//				{
//					while(j<(size)-1)
//					{
//						a[j]=a[j+1];
//						j++;
//					}
//					size--;
//					
//				}
//			}
//		}
//			for(int k=0;k<size;k++)
//			{
//			System.out.println(a[k]);
//			}

	}
	
	public static void sortArray()
	{
		int a[]={1,0,1,0,1};
		int temp=0;
		int len=a.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int k=0;k<len;k++)
		System.out.println(a[k]);
	}

}
