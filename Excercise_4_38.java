// Excercise 4.38: c) e^x function - shifted iteration
import java.util.Scanner;

public class Excercise_4_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(
			"Please enter the terms for calculating the e^x function value: "
				);
		int terms = input.nextInt();
		System.out.print(
			"Please enter the x value for the e^x function calculation: ");
		double x = input.nextDouble();

		int counter = 0;
		double e_x = 0.0;
		while (counter < terms) {
			e_x += toThePower(x, counter) / (double) factorial(counter);
			counter++;
		}

		System.out.printf(
			"The the e^x function value with %d terms is: %.10f%n",
				terms, e_x);
	}

	public static int factorial(int number) {
		if (number == 0) {
			return 1;
		}
		else {
			int  counter = number;
			int  total = 1;
			while (1 < counter) {
				total *= counter;
				counter--;
			}
			return total;
		}
	}

	public static double toThePower(double x, int power) {
		if (power == 0) {
			return 1.0;
		}
		else {
			int counter = 1;
			double total = 1;
			while (counter <= power) {
				total *= x;
				counter++;
			}

			return total;
		}
	}
}