package GroovyExamples

class Methods {
	
	int add(int a,int b) {
		int c=a+b;
		return c;
	}
	
	static int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	
	static void main(args) {
		Methods m=new Methods();
		println m.add(10,20);
		println Methods.sub(20,10);
	}
}
