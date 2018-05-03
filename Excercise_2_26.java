// Excercise 2.26
// Application determines whether the first number is a multiple of 
// the second
import java.util.Scanner;

public class Excercise_2_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Determines if first number is a multiple of the second."); 
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();

		if ((number1 % number2) == 0) {
			System.out.printf("The first number '%d' is a multiple of '%d'.%n", number1, number2);
		}
		if ((number1 % number2) != 0) {
			System.out.printf("The first number '%d' is not a multiple of '%d'.%n", number1, number2);
		}
	}
}