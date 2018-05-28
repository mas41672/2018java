// Excercise 4.38: b) e number
import java.util.Scanner;

public class Excercise_4_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(
			"Please enter the terms for calculating the e term: ");
		int terms = input.nextInt();
		int counter = 0;
		double e = 0;
		while (counter < terms) {
			e += 1/(double) factorial(counter);
			counter++;
		}

		System.out.printf(
			"The the e constant calculate with %d terms is: %.10f%n",
				terms, e);
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
}