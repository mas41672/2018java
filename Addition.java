// Fig. 2.7: Addition.java
// Addition program that inputs two numbers then displays their sum
import java.util.Scanner;

public class Addition {
	// create a Scanner to obtain input from the command window
	public static void main(String[] args) {
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();

		int sum = number1 + number2; // add numbers, then store total in sum

		System.out.printf("Sum is %d%n", sum); // display sum
	} // end method main
} // end class Addition


