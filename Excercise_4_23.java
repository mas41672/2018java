// Excercise 4.23
// Find the two largest values of ten values entered.
// Notice: Input each number only once.
import java.util.Scanner;

public class Excercise_4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double largest = 0.0;
		double secondLargest = 0.0;

		System.out.print("Please enter the sale: ");
		double sale = input.nextDouble();
		largest = sale;
		int counter = 1;

		while ( counter < 10) {
			counter++;

			System.out.print("Please enter the sale: ");
			sale = input.nextDouble(); // second sale

			if (largest < sale) { // line 27 give the actual largest to the second...
				secondLargest = largest; // largest before it disappears
				largest = sale;
			}

			if (secondLargest < sale) {
				if (sale < largest) {
					secondLargest = sale;
					System.out.printf("#2The second largest number is now %.2f%n", secondLargest);
				}
			}
		}

		System.out.printf(
			"%nThe largest value entered is: %.2f at %n",
			largest);
		System.out.printf("The second largest value is: %.2f%n", secondLargest);
	}
}