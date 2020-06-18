package Java8Features;

interface AddNumbers{
	
	public void add(int a, int b);
}

public class AddTest {

	public static void main(String[] args) {
	
		AddNumbers s=(a,b)->System.out.println("The Sum is :"+(a+b));
		s.add(10, 10);
	}

}
