// Excercise 2.25
// Determine if number is odd or even
// - if selection statement
// - modulus operator
import java.util.Scanner;

public class Excercise_2_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(
			"Determine if number is odd or even. \nEnter a number: ");
		int number = input.nextInt();

		if ( 0 == (number % 2)) {
			System.out.println("The number you entered is even.");
		}
		if ( 0 != (number % 2)) {
			System.out.println("The number you entered is odd.");
		}
	}
}