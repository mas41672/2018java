// Excercise 2.32
// Classification of:
// Negaive, Positive and Zero Values
import java.util.Scanner;

public class Excercise_2_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter five integer numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int number4 = input.nextInt();
		int number5 = input.nextInt();
		int counterNeg = 0;
		int counterZero = 0;
		int counterPos = 0;

		if (number1 < 0 ) {
			System.out.printf("The number %d is smaller than 0.%n", number1);
			counterNeg++;
		}
		if (number1 == 0) {
			System.out.printf("The number %d is equal to 0.%n", number1);
			counterZero++;
		}
		if ( 0 < number1) {
			System.out.printf("The number %d is bigger than 0.%n", number1);
			counterPos++;
		}
		if (number2 < 0 ) {
			System.out.printf("The number %d is smaller than 0.%n", number2);
			counterNeg++;
		}
		if (number2 == 0) {
			System.out.printf("The number %d is equal to 0.%n", number2);
			counterZero++;
		}
		if ( 0 < number2) {
			System.out.printf("The number %d is bigger than 0.%n", number2);
			counterPos++;
		}
		if (number3 < 0 ) {
			System.out.printf("The number %d is smaller than 0.%n", number3);
			counterNeg++;
		}
		if (number3 == 0) {
			System.out.printf("The number %d is equal to 0.%n", number3);
			counterZero++;
		}
		if ( 0 < number3) {
			System.out.printf("The number %d is bigger than 0.%n", number3);
		}
		if (number4 < 0 ) {
			System.out.printf("The number %d is smaller than 0.%n", number4);
			counterNeg++;
		}
		if (number4 == 0) {
			System.out.printf("The number %d is equal to 0.%n", number4);
			counterZero++;
		}
		if ( 0 < number4) {
			System.out.printf("The number %d is bigger than 0.%n", number4);
			counterPos++;
		}
		if (number5 < 0 ) {
			System.out.printf("The number %d is smaller than 0.%n", number5);
			counterNeg++;
		}
		if (number5 == 0) {
			System.out.printf("The number %d is equal to 0.%n", number5);
			counterZero++;
		}
		if ( 0 < number5) {
			System.out.printf("The number %d is bigger than 0.%n", number5);
			counterPos++;
		}
		System.out.printf("Ther are %d negative numbers.%n", counterNeg);
		System.out.printf("There are %d numbers equal zero.%n", counterZero);
		System.out.printf("There are %d positive numbers.%n.", counterPos);
	}
}