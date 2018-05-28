// Excercise 4.32: Print Decimal of an Binary Number
import java.util.Scanner;

public class Excercise_4_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt the user to enter a binary
		System.out.print("Please enter a binary number: ");
		int number = input.nextInt();

		// get the decimal positions of the number
		int digits = 0;
		int denominator = 1;
		while (number / denominator != 0) {
			denominator *= 10;
			digits++;
		}

		// calculate the decimal number from the binary number
		// split the numbers
		int counter = 0;
		int total = 0;
		while (counter < digits){
			total = total + (number % 10) * powerOfTwo(counter);
			number /= 10;
			counter++;
		}

		System.out.printf("%d%n", total);

	}

	public static int powerOfTwo(int power) {
		int counter = 0;
		int total = 1;
		while (counter < power){
			total *= 2;
			counter++;

		}

		return total;
	}
}