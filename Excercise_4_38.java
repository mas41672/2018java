// Excercise 4.38: Factorial
import java.util.Scanner;

public class Excercise_4_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(
			"Please enter a number to calculate the factorial: ");
		int number = input.nextInt();
		int factorial = 1;

		if ( number == 0)
			factorial = 1;
		else {
			int counter = 1;
			while ( counter <= number) {
				factorial *= counter;
				counter++;
			}
		}

		System.out.printf("The factorial of the number is: %d%n", factorial);
	}
}