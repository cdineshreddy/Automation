package NewPrograms;

public class StaticKeyword {

	int eno;
	String ename;
	static int deptNo=10;
		
		public void display(int no,String name ) {
			System.out.println(no+" : "+name);
			
		}
	
	public static void main(String[] args) {
		StaticKeyword sk=new StaticKeyword();
		sk.display(1, "Dinesh");
		System.out.println(deptNo);
		
		StaticKeyword sk1=new StaticKeyword();
		sk1.display(2, "Reddy");
		System.out.println(deptNo);
	}

}
