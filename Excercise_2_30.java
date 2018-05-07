// Excercise 2.30
// Separating the Digits in an integer
// Tools:
//	Standard input object
//	division and modulus operator
// Strategy: 
// Rip of first digit by dividing with decimal number
// reduce number with modulu operator
import java.util.Scanner;

public class Excercise_2_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int digit1, digit2, digit3, digit4, digit5;

		System.out.print("Please enter a five digit number: ");
		int fiveDigits = input.nextInt();
		
		digit5 = fiveDigits / 10000;
		int digits = fiveDigits % 10000;
		digit4 = digits / 1000;
		digits = digits % 1000;
		digit3 = digits / 100;
		digits = digits % 100;
		digit2 = digits / 10;
		digits = digits % 10;
		digit1 = digits / 1;
		System.out.printf("%d   %d   %d   %d   %d%n", digit5, digit4, digit3, digit2, digit1);

	}
}