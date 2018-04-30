// Excercise 2.15
// Feat: Input two integers and do arithmetic
import java.util.Scanner;

public class Excercise_2_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int integer1 = input.nextInt();

		System.out.print("Enter second integer: ");
		int integer2 = input.nextInt();

		int sum = integer1 + integer2;
		int product = integer1 * integer2;
		int diff = integer1 - integer2;
		int quotient = integer1 / integer2;

		System.out.printf("%nThe sum is: %d", sum);
		System.out.printf("%nThe product is: %d", product);
		System.out.printf("%nThe difference is: %d", diff);
		System.out.printf("%nThe quotient is: %d%n", quotient);
	}
}