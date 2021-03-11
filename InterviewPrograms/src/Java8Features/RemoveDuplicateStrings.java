package Java8Features;

import java.util.Arrays;

public class RemoveDuplicateStrings {

	public static void main(String[] args) {

		String[] colors = { "Green", "Green", "Yellow", "Red", "Blue", "Blue" };
		colors = Arrays.stream(colors).distinct().toArray(String[]::new);
		System.out.print(Arrays.toString(colors));

	}

}
