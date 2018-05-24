// Excercise 4.21
// Find the largest number

import java.util.Scanner;

public class Excercise_4_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int counter = 1;
		int counterLargest = 0;
		double largest = 0.0;

		System.out.print("Please enter the sale: ");
		double sale = input.nextDouble();

		if (largest < sale) {
				largest = sale;
				counterLargest = counter;
			}

		while ( counter < 10) {
			counter++;

			System.out.print("Please enter the sale: ");
			sale = input.nextDouble();

			if (largest < sale) {
				largest = sale;
				counterLargest = counter;
			}

		}

		System.out.printf(
			"%nThe largest value entered is: %.2f at %dth position ...%n",
			largest, counterLargest);
	}
}