package Java8Features;

interface Square{
	public int squareIt(int n);
}

public class SquareTest {

	public static void main(String[] args) {
		
		Square s=n->n*n;
		System.out.println(s.squareIt(6));
	}

}
