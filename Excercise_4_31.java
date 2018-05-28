// Excercise 4.31: Palindromes
import java.util.Scanner;

public class Excercise_4_31 {
	public static void main(String[] args) {
		// initialize Scanner object
		Scanner input = new Scanner(System.in);

		// prompt the user until he/she enters a five digit number
		int number = 0;

		int denominator = 1;
		int digits = 0;
		while (digits != 5){
			System.out.print("Please enter a five digit integer: ");
			number = input.nextInt();


			// calculate the digits
			// restart the digits and denominator
			denominator = 1;
			digits = 0;
			while (!(number / denominator == 0)) {
				denominator *= 10;
				digits++;
			}
		}

		System.out.printf("The number you have entered is: %d%n", number);

		// program take the number apart
		int firstDigit = number / 10_000;
		// System.out.printf("%d%n", firstDigit);
		int remainder = number % 10_000;
		// System.out.printf("%d%n", remainder);
		int secondDigit = remainder / 1_000;
		//System.out.printf("%d%n", secondDigit);
		remainder %= 1_000;
		// System.out.printf("%d%n", remainder);
		int thirdDigit = remainder / 100;
		// System.out.printf("%d%n", thirdDigit);
		remainder %= 100;
		// System.out.printf("%d%n", remainder);
		int fourthDigit = remainder / 10;
		// System.out.printf("%d%n", fourthDigit);
		int fifthDigit = remainder % 10;
		// System.out.printf("%d%n", fifthDigit);

		if (firstDigit == fifthDigit) {
			if (secondDigit == fourthDigit) {
				System.out.println("The number you have entered is a palindrome!");
			}
		}
		if (firstDigit != fifthDigit) {
			if (secondDigit != fourthDigit) {
				System.out.println("The number you have entered is not a palindorme!");
			}
		}
	}
}